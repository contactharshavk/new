package org.mindtree.practice.trainingprog.dto;

import java.util.List;

public class CricketSquadeBean {
	
	private List<CricketPleayersName> pleayers;
	private String name;
	
	public List<CricketPleayersName> getPleayers() {
		return pleayers;
	}
	public void setPleayers(List<CricketPleayersName> pleayers) {
		this.pleayers = pleayers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
