/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_07_config_with_annotations;

import C01_04_ioc_xmlConfig.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author huynq
 */
public class MainWithAnnotationsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // read the spring config file
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext_C01_07.xml");

        // get the bean from container (beans on .xml)
//        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call methods
        System.out.println(theCoach.getDailyWorkout());
        //System.out.println(theCoach.getDailyFortune()); // will not work

        // close the context
        context.close();
    }

}
