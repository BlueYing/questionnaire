package com.sgcc;

import java.util.List;

public class Filed {
	private String id;
	private String titlename;
	private String type;
	private String length;
	private String att;
	private List<FiledV2> tong;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitlename() {
		return titlename;
	}
	public void setTitlename(String titlename) {
		this.titlename = titlename;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getAtt() {
		return att;
	}
	public void setAtt(String att) {
		this.att = att;
	}
	public List<FiledV2> getTong() {
		return tong;
	}
	public void setTong(List<FiledV2> tong) {
		this.tong = tong;
	}

	
}
