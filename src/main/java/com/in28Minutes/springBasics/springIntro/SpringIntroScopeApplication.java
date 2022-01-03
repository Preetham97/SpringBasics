
package com.in28Minutes.springBasics.springIntro;

import com.in28Minutes.springBasics.springIntro.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringIntroScopeApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIntroScopeApplication.class);
    public static void main(String[] args) {

        //Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringIntroScopeApplication.class, args);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcTemplate());
        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcTemplate());

    }

}
