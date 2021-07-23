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
public class MainWithBeansUsingValueInject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // load config file
        ClassPathXmlApplicationContext context
            = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        FootballCoach theCoach = context.getBean("myFootballCoach", FootballCoach.class);

        // call method on the bean
         System.out.println(theCoach.getDailyWorkout());
         System.out.println(theCoach.getDailyFortune());

         System.out.println(theCoach.getEmail());
         System.out.println(theCoach.getTeam());

        // close the context
        context.close();
    }

}
