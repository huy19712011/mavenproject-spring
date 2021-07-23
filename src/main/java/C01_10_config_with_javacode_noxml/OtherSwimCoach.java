/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_10_config_with_javacode_noxml;

import C01_04_ioc_xmlConfig.Coach;
import C01_04_ioc_xmlConfig.FortuneService;

/**
 *
 * @author huynq
 */
public class OtherSwimCoach implements Coach {

    private FortuneService fortuneService;

    public OtherSwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 m as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
