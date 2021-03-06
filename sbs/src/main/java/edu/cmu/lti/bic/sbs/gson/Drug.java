package edu.cmu.lti.bic.sbs.gson;

public class Drug {
	private String name = "";
	private String description = "";
	private String id = "";
	
	private double does;
	
	public Drug(){
	    this.name = "Default Drug";
	    this.description = "Default description";
	    this.id = "Default id";
	}
	


	//constructor without does
	public Drug(String name, String description, String id) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
	}



	public Drug setName(String name){
		this.name = name;
		return this;
	}
	public Drug setDescription(String description) {
		this.description = description;
		return this;
	}
	public Drug setId(String id){
		this.id = id;
		return this;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public String getDescription(){
		return description;
	}
}
