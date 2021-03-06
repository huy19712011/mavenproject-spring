/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_10_config_with_javacode_noxml;

import C01_04_ioc_xmlConfig.Coach;
import C01_04_ioc_xmlConfig.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author huynq
 */
@Configuration
@ComponentScan({
    "C01_10_config_with_javacode_noxml",
    "C01_04_ioc_xmlConfig",
    "C01_07_config_with_annotations"})
@PropertySource("classpath:sport.properties")
public class SportConfig {

//    In summary: You can use @Bean to make an existing third-party class available to your Spring framework application context.
    // define bean for SadFortuneService
    @Bean
    public FortuneService sadFortuneService() { // method name = bean id
        return new SadFortuneService();
    }

    // define bean for OtherSwimCoach
    @Bean
    public Coach otherSwimCoach() {
        return new OtherSwimCoach(sadFortuneService());
    }

}
