package com.dmgctrll;

public class CryptogramSelectionItem {
	
	private String name;
	private String resource;
	
	private CryptogramSelectionItem (String name, String resource) {
		this.name = name;
		this.resource = resource;
	}

	public String getName() {
		return name;
	}

	public String getResource() {
		return resource;
	}

	

}
