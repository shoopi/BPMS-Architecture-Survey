package nl.tue.ieis.is.bpms.view;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import javax.swing.JButton;

public class AddNewItemFormView extends JFrame {
	private static final long serialVersionUID = -538738461606962020L;
	private BindingGroup m_bindingGroup;
	private JPanel m_contentPane;
	private nl.tue.ieis.is.bpms.model.BPMSTable bPMSTable;
	private JSlider abstractionJSlider;
	private JTextField authorsJTextField;
	private JSlider citationJSlider;
	private JSlider data_aggregationJSlider;
	private JTextField databaseJTextField;
	private JTextField descriptionJTextField;
	private JCheckBox duplication_measureJCheckBox;
	private JTextField evaluationJTextField;
	private JTextField fileJTextField;
	private JTextField idJTextField;
	private JTextField keywordsJTextField;
	private JTextField layeringJTextField;
	private JTextField nonreference_architectureJTextField;
	private JSlider realizationJSlider;
	private JTextField reasonJTextField;
	private JTextField reference_architectureJTextField;
	private JTextField requirementsJTextField;
	private JTextField sourceJTextField;
	private JCheckBox statusJCheckBox;
	private JTextField styleJTextField;
	private JSlider system_aggregationJSlider;
	private JCheckBox timeCitation_measureJCheckBox;
	private JTextField titleJTextField;
	private JCheckBox undownloadableJCheckBox;
	private JSlider yearJSlider;
	private JButton btnAddNewEntry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewItemFormView frame = new AddNewItemFormView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddNewItemFormView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 576, 847);
		m_contentPane = new JPanel();
		setContentPane(m_contentPane);
		//
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0E-4 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4 };
		m_contentPane.setLayout(gridBagLayout);

		JLabel abstractionLabel = new JLabel("Abstraction:");
		GridBagConstraints labelGbc_0 = new GridBagConstraints();
		labelGbc_0.insets = new Insets(5, 5, 5, 5);
		labelGbc_0.gridx = 0;
		labelGbc_0.gridy = 0;
		m_contentPane.add(abstractionLabel, labelGbc_0);

		abstractionJSlider = new JSlider();
		GridBagConstraints componentGbc_0 = new GridBagConstraints();
		componentGbc_0.insets = new Insets(5, 0, 5, 0);
		componentGbc_0.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_0.gridx = 1;
		componentGbc_0.gridy = 0;
		m_contentPane.add(abstractionJSlider, componentGbc_0);

		JLabel authorsLabel = new JLabel("Authors:");
		GridBagConstraints labelGbc_1 = new GridBagConstraints();
		labelGbc_1.insets = new Insets(5, 5, 5, 5);
		labelGbc_1.gridx = 0;
		labelGbc_1.gridy = 1;
		m_contentPane.add(authorsLabel, labelGbc_1);

		authorsJTextField = new JTextField();
		GridBagConstraints componentGbc_1 = new GridBagConstraints();
		componentGbc_1.insets = new Insets(5, 0, 5, 0);
		componentGbc_1.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_1.gridx = 1;
		componentGbc_1.gridy = 1;
		m_contentPane.add(authorsJTextField, componentGbc_1);

		JLabel citationLabel = new JLabel("Citation:");
		GridBagConstraints labelGbc_2 = new GridBagConstraints();
		labelGbc_2.insets = new Insets(5, 5, 5, 5);
		labelGbc_2.gridx = 0;
		labelGbc_2.gridy = 2;
		m_contentPane.add(citationLabel, labelGbc_2);

		citationJSlider = new JSlider();
		GridBagConstraints componentGbc_2 = new GridBagConstraints();
		componentGbc_2.insets = new Insets(5, 0, 5, 0);
		componentGbc_2.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_2.gridx = 1;
		componentGbc_2.gridy = 2;
		m_contentPane.add(citationJSlider, componentGbc_2);

		JLabel data_aggregationLabel = new JLabel("Data_aggregation:");
		GridBagConstraints labelGbc_3 = new GridBagConstraints();
		labelGbc_3.insets = new Insets(5, 5, 5, 5);
		labelGbc_3.gridx = 0;
		labelGbc_3.gridy = 3;
		m_contentPane.add(data_aggregationLabel, labelGbc_3);

		data_aggregationJSlider = new JSlider();
		GridBagConstraints componentGbc_3 = new GridBagConstraints();
		componentGbc_3.insets = new Insets(5, 0, 5, 0);
		componentGbc_3.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_3.gridx = 1;
		componentGbc_3.gridy = 3;
		m_contentPane.add(data_aggregationJSlider, componentGbc_3);

		JLabel databaseLabel = new JLabel("Database:");
		GridBagConstraints labelGbc_4 = new GridBagConstraints();
		labelGbc_4.insets = new Insets(5, 5, 5, 5);
		labelGbc_4.gridx = 0;
		labelGbc_4.gridy = 4;
		m_contentPane.add(databaseLabel, labelGbc_4);

		databaseJTextField = new JTextField();
		GridBagConstraints componentGbc_4 = new GridBagConstraints();
		componentGbc_4.insets = new Insets(5, 0, 5, 0);
		componentGbc_4.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_4.gridx = 1;
		componentGbc_4.gridy = 4;
		m_contentPane.add(databaseJTextField, componentGbc_4);

		JLabel descriptionLabel = new JLabel("Description:");
		GridBagConstraints labelGbc_5 = new GridBagConstraints();
		labelGbc_5.insets = new Insets(5, 5, 5, 5);
		labelGbc_5.gridx = 0;
		labelGbc_5.gridy = 5;
		m_contentPane.add(descriptionLabel, labelGbc_5);

		descriptionJTextField = new JTextField();
		GridBagConstraints componentGbc_5 = new GridBagConstraints();
		componentGbc_5.insets = new Insets(5, 0, 5, 0);
		componentGbc_5.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_5.gridx = 1;
		componentGbc_5.gridy = 5;
		m_contentPane.add(descriptionJTextField, componentGbc_5);

		JLabel duplication_measureLabel = new JLabel("Duplication_measure:");
		GridBagConstraints labelGbc_6 = new GridBagConstraints();
		labelGbc_6.insets = new Insets(5, 5, 5, 5);
		labelGbc_6.gridx = 0;
		labelGbc_6.gridy = 6;
		m_contentPane.add(duplication_measureLabel, labelGbc_6);

		duplication_measureJCheckBox = new JCheckBox();
		GridBagConstraints componentGbc_6 = new GridBagConstraints();
		componentGbc_6.insets = new Insets(5, 0, 5, 0);
		componentGbc_6.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_6.gridx = 1;
		componentGbc_6.gridy = 6;
		m_contentPane.add(duplication_measureJCheckBox, componentGbc_6);

		JLabel evaluationLabel = new JLabel("Evaluation:");
		GridBagConstraints labelGbc_7 = new GridBagConstraints();
		labelGbc_7.insets = new Insets(5, 5, 5, 5);
		labelGbc_7.gridx = 0;
		labelGbc_7.gridy = 7;
		m_contentPane.add(evaluationLabel, labelGbc_7);

		evaluationJTextField = new JTextField();
		GridBagConstraints componentGbc_7 = new GridBagConstraints();
		componentGbc_7.insets = new Insets(5, 0, 5, 0);
		componentGbc_7.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_7.gridx = 1;
		componentGbc_7.gridy = 7;
		m_contentPane.add(evaluationJTextField, componentGbc_7);

		JLabel fileLabel = new JLabel("File:");
		GridBagConstraints labelGbc_8 = new GridBagConstraints();
		labelGbc_8.insets = new Insets(5, 5, 5, 5);
		labelGbc_8.gridx = 0;
		labelGbc_8.gridy = 8;
		m_contentPane.add(fileLabel, labelGbc_8);

		fileJTextField = new JTextField();
		GridBagConstraints componentGbc_8 = new GridBagConstraints();
		componentGbc_8.insets = new Insets(5, 0, 5, 0);
		componentGbc_8.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_8.gridx = 1;
		componentGbc_8.gridy = 8;
		m_contentPane.add(fileJTextField, componentGbc_8);

		JLabel idLabel = new JLabel("Id:");
		GridBagConstraints labelGbc_9 = new GridBagConstraints();
		labelGbc_9.insets = new Insets(5, 5, 5, 5);
		labelGbc_9.gridx = 0;
		labelGbc_9.gridy = 9;
		m_contentPane.add(idLabel, labelGbc_9);

		idJTextField = new JTextField();
		GridBagConstraints componentGbc_9 = new GridBagConstraints();
		componentGbc_9.insets = new Insets(5, 0, 5, 0);
		componentGbc_9.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_9.gridx = 1;
		componentGbc_9.gridy = 9;
		m_contentPane.add(idJTextField, componentGbc_9);

		JLabel keywordsLabel = new JLabel("Keywords:");
		GridBagConstraints labelGbc_10 = new GridBagConstraints();
		labelGbc_10.insets = new Insets(5, 5, 5, 5);
		labelGbc_10.gridx = 0;
		labelGbc_10.gridy = 10;
		m_contentPane.add(keywordsLabel, labelGbc_10);

		keywordsJTextField = new JTextField();
		GridBagConstraints componentGbc_10 = new GridBagConstraints();
		componentGbc_10.insets = new Insets(5, 0, 5, 0);
		componentGbc_10.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_10.gridx = 1;
		componentGbc_10.gridy = 10;
		m_contentPane.add(keywordsJTextField, componentGbc_10);

		JLabel layeringLabel = new JLabel("Layering:");
		GridBagConstraints labelGbc_11 = new GridBagConstraints();
		labelGbc_11.insets = new Insets(5, 5, 5, 5);
		labelGbc_11.gridx = 0;
		labelGbc_11.gridy = 11;
		m_contentPane.add(layeringLabel, labelGbc_11);

		layeringJTextField = new JTextField();
		GridBagConstraints componentGbc_11 = new GridBagConstraints();
		componentGbc_11.insets = new Insets(5, 0, 5, 0);
		componentGbc_11.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_11.gridx = 1;
		componentGbc_11.gridy = 11;
		m_contentPane.add(layeringJTextField, componentGbc_11);

		JLabel nonreference_architectureLabel = new JLabel(
				"Nonreference_architecture:");
		GridBagConstraints labelGbc_12 = new GridBagConstraints();
		labelGbc_12.insets = new Insets(5, 5, 5, 5);
		labelGbc_12.gridx = 0;
		labelGbc_12.gridy = 12;
		m_contentPane.add(nonreference_architectureLabel, labelGbc_12);

		nonreference_architectureJTextField = new JTextField();
		GridBagConstraints componentGbc_12 = new GridBagConstraints();
		componentGbc_12.insets = new Insets(5, 0, 5, 0);
		componentGbc_12.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_12.gridx = 1;
		componentGbc_12.gridy = 12;
		m_contentPane.add(nonreference_architectureJTextField, componentGbc_12);

		JLabel realizationLabel = new JLabel("Realization:");
		GridBagConstraints labelGbc_13 = new GridBagConstraints();
		labelGbc_13.insets = new Insets(5, 5, 5, 5);
		labelGbc_13.gridx = 0;
		labelGbc_13.gridy = 13;
		m_contentPane.add(realizationLabel, labelGbc_13);

		realizationJSlider = new JSlider();
		GridBagConstraints componentGbc_13 = new GridBagConstraints();
		componentGbc_13.insets = new Insets(5, 0, 5, 0);
		componentGbc_13.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_13.gridx = 1;
		componentGbc_13.gridy = 13;
		m_contentPane.add(realizationJSlider, componentGbc_13);

		JLabel reasonLabel = new JLabel("Reason:");
		GridBagConstraints labelGbc_14 = new GridBagConstraints();
		labelGbc_14.insets = new Insets(5, 5, 5, 5);
		labelGbc_14.gridx = 0;
		labelGbc_14.gridy = 14;
		m_contentPane.add(reasonLabel, labelGbc_14);

		reasonJTextField = new JTextField();
		GridBagConstraints componentGbc_14 = new GridBagConstraints();
		componentGbc_14.insets = new Insets(5, 0, 5, 0);
		componentGbc_14.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_14.gridx = 1;
		componentGbc_14.gridy = 14;
		m_contentPane.add(reasonJTextField, componentGbc_14);

		JLabel reference_architectureLabel = new JLabel(
				"Reference_architecture:");
		GridBagConstraints labelGbc_15 = new GridBagConstraints();
		labelGbc_15.insets = new Insets(5, 5, 5, 5);
		labelGbc_15.gridx = 0;
		labelGbc_15.gridy = 15;
		m_contentPane.add(reference_architectureLabel, labelGbc_15);

		reference_architectureJTextField = new JTextField();
		GridBagConstraints componentGbc_15 = new GridBagConstraints();
		componentGbc_15.insets = new Insets(5, 0, 5, 0);
		componentGbc_15.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_15.gridx = 1;
		componentGbc_15.gridy = 15;
		m_contentPane.add(reference_architectureJTextField, componentGbc_15);

		JLabel requirementsLabel = new JLabel("Requirements:");
		GridBagConstraints labelGbc_16 = new GridBagConstraints();
		labelGbc_16.insets = new Insets(5, 5, 5, 5);
		labelGbc_16.gridx = 0;
		labelGbc_16.gridy = 16;
		m_contentPane.add(requirementsLabel, labelGbc_16);

		requirementsJTextField = new JTextField();
		GridBagConstraints componentGbc_16 = new GridBagConstraints();
		componentGbc_16.insets = new Insets(5, 0, 5, 0);
		componentGbc_16.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_16.gridx = 1;
		componentGbc_16.gridy = 16;
		m_contentPane.add(requirementsJTextField, componentGbc_16);

		JLabel sourceLabel = new JLabel("Source:");
		GridBagConstraints labelGbc_17 = new GridBagConstraints();
		labelGbc_17.insets = new Insets(5, 5, 5, 5);
		labelGbc_17.gridx = 0;
		labelGbc_17.gridy = 17;
		m_contentPane.add(sourceLabel, labelGbc_17);

		sourceJTextField = new JTextField();
		GridBagConstraints componentGbc_17 = new GridBagConstraints();
		componentGbc_17.insets = new Insets(5, 0, 5, 0);
		componentGbc_17.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_17.gridx = 1;
		componentGbc_17.gridy = 17;
		m_contentPane.add(sourceJTextField, componentGbc_17);

		JLabel statusLabel = new JLabel("Status:");
		GridBagConstraints labelGbc_18 = new GridBagConstraints();
		labelGbc_18.insets = new Insets(5, 5, 5, 5);
		labelGbc_18.gridx = 0;
		labelGbc_18.gridy = 18;
		m_contentPane.add(statusLabel, labelGbc_18);

		statusJCheckBox = new JCheckBox();
		GridBagConstraints componentGbc_18 = new GridBagConstraints();
		componentGbc_18.insets = new Insets(5, 0, 5, 0);
		componentGbc_18.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_18.gridx = 1;
		componentGbc_18.gridy = 18;
		m_contentPane.add(statusJCheckBox, componentGbc_18);

		JLabel styleLabel = new JLabel("Style:");
		GridBagConstraints labelGbc_19 = new GridBagConstraints();
		labelGbc_19.insets = new Insets(5, 5, 5, 5);
		labelGbc_19.gridx = 0;
		labelGbc_19.gridy = 19;
		m_contentPane.add(styleLabel, labelGbc_19);

		styleJTextField = new JTextField();
		GridBagConstraints componentGbc_19 = new GridBagConstraints();
		componentGbc_19.insets = new Insets(5, 0, 5, 0);
		componentGbc_19.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_19.gridx = 1;
		componentGbc_19.gridy = 19;
		m_contentPane.add(styleJTextField, componentGbc_19);

		JLabel system_aggregationLabel = new JLabel("System_aggregation:");
		GridBagConstraints labelGbc_20 = new GridBagConstraints();
		labelGbc_20.insets = new Insets(5, 5, 5, 5);
		labelGbc_20.gridx = 0;
		labelGbc_20.gridy = 20;
		m_contentPane.add(system_aggregationLabel, labelGbc_20);

		system_aggregationJSlider = new JSlider();
		GridBagConstraints componentGbc_20 = new GridBagConstraints();
		componentGbc_20.insets = new Insets(5, 0, 5, 0);
		componentGbc_20.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_20.gridx = 1;
		componentGbc_20.gridy = 20;
		m_contentPane.add(system_aggregationJSlider, componentGbc_20);

		JLabel timeCitation_measureLabel = new JLabel("TimeCitation_measure:");
		GridBagConstraints labelGbc_21 = new GridBagConstraints();
		labelGbc_21.insets = new Insets(5, 5, 5, 5);
		labelGbc_21.gridx = 0;
		labelGbc_21.gridy = 21;
		m_contentPane.add(timeCitation_measureLabel, labelGbc_21);

		timeCitation_measureJCheckBox = new JCheckBox();
		GridBagConstraints componentGbc_21 = new GridBagConstraints();
		componentGbc_21.insets = new Insets(5, 0, 5, 0);
		componentGbc_21.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_21.gridx = 1;
		componentGbc_21.gridy = 21;
		m_contentPane.add(timeCitation_measureJCheckBox, componentGbc_21);

		JLabel titleLabel = new JLabel("Title:");
		GridBagConstraints labelGbc_22 = new GridBagConstraints();
		labelGbc_22.insets = new Insets(5, 5, 5, 5);
		labelGbc_22.gridx = 0;
		labelGbc_22.gridy = 22;
		m_contentPane.add(titleLabel, labelGbc_22);

		titleJTextField = new JTextField();
		GridBagConstraints componentGbc_22 = new GridBagConstraints();
		componentGbc_22.insets = new Insets(5, 0, 5, 0);
		componentGbc_22.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_22.gridx = 1;
		componentGbc_22.gridy = 22;
		m_contentPane.add(titleJTextField, componentGbc_22);

		JLabel undownloadableLabel = new JLabel("Undownloadable:");
		GridBagConstraints labelGbc_23 = new GridBagConstraints();
		labelGbc_23.insets = new Insets(5, 5, 5, 5);
		labelGbc_23.gridx = 0;
		labelGbc_23.gridy = 23;
		m_contentPane.add(undownloadableLabel, labelGbc_23);

		undownloadableJCheckBox = new JCheckBox();
		GridBagConstraints componentGbc_23 = new GridBagConstraints();
		componentGbc_23.insets = new Insets(5, 0, 5, 0);
		componentGbc_23.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_23.gridx = 1;
		componentGbc_23.gridy = 23;
		m_contentPane.add(undownloadableJCheckBox, componentGbc_23);

		JLabel yearLabel = new JLabel("Year:");
		GridBagConstraints labelGbc_24 = new GridBagConstraints();
		labelGbc_24.insets = new Insets(5, 5, 5, 5);
		labelGbc_24.gridx = 0;
		labelGbc_24.gridy = 24;
		m_contentPane.add(yearLabel, labelGbc_24);

		yearJSlider = new JSlider();
		GridBagConstraints componentGbc_24 = new GridBagConstraints();
		componentGbc_24.insets = new Insets(5, 0, 5, 0);
		componentGbc_24.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_24.gridx = 1;
		componentGbc_24.gridy = 24;
		m_contentPane.add(yearJSlider, componentGbc_24);
		
		btnAddNewEntry = new JButton("Add New Entry");
		GridBagConstraints gbc_btnAddNewEntry = new GridBagConstraints();
		gbc_btnAddNewEntry.gridx = 1;
		gbc_btnAddNewEntry.gridy = 25;
		m_contentPane.add(btnAddNewEntry, gbc_btnAddNewEntry);

		if (bPMSTable != null) {
			m_bindingGroup = initDataBindings();
		}
	}

	protected BindingGroup initDataBindings() {
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer> abstractionProperty = BeanProperty
				.create("abstraction");
		BeanProperty<javax.swing.JSlider, java.lang.Integer> valueProperty = BeanProperty
				.create("value");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer, javax.swing.JSlider, java.lang.Integer> autoBinding = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						abstractionProperty, abstractionJSlider, valueProperty);
		autoBinding.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> authorsProperty = BeanProperty
				.create("authors");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_1 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						authorsProperty, authorsJTextField, textProperty);
		autoBinding_1.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer> citationProperty = BeanProperty
				.create("citation");
		BeanProperty<javax.swing.JSlider, java.lang.Integer> valueProperty_1 = BeanProperty
				.create("value");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer, javax.swing.JSlider, java.lang.Integer> autoBinding_2 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						citationProperty, citationJSlider, valueProperty_1);
		autoBinding_2.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer> data_aggregationProperty = BeanProperty
				.create("data_aggregation");
		BeanProperty<javax.swing.JSlider, java.lang.Integer> valueProperty_2 = BeanProperty
				.create("value");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer, javax.swing.JSlider, java.lang.Integer> autoBinding_3 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						data_aggregationProperty, data_aggregationJSlider,
						valueProperty_2);
		autoBinding_3.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> databaseProperty = BeanProperty
				.create("database");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_1 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_4 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						databaseProperty, databaseJTextField, textProperty_1);
		autoBinding_4.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> descriptionProperty = BeanProperty
				.create("description");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_2 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_5 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						descriptionProperty, descriptionJTextField,
						textProperty_2);
		autoBinding_5.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Boolean> duplication_measureProperty = BeanProperty
				.create("duplication_measure");
		BeanProperty<javax.swing.JCheckBox, java.lang.Boolean> selectedProperty = BeanProperty
				.create("selected");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Boolean, javax.swing.JCheckBox, java.lang.Boolean> autoBinding_6 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						duplication_measureProperty,
						duplication_measureJCheckBox, selectedProperty);
		autoBinding_6.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> evaluationProperty = BeanProperty
				.create("evaluation");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_3 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_7 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						evaluationProperty, evaluationJTextField,
						textProperty_3);
		autoBinding_7.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> fileProperty = BeanProperty
				.create("file");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_4 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_8 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						fileProperty, fileJTextField, textProperty_4);
		autoBinding_8.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> idProperty = BeanProperty
				.create("id");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_5 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_9 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						idProperty, idJTextField, textProperty_5);
		autoBinding_9.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> keywordsProperty = BeanProperty
				.create("keywords");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_6 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_10 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						keywordsProperty, keywordsJTextField, textProperty_6);
		autoBinding_10.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> layeringProperty = BeanProperty
				.create("layering");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_7 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_11 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						layeringProperty, layeringJTextField, textProperty_7);
		autoBinding_11.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> nonreference_architectureProperty = BeanProperty
				.create("nonreference_architecture");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_8 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_12 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						nonreference_architectureProperty,
						nonreference_architectureJTextField, textProperty_8);
		autoBinding_12.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer> realizationProperty = BeanProperty
				.create("realization");
		BeanProperty<javax.swing.JSlider, java.lang.Integer> valueProperty_3 = BeanProperty
				.create("value");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer, javax.swing.JSlider, java.lang.Integer> autoBinding_13 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						realizationProperty, realizationJSlider,
						valueProperty_3);
		autoBinding_13.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> reasonProperty = BeanProperty
				.create("reason");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_9 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_14 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						reasonProperty, reasonJTextField, textProperty_9);
		autoBinding_14.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> reference_architectureProperty = BeanProperty
				.create("reference_architecture");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_10 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_15 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						reference_architectureProperty,
						reference_architectureJTextField, textProperty_10);
		autoBinding_15.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> requirementsProperty = BeanProperty
				.create("requirements");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_11 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_16 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						requirementsProperty, requirementsJTextField,
						textProperty_11);
		autoBinding_16.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> sourceProperty = BeanProperty
				.create("source");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_12 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_17 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						sourceProperty, sourceJTextField, textProperty_12);
		autoBinding_17.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Boolean> statusProperty = BeanProperty
				.create("status");
		BeanProperty<javax.swing.JCheckBox, java.lang.Boolean> selectedProperty_1 = BeanProperty
				.create("selected");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Boolean, javax.swing.JCheckBox, java.lang.Boolean> autoBinding_18 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						statusProperty, statusJCheckBox, selectedProperty_1);
		autoBinding_18.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> styleProperty = BeanProperty
				.create("style");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_13 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_19 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						styleProperty, styleJTextField, textProperty_13);
		autoBinding_19.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer> system_aggregationProperty = BeanProperty
				.create("system_aggregation");
		BeanProperty<javax.swing.JSlider, java.lang.Integer> valueProperty_4 = BeanProperty
				.create("value");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer, javax.swing.JSlider, java.lang.Integer> autoBinding_20 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						system_aggregationProperty, system_aggregationJSlider,
						valueProperty_4);
		autoBinding_20.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Boolean> timeCitation_measureProperty = BeanProperty
				.create("timeCitation_measure");
		BeanProperty<javax.swing.JCheckBox, java.lang.Boolean> selectedProperty_2 = BeanProperty
				.create("selected");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Boolean, javax.swing.JCheckBox, java.lang.Boolean> autoBinding_21 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						timeCitation_measureProperty,
						timeCitation_measureJCheckBox, selectedProperty_2);
		autoBinding_21.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String> titleProperty = BeanProperty
				.create("title");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_14 = BeanProperty
				.create("text");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_22 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						titleProperty, titleJTextField, textProperty_14);
		autoBinding_22.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Boolean> undownloadableProperty = BeanProperty
				.create("undownloadable");
		BeanProperty<javax.swing.JCheckBox, java.lang.Boolean> selectedProperty_3 = BeanProperty
				.create("selected");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Boolean, javax.swing.JCheckBox, java.lang.Boolean> autoBinding_23 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						undownloadableProperty, undownloadableJCheckBox,
						selectedProperty_3);
		autoBinding_23.bind();
		//
		BeanProperty<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer> yearProperty = BeanProperty
				.create("year");
		BeanProperty<javax.swing.JSlider, java.lang.Integer> valueProperty_5 = BeanProperty
				.create("value");
		AutoBinding<nl.tue.ieis.is.bpms.model.BPMSTable, java.lang.Integer, javax.swing.JSlider, java.lang.Integer> autoBinding_24 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, bPMSTable,
						yearProperty, yearJSlider, valueProperty_5);
		autoBinding_24.bind();
		//
		BindingGroup bindingGroup = new BindingGroup();
		bindingGroup.addBinding(autoBinding);
		bindingGroup.addBinding(autoBinding_1);
		bindingGroup.addBinding(autoBinding_2);
		bindingGroup.addBinding(autoBinding_3);
		bindingGroup.addBinding(autoBinding_4);
		bindingGroup.addBinding(autoBinding_5);
		bindingGroup.addBinding(autoBinding_6);
		bindingGroup.addBinding(autoBinding_7);
		bindingGroup.addBinding(autoBinding_8);
		bindingGroup.addBinding(autoBinding_9);
		bindingGroup.addBinding(autoBinding_10);
		bindingGroup.addBinding(autoBinding_11);
		bindingGroup.addBinding(autoBinding_12);
		bindingGroup.addBinding(autoBinding_13);
		bindingGroup.addBinding(autoBinding_14);
		bindingGroup.addBinding(autoBinding_15);
		bindingGroup.addBinding(autoBinding_16);
		bindingGroup.addBinding(autoBinding_17);
		bindingGroup.addBinding(autoBinding_18);
		bindingGroup.addBinding(autoBinding_19);
		bindingGroup.addBinding(autoBinding_20);
		bindingGroup.addBinding(autoBinding_21);
		bindingGroup.addBinding(autoBinding_22);
		bindingGroup.addBinding(autoBinding_23);
		bindingGroup.addBinding(autoBinding_24);
		//
		return bindingGroup;
	}

	public nl.tue.ieis.is.bpms.model.BPMSTable getBPMSTable() {
		return bPMSTable;
	}

	public void setBPMSTable(nl.tue.ieis.is.bpms.model.BPMSTable newBPMSTable) {
		setBPMSTable(newBPMSTable, true);
	}

	public void setBPMSTable(nl.tue.ieis.is.bpms.model.BPMSTable newBPMSTable,
			boolean update) {
		bPMSTable = newBPMSTable;
		if (update) {
			if (m_bindingGroup != null) {
				m_bindingGroup.unbind();
				m_bindingGroup = null;
			}
			if (bPMSTable != null) {
				m_bindingGroup = initDataBindings();
			}
		}
	}

}
