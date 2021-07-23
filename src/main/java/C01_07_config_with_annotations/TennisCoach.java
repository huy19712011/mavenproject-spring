/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_07_config_with_annotations;

import C01_04_ioc_xmlConfig.Coach;
import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
@Component("thatSillyCoach") // bean id on .xml file
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice tennis 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
