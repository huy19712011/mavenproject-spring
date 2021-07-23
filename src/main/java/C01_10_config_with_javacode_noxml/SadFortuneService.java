/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_10_config_with_javacode_noxml;

import C01_04_ioc_xmlConfig.FortuneService;

/**
 *
 * @author huynq
 */
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }

}
