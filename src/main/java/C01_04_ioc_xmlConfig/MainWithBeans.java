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
public class MainWithBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // load config file
        ClassPathXmlApplicationContext context
            = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }

}
