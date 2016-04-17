package com.zf.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ManageTestTable {
	private Session session = null;
	   // This method returns the Table based on a key
	   public TestTable getTestTable(int index) {
		  TestTable table = new TestTable(index);
	      try {
	         session = HibernateUtil.getSessionFactory().openSession();
	         table = (TestTable) session.get(TestTable.class, index);
	      } catch (HibernateException e) {
	         e.printStackTrace();
	      } finally {
	         session.close();
	      }
	      return table;
	   }
	   // This method saves the Table
	   public boolean saveOrUpdate(TestTable table) {
	      try {
	         session = HibernateUtil.getSessionFactory().openSession();
	         session.beginTransaction();
	         session.saveOrUpdate(table);
	         session.getTransaction().commit();
	      } catch (HibernateException e) {
	         e.printStackTrace();
	         return false;
	      } finally {
	         session.close();
	      }
	      return true;
	   }
}
