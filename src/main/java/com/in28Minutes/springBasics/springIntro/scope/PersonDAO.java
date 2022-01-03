package com.in28Minutes.springBasics.springIntro.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

    @Autowired
    private JdbcTemplate JdbcTemplate;


    public JdbcTemplate getJdbcTemplate() {
        return JdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        JdbcTemplate = jdbcTemplate;
    }
}

