/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C01_07_config_with_annotations;

import C01_04_ioc_xmlConfig.FortuneService;
import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
@Component
public class RandomFortuneService implements FortuneService {

    // create an array of String
    private final String[] data = {
        "random string 1",
        "random string 2",
        "random string 3"
    };

    // create a random number generator
    private final Random myRandom = new Random();

    @Override
    public String getFortune() {

        // pick a random string from array
        int index = myRandom.nextInt(data.length);
        return data[index];
    }

}
