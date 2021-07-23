/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_07_config_with_annotations;

import C01_04_ioc_xmlConfig.Coach;
import C01_04_ioc_xmlConfig.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
//@Component("thatSillyCoach") // bean id on .xml file
//@Component("tennisCoach") //
@Component// default id = "tennisCoach" - the same as class name
@Scope("prototype")
public class TennisCoach implements Coach {

    /*
    @Autowired
//    @Qualifier("happyFortuneService")
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">>> inside default constructor"); // for debug only
    }
    */

    // defile setter for autowiring
    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">>> TennisCoach: inside setFortuneService() method"); // for debug only
        this.fortuneService = fortuneService;
    }
    */

    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    // 73: Using @Qualifier with constructor
    private final FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practice tennis 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
