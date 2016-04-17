package com.zf.test;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		ManageTestTable mtt = new ManageTestTable();
		
		// Add record to table
		TestTable table = new TestTable();
		table.setText("Test Text3");
		table.setDate(new Date());
		
		mtt.saveOrUpdate(table);
		
	}
}
