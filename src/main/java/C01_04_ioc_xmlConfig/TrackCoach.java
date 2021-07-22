/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_04_ioc_xmlConfig;

/**
 *
 * @author huynq
 */
public class TrackCoach implements Coach {

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5000m";
    }

}
