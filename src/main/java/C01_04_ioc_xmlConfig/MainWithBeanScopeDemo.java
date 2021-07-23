/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_04_ioc_xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author huynq
 */
public class MainWithBeanScopeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // load config file
        ClassPathXmlApplicationContext context
            = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // compare objects
        System.out.println("Pointing to the same object: " + (theCoach == alphaCoach));

        System.out.println("Memory location for theCoach" + theCoach);
        System.out.println("Memory location for alphaCoach" + alphaCoach);

        // close the context
        context.close();
    }

}
