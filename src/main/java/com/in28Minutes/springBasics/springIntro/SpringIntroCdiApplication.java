
package com.in28Minutes.springBasics.springIntro;

import com.in28Minutes.springBasics.springIntro.cdi.SomeCDIBussiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringIntroCdiApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIntroCdiApplication.class);
    public static void main(String[] args) {

        //Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringIntroCdiApplication.class, args);

        SomeCDIBussiness someCDIBussiness = applicationContext.getBean(SomeCDIBussiness.class);
        LOGGER.info("{}", someCDIBussiness);
        LOGGER.info("{}", someCDIBussiness.getSomeCDIDao());

    }

}
