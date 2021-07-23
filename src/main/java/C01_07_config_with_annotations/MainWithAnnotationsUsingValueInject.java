/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_07_config_with_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author huynq
 */
public class MainWithAnnotationsUsingValueInject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // load config file
        ClassPathXmlApplicationContext context
            = new ClassPathXmlApplicationContext("applicationContext_C01_07.xml");

        // retrieve bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call method on the bean
         System.out.println(theCoach.getDailyWorkout());
         System.out.println(theCoach.getDailyFortune());

         System.out.println(theCoach.getEmail());
         System.out.println(theCoach.getTeam());

        // close the context
        context.close();
    }

}
