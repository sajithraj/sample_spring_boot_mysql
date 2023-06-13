package com.srsprintboot.sample.sr;

public class Model {

	private int id;
	private String type;
	private String symbol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Model(int id, String type, String symbol) {
		this.id = id;
		this.type = type;
		this.symbol = symbol;
	}

}
