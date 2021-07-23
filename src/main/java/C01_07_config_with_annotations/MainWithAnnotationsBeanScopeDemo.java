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
public class MainWithAnnotationsBeanScopeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // load config file
        ClassPathXmlApplicationContext context
            = new ClassPathXmlApplicationContext("applicationContext_C01_07.xml");

        // retrieve bean from spring container
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
        TennisCoach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);

        // compare objects
         System.out.println(theCoach == alphaCoach);
         System.out.println("Memory location for theCoach: " + theCoach);
         System.out.println("Memory location for alphaCoach: " + alphaCoach);

        // close the context
        context.close();
    }

}
