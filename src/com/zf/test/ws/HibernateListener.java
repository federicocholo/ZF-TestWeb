package com.zf.test.ws;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.zf.test.HibernateUtil;

public class HibernateListener implements ServletContextListener {  
	  
    public void contextInitialized(ServletContextEvent event) {  
        HibernateUtil.getSessionFactory();      
    }  
  
    public void contextDestroyed(ServletContextEvent event) {  
        HibernateUtil.getSessionFactory().close();  
    }  
}
