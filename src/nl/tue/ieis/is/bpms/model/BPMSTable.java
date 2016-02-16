package nl.tue.ieis.is.bpms.model;

public class BPMSTable {
	private String id;
	private String searchTerms;
	private String title;
	private String authors;
	private int year;
	private int citation;
	private String database;
	private boolean undownloadable;
	private String source;
	private boolean duplication_measure;
	private boolean timeCitation_measure;
	private boolean status;
	private String reason;
	private String reference_architecture;
	private String nonreference_architecture;
	private int system_aggregation;
	private int data_aggregation;
	private int abstraction;
	private int realization;
	private String style;
	private String evaluation;
	private String layering;
	private String requirements;
	private String description;
	private String file;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSearchTerms() {
		return searchTerms;
	}
	public void setSearchTerms(String searchTerms) {
		this.searchTerms = searchTerms;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCitation() {
		return citation;
	}
	public void setCitation(int citation) {
		this.citation = citation;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public boolean isUndownloadable() {
		return undownloadable;
	}
	public void setUndownloadable(boolean undownloadable) {
		this.undownloadable = undownloadable;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public boolean isDuplication_measure() {
		return duplication_measure;
	}
	public void setDuplication_measure(boolean duplication_measure) {
		this.duplication_measure = duplication_measure;
	}
	public boolean isTimeCitation_measure() {
		return timeCitation_measure;
	}
	public void setTimeCitation_measure(boolean timeCitation_measure) {
		this.timeCitation_measure = timeCitation_measure;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReference_architecture() {
		return reference_architecture;
	}
	public void setReference_architecture(String reference_architecture) {
		this.reference_architecture = reference_architecture;
	}
	public String getNonreference_architecture() {
		return nonreference_architecture;
	}
	public void setNonreference_architecture(String nonreference_architecture) {
		this.nonreference_architecture = nonreference_architecture;
	}
	public int getSystem_aggregation() {
		return system_aggregation;
	}
	public void setSystem_aggregation(int system_aggregation) {
		this.system_aggregation = system_aggregation;
	}
	public int getData_aggregation() {
		return data_aggregation;
	}
	public void setData_aggregation(int data_aggregation) {
		this.data_aggregation = data_aggregation;
	}
	public int getAbstraction() {
		return abstraction;
	}
	public void setAbstraction(int abstraction) {
		this.abstraction = abstraction;
	}
	public int getRealization() {
		return realization;
	}
	public void setRealization(int realization) {
		this.realization = realization;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	public String getLayering() {
		return layering;
	}
	public void setLayering(String layering) {
		this.layering = layering;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public BPMSTable(String id, String searchTerms, String title, String authors,
			int year, int citation, String database, boolean undownloadable,
			String source, boolean duplication_measure,
			boolean timeCitation_measure, boolean status, String reason,
			String reference_architecture, String nonreference_architecture,
			int system_aggregation, int data_aggregation, int abstraction,
			int realization, String style, String evaluation, String layering,
			String requirements, String description, String file) {
		super();
		this.id = id;
		this.searchTerms = searchTerms;
		this.title = title;
		this.authors = authors;
		this.year = year;
		this.citation = citation;
		this.database = database;
		this.undownloadable = undownloadable;
		this.source = source;
		this.duplication_measure = duplication_measure;
		this.timeCitation_measure = timeCitation_measure;
		this.status = status;
		this.reason = reason;
		this.reference_architecture = reference_architecture;
		this.nonreference_architecture = nonreference_architecture;
		this.system_aggregation = system_aggregation;
		this.data_aggregation = data_aggregation;
		this.abstraction = abstraction;
		this.realization = realization;
		this.style = style;
		this.evaluation = evaluation;
		this.layering = layering;
		this.requirements = requirements;
		this.description = description;
		this.file = file;
	}
	public BPMSTable() {
	}
	
	public void setSearchTermAutomatically() {
		if(this.title.toLowerCase().contains("workflow"))
			this.searchTerms = "“architecture” + “workflow”";
		
		else if(this.title.toLowerCase().contains("orchestration"))
			this.searchTerms = "“architecture” + “orchestration”";
		
		else if(this.title.toLowerCase().contains("choreography") || this.title.toLowerCase().contains("choreographies"))
			this.searchTerms = "“architecture” + “choreography”";
		
		else if(this.title.toLowerCase().contains("business process management"))
			this.searchTerms = "“architecture” + “business process management”";
		
		else if(this.title.toLowerCase().contains("bpms"))
			this.searchTerms = "“architecture” + “bpms”";
		
		else if(this.title.toLowerCase().contains("bpm"))
			this.searchTerms = "“architecture” + “bpm”";
		
	}
}
