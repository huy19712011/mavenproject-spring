/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_07_config_with_annotations;

import C01_04_ioc_xmlConfig.FortuneService;
import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
