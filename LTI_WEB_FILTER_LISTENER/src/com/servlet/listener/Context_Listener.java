package com.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Context_Listener implements ServletContextListener {

    public Context_Listener() {
    	System.out.println("Context_Listener->default constructor...");
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("Context_Listener->Inititalized...");
	}

	public void contextDestroyed(ServletContextEvent arg0)  { 
		System.out.println("Context_Listener->contextDestroyed...");
    }
	
}
