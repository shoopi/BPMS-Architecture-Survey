package nl.tue.ieis.is.bpms.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import nl.tue.ieis.is.bpms.model.TimeCitation;

import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;

public class CitationPeriodMeasure {
	public static void main(String[] args) {
		Table table;
		try {
			table = DatabaseBuilder.open(new File("C:\\Users\\spourmir\\Dropbox\\Archirecture Literature Survey\\Sander - Shaya - Remco\\Database11.accdb")).getTable("BPMS_ARCH");
			ArrayList<TimeCitation> allNotDupArticles = new ArrayList<TimeCitation>();
			for(Row row : table) {
				if(!(boolean) row.get("duplication_measure")) {
					allNotDupArticles.add(new TimeCitation((int) row.get("year"), (int) row.get("citation")));
				}
			}
			
			int total_period1 = 0, total_period2 = 0, total_period3 = 0;
			int count_period1 = 0, count_period2 = 0, count_period3 = 0;
			
			//Note that we apply this time-citation measure only on the entries that are not duplicated to decrease the bias(!)
			for(TimeCitation tc : allNotDupArticles) {
				if(tc.getYear() > 2009) {
					count_period1 ++;
					total_period1 = total_period1 + tc.getCitation();
				} else if (tc.getYear() > 1999) {
					count_period2 ++;
					total_period2 = total_period2 + tc.getCitation();
				} else {
					count_period3 ++;
					total_period3 = total_period3 + tc.getCitation();
				}
			}
			System.out.println("Average Period 1 (current to 2010) 	is " + 	(total_period1 / count_period1));
			System.out.println("Average Period 2 (from 2009 to 2000) is " + 	(total_period2 / count_period2));
			System.out.println("Average Period 3 (before 2000) is " + 	(total_period3 / count_period3));
			
			int afterCitationMeasure_IncludingDuplication = 0;
			int afterCitationMeasure_ExcludingDuplication = 0;

			for(Row row : table) {
				if((int)row.get("year") > 2009) {
					afterCitationMeasure_IncludingDuplication++;
					row.put("timeCitation_measure", true);						
				} else if ((int)row.get("year") > 1999) {
					if((int)row.get("citation") > (total_period2 / count_period2) - 1) {
						afterCitationMeasure_IncludingDuplication ++;
						row.put("timeCitation_measure", true);						
					}
				} else {
					if((int)row.get("citation") > (total_period3 / count_period3) - 1) {
						afterCitationMeasure_IncludingDuplication ++;
						row.put("timeCitation_measure", true);						
					}
				}
				table.updateRow(row);
				if(!(boolean) row.get("duplication_measure") && (boolean) row.get("timeCitation_measure")) {
					afterCitationMeasure_ExcludingDuplication++;
					//System.out.println(row.getString("title") + " --- " + row.getInt("year") + " -- " + row.getInt("citation"));
				}
			}
			System.out.println();
			System.out.println("Before citation removal (Including Duplications): " + table.getRowCount());
			System.out.println("After  citation removal (Including Duplications): "  + afterCitationMeasure_IncludingDuplication);
			System.out.println();
			System.out.println("Before citation removal (Excluding Duplications): " + allNotDupArticles.size());
			System.out.println("After  citation removal (Excluding Duplications): "  + afterCitationMeasure_ExcludingDuplication);			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
