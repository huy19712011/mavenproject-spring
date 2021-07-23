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
public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    private String email;

    private String team;

    // create no-arg constructor
    public FootballCoach() {
        System.out.println("FootballCoach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice football for 45 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // setter for bean
    public void setFortuneService(FortuneService fortuneService) {

        System.out.println("FootballCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("FootballCoach: inside setter method - setEmail");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("FootballCoach: inside setter method - setTeam");
        this.team = team;
    }

}
