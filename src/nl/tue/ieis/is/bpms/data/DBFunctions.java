package nl.tue.ieis.is.bpms.data;

import java.io.File;
import java.io.StringReader;
import java.util.Map.Entry;

import nl.tue.ieis.is.bpms.model.BPMSTable;

import org.jbibtex.BibTeXDatabase;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.BibTeXParser;
import org.jbibtex.Value;

import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Table;

public class DBFunctions {
	
	public static String addNewBibTex(String bibTex, int citation, String db, boolean isUndownloadbale, boolean isDuplicated) {
		StringReader reader = new StringReader(bibTex);
		BibTeXParser bibtexParser = new BibTeXParser();
		try {
			Table table = DatabaseBuilder.open(new File(Config.DB_Location)).getTable(Config.DB_Name);
			BibTeXDatabase database = bibtexParser.parse(reader);
			BPMSTable paper = new BPMSTable();
			for(Entry<org.jbibtex.Key, BibTeXEntry> entry : database.getEntries().entrySet()) {
				paper.setId(entry.getKey().getValue());
				
				for(Entry<org.jbibtex.Key, Value> field : entry.getValue().getFields().entrySet()) {
					if(field.getKey().getValue().contentEquals("title"))
						paper.setTitle(field.getValue().toUserString());
					
					else if(field.getKey().getValue().contentEquals("author"))
						paper.setAuthors(field.getValue().toUserString());
					
					else if(field.getKey().getValue().contentEquals("journal") || field.getKey().getValue().contentEquals("booktitle"))
						paper.setSource(field.getValue().toUserString());
					
					else if(field.getKey().getValue().contentEquals("year"))
						paper.setYear(Integer.parseInt(field.getValue().toUserString()));
				}
			}
			
			paper.setCitation(citation);
			paper.setDatabase(db);
			paper.setUndownloadable(isUndownloadbale);
			paper.setSearchTermAutomatically();
			
			if(isDuplicated) {
				paper.setDuplication_measure(true);
				paper.setId(paper.getId() + paper.getDatabase());
			}
			
			paper.setSystem_aggregation(-1);
			paper.setAbstraction(-1);
			paper.setData_aggregation(-1);
			paper.setRealization(-1);
			
			table.addRow(paper.getId(), paper.getSearchTerms(), paper.getTitle(), paper.getAuthors(), paper.getYear(), paper.getCitation(),
					paper.isStatus(), paper.getReference_architecture(), paper.getNonreference_architecture(), paper.getData_aggregation(),
					paper.getAbstraction(), paper.getRealization(), paper.getStyle(), paper.getEvaluation(), paper.getLayering(), 
					paper.getRequirements(), paper.getDescription(), paper.getDatabase(), paper.getSource(), paper.getFile(), paper.isTimeCitation_measure(),
					paper.isDuplication_measure(), paper.getSystem_aggregation(), paper.isUndownloadable(), paper.getReason());
			
			return "";
		} catch (Exception e) {
			//e.printStackTrace();
			return e.getMessage();
		}
	}
}
