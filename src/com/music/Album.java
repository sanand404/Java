package com.music;

public class Album {
	private String name;
	private String lib_name;
	
	public Album(){}

	public Album(String name, String lib_name) {
		super();
		this.name = name;
		this.lib_name = lib_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLib_name() {
		return lib_name;
	}

	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}
	
	
			
}
