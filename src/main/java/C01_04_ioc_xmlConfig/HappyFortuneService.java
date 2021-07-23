/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_04_ioc_xmlConfig;

import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {

        return "Today is your lucky day!!!";
    }

}
