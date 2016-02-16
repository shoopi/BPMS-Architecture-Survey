package nl.tue.ieis.is.bpms.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;

public class DuplicationRemoval {
	public static void main(String[] args) {
		Table table;
		try {
			table = DatabaseBuilder.open(new File(Config.DB_Location)).getTable(Config.DB_Name);
			findSimilarName(table);
			//findSimilarBasedOnID(table);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("unused")
	private static void findSimilarBasedOnID(Table table) throws IOException {
		int counterNotDuplicated = 0;
		int counterDuplicated = 0;
		for(Row row : table) {
			String id = ((String) row.get("id"));
			if(id.contains("ACM") || id.contains("IEEE") || id.contains("Springer") || 
				id.contains("Scopus") || id.contains("Web of Science")) {
				row.put("duplication_measure", true);
				counterDuplicated++;
			} else {
				counterNotDuplicated++;
				row.put("duplication_measure", false);
			}
			table.updateRow(row);
		}
		System.out.println("There are " + counterDuplicated + " duplication in the database.");
		System.out.println("There are " + counterNotDuplicated + " original entry in the database");
	}
	
	private static void findSimilarName(Table table) {
		ArrayList<String> titles = new ArrayList<String>();
		for(Row row : table) {
			titles.add((String) row.get("title"));
		}
		Map<String, Integer> frequency = new HashMap<String, Integer>();
		for (String t : titles) {
		    if (frequency.containsKey(t)) {
		        frequency.put(t, frequency.get(t) + 1);
		    }
		    else {
		        frequency.put(t, 1);
		    }
		}
		
		System.out.println("Before Duplication removal we had " + titles.size() + " rows");
		System.out.println("After  Duplication removal we had " + frequency.size() + " rows");
		
		ArrayList<String> foundDups = new ArrayList<String>();
		for(Row row : table) {
			if((boolean) row.get("duplication_measure")) {
				foundDups.add((String) row.get("title"));
			}
		}
		
		int founded = 0;
		Set<String> notYetFound = new HashSet<String>();
		for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		    if(entry.getValue() > 1) {
		    	founded = founded + entry.getValue();
		    	notYetFound.add(entry.getKey());
		    }
		}
		
		notYetFound.removeAll(foundDups);
		System.out.println("We need to find " + notYetFound.size());
		
		for(String s : notYetFound) {
			System.out.println(s);
		}
	}
}
