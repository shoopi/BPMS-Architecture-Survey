package nl.tue.ieis.is.bpms.model;

import java.util.List;

public class Duplication {

	private String title;
	private String author;
	private List<String> databases;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public List<String> getDatabases() {
		return databases;
	}
	public void setDatabases(List<String> databases) {
		this.databases = databases;
	}
	public Duplication(String title, String author, List<String> databases) {
		super();
		this.title = title;
		this.author = author;
		this.databases = databases;
	}
	
}
