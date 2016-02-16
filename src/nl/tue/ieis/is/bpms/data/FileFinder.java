package nl.tue.ieis.is.bpms.data;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;

public class FileFinder {
	public static void main(String[] args) throws URISyntaxException {
		Table table;
		try {
			table = DatabaseBuilder.open(new File("C:\\Users\\spourmir\\Dropbox\\Archirecture Literature Survey\\Sander - Shaya - Remco\\Database11.accdb")).getTable("BPMS_ARCH");
			File directory = new File("C:\\Users\\spourmir\\Dropbox\\Archirecture Literature Survey\\Sander - Shaya - Remco\\DL-Shaya");
		    File[] papers = directory.listFiles();
		    
			for(Row row : table) {
				if(!row.getBoolean("duplication_measure") && row.getBoolean("timeCitation_measure") && !row.getBoolean("undownloadable")) {
					String title = row.getString("title").trim();	
					
					for(File file : papers) {
						if(title.contentEquals(file.getName().substring(0, file.getName().length()-4).trim())) {
							String path = "DL-Shaya/" + file.getName() + "#DL-Shaya/" + file.getName().replace(" ", "%20") + "#";
							row.put("file", path);
							break;
						}
					}
				}
				table.updateRow(row);
			}
			

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
