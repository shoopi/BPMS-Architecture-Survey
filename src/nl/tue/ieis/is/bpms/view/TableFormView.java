package nl.tue.ieis.is.bpms.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import nl.tue.ieis.is.bpms.data.Config;
import nl.tue.ieis.is.bpms.model.BPMSTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class TableFormView {

	private JFrame frame;
	private JTable table;
	final private JFileChooser fc = new JFileChooser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableFormView window = new TableFormView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TableFormView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 877, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		
		table = new JTable(new BPMSTableModel());
		table.getModel().addTableModelListener(new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {  
		        int row = e.getFirstRow();  
		        int column = e.getColumn();  
		        TableModel model = (TableModel)e.getSource();  
		        Object data = model.getValueAt(row, column);
		        System.out.println(data);
			}
		});
		panel_1.add(table);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmOpenDatabase = new JMenuItem("Change Database");
		mntmOpenDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnVal = fc.showOpenDialog(frame);
		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		            File file = fc.getSelectedFile();
		            Config.DB_Location = file.getAbsolutePath();
		            System.out.println("Database Location has been changed to: " + file.getAbsolutePath());
		        } else {
		        	System.err.println("Open command cancelled by user.");
		        }
			}
		});
		mnNewMenu.add(mntmOpenDatabase);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnNewMenu.add(mntmExit);
		
		JMenu mnEntry = new JMenu("Entry");
		menuBar.add(mnEntry);
		
		JMenuItem mntmAddNewEntry = new JMenuItem("Add New Entry");
		mntmAddNewEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AddNewItemFormView frame = new AddNewItemFormView();
					frame.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		mnEntry.add(mntmAddNewEntry);
		
		JMenuItem mntmAddNewBibtex = new JMenuItem("Add New BibTex");
		mntmAddNewBibtex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					InsertNewBibtex window = new InsertNewBibtex();
					window.frmInsertNewBibtex.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		mnEntry.add(mntmAddNewBibtex);
		
		JMenuItem mntmEditEntry = new JMenuItem("Edit Entry");
		mnEntry.add(mntmEditEntry);
		
		JMenuItem mntmRemoveEntry = new JMenuItem("Remove Entry");
		mnEntry.add(mntmRemoveEntry);
	}

}
