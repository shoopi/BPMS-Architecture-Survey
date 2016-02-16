package nl.tue.ieis.is.bpms.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import nl.tue.ieis.is.bpms.data.DBFunctions;

public class InsertNewBibtex {

	public JFrame frmInsertNewBibtex;
	private JTextPane textPane;
	private JLabel lblCitation;
	private JSpinner spinner;
	private JLabel lblDatabase;
	private JTextField textField;
	private JCheckBox chckbxUndownloadable;
	private JScrollPane scrollPane_1;
	private JLabel lblStatusBar;
	private JCheckBox dupplicatedCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertNewBibtex window = new InsertNewBibtex();
					window.frmInsertNewBibtex.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InsertNewBibtex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInsertNewBibtex = new JFrame();
		frmInsertNewBibtex.setTitle("Insert New BibTex");
		frmInsertNewBibtex.setBounds(100, 100, 546, 410);
		frmInsertNewBibtex.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblInsertBibtex = new JLabel("Insert BibTex");
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: ACTION OF ADDING A NEW BIBTEX
				if(textPane.getText() != null) {
					String bibTex = textPane.getText();
					String db = textField.getText();
					int citation = (int) spinner.getValue();
					String error = DBFunctions.addNewBibTex(bibTex, citation, db, chckbxUndownloadable.isSelected(), dupplicatedCheckBox.isSelected());
					
					if(error.length() == 0) {
						spinner.setValue(0);
						lblStatusBar.setForeground(Color.GREEN);
						lblStatusBar.setText("A new entry has successfully added.");
						textPane.setText("");
						dupplicatedCheckBox.setSelected(false);
						
					} else {
						lblStatusBar.setForeground(Color.RED);
						lblStatusBar.setText(error);
					}
				}
			}
		});
		
		lblCitation = new JLabel("Citation");
		
		spinner = new JSpinner();
		
		lblDatabase = new JLabel("Database");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		chckbxUndownloadable = new JCheckBox("isUn-Downloadable?");
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane_1 = new JScrollPane();
		
		dupplicatedCheckBox = new JCheckBox("isDuplicated?");
		GroupLayout groupLayout = new GroupLayout(frmInsertNewBibtex.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
								.addComponent(lblInsertBibtex)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblCitation)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblDatabase))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(19)
											.addComponent(chckbxUndownloadable)))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
												.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
											.addGap(152)
											.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
										.addComponent(dupplicatedCheckBox, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
								.addComponent(btnSubmit))))
					.addGap(76))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblInsertBibtex)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(20)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(2)
											.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addComponent(lblCitation)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblDatabase)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(7)
							.addComponent(chckbxUndownloadable)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
							.addComponent(btnSubmit)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(dupplicatedCheckBox)
							.addGap(116))))
		);
		
		lblStatusBar = new JLabel("Status Bar ...");
		scrollPane.setViewportView(lblStatusBar);
		
		textPane = new JTextPane();
		scrollPane_1.setViewportView(textPane);
		frmInsertNewBibtex.getContentPane().setLayout(groupLayout);
	}
}
