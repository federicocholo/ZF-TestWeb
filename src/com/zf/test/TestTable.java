package com.zf.test;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TestTable implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int keyIndex = 0;
	private String text = "";
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date date = new Date();
	public TestTable() {
		super();
	}
	public TestTable(int index) {
		this.keyIndex = index;
	}
	public int getKeyIndex() {
		return keyIndex;
	}
	public void setKeyIndex(int index) {
		this.keyIndex = index;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
