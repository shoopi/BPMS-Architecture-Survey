
package nl.tue.ieis.is.bpms.model;

public class TimeCitation {
	private int year;
	private int citation;
	public TimeCitation(int year, int citation) {
		super();
		this.year = year;
		this.citation = citation;
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
	
}
