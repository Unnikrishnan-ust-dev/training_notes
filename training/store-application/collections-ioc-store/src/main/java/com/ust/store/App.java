package com.ust.store;

import org.springframework.beans.BeansException;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger("Application");
        try (FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml")) {
			Store store = (Store)context.getBean("store");
			logger.info(store.toString());
		} catch (BeansException e) {
			e.printStackTrace();
		}
    }
}
