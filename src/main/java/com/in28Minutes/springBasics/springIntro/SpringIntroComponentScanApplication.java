package com.in28Minutes.springBasics.springIntro;

import com.in28Minutes.springBasics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28Minutes.springBasics.componentscan")
public class SpringIntroComponentScanApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIntroComponentScanApplication.class);
    public static void main(String[] args) {

        //Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringIntroComponentScanApplication.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        //ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);
        LOGGER.info("{}", componentDAO);
        LOGGER.info("{}", componentDAO.getComponentJdbcTemplate());
        //LOGGER.info("{}", componentDAO2);
        //LOGGER.info("{}", componentDAO2.getComponentJdbcTemplate());

    }

}

