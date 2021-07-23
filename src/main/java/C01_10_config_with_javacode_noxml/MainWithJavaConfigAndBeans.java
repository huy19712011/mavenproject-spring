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
        Coach theCoach = context.getBean("otherSwimCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }

}
