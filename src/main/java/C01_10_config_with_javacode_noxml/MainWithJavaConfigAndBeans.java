/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_10_config_with_javacode_noxml;

import C01_04_ioc_xmlConfig.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author huynq
 */
public class MainWithJavaConfigAndBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // read config file
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        OtherSwimCoach theCoach = context.getBean("otherSwimCoach", OtherSwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // get injecting values from properties file
        System.out.println("email:" + theCoach.getEmail());
        System.out.println("team:" + theCoach.getTeam());

        // close the context
        context.close();
    }

}
