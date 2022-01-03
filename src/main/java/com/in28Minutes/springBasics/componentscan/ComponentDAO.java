package com.in28Minutes.springBasics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
    @Autowired
    private  ComponentJdbcTemplate componentJdbcTemplate;

    public ComponentJdbcTemplate getComponentJdbcTemplate() {
        return componentJdbcTemplate;
    }

    public void setComponentJdbcTemplate(ComponentJdbcTemplate componentJdbcTemplate) {
        this.componentJdbcTemplate = componentJdbcTemplate;
    }




}
