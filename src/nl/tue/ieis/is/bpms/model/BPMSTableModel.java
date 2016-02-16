package nl.tue.ieis.is.bpms.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import nl.tue.ieis.is.bpms.data.Config;

import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;

public class BPMSTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	
	private List<BPMSTable> data = new ArrayList<BPMSTable>();
	String colNames[] = { "ID", "Search Term", "Title", "Authors", "Year", "Citation", "Database", "Undownloadable", "Source",
			"Duplicate?", "TimeCitation?", "Status", "Reason", "Ref Architecture", "Other Root Architecture", "System Aggregation",
			"Data Aggregation", "Abstraction", "Realization", "Style", "Evaluation", "Layering", "Requirements", "Description", "File"};
	Class<?> colClasses[] = { String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class, String.class,
			Boolean.class, Boolean.class, Boolean.class, String.class, String.class, String.class, Integer.class, Integer.class, Integer.class,
			Integer.class, String.class, String.class, String.class, String.class, String.class, String.class,};
	
	
	    public BPMSTableModel() {
			try {
				extractDataFromDB();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

		private void extractDataFromDB() throws IOException {
			Table table = DatabaseBuilder.open(new File(Config.DB_Location)).getTable(Config.DB_Name);
			for(Row row : table) {
				data.add(new BPMSTable(
					row.getString("id"), 
					row.getString("searchTerms"), 
					row.getString("title"), 
					row.getString("authors"), 
					row.getInt("year"), 
					row.getInt("citation"), 
					row.getString("database"), 
					row.getBoolean("undownloadable"), 
					row.getString("source"), 
					row.getBoolean("duplication_measure"), 
					row.getBoolean("timeCitation_measure"), 
					row.getBoolean("status"), 
					row.getString("reason"), 
					row.getString("reference_architecture"), 
					row.getString("nonreference_architecture"), 
					row.getInt("system_aggregation"), 
					row.getInt("data_aggregation"), 
					row.getInt("abstraction"), 
					row.getInt("realization"), 
					row.getString("style"), 
					row.getString("evaluation"), 
					row.getString("layering"), 
					row.getString("requirements"), 
					row.getString("description"), 
					row.getString("file")
				));
			}
		}

	    public int getRowCount() {
	        return data.size();
	    }

	    public int getColumnCount() {
	        return colNames.length;
	    }

	    public void setValueAt(int rowIndex, int columnIndex) {
	    	//rowData[rowIndex][columnIndex] = value;  
	        fireTableCellUpdated(rowIndex, columnIndex);
	    }

	    public String getColumnName(int columnIndex) {
	        return colNames[columnIndex];
	    }

	    public Class<?> getColumnClass(int columnIndex) {
	        return colClasses[columnIndex];
	    }

	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	        return true;
	    }

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			BPMSTable bpmsEntry = data.get(rowIndex);
			   switch (columnIndex) {
			    case 0:
			    	bpmsEntry.getId();
			    case 1:	
					bpmsEntry.getSearchTerms();
				case 2:
					bpmsEntry.getTitle();
				case 3:	
					bpmsEntry.getAuthors();
				case 4:
					bpmsEntry.getYear();
				case 5:	
					bpmsEntry.getCitation();
				case 6:
					bpmsEntry.getDatabase();
				case 7:	
					bpmsEntry.isUndownloadable(); 
				case 8:	
					bpmsEntry.getSource();
				case 9:	
					bpmsEntry.isDuplication_measure();
				case 10:	
					bpmsEntry.isTimeCitation_measure();
				case 11:
					bpmsEntry.isStatus();
				case 12:
					bpmsEntry.getReason();
				case 13:
					bpmsEntry.getReference_architecture();
				case 14:
					bpmsEntry.getNonreference_architecture();
				case 15:
					bpmsEntry.getSystem_aggregation();
				case 16:
					bpmsEntry.getData_aggregation();
				case 17:
					bpmsEntry.getAbstraction();
				case 18:
					bpmsEntry.getRealization();
				case 19: 
					bpmsEntry.getStyle();
				case 20:
					bpmsEntry.getEvaluation();
				case 21:
					bpmsEntry.getLayering();
				case 22:
					bpmsEntry.getRequirements();
				case 23: 
					bpmsEntry.getDescription();
				case 24:
					bpmsEntry.getFile();
			    default:
			     return null;
			   }
		}
	}