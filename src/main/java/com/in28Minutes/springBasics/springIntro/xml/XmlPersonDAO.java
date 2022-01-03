package com.in28Minutes.springBasics.springIntro.xml;

public class XmlPersonDAO {

    private XmlJdbcTemplate xmlJdbcTemplate;

    public XmlJdbcTemplate getXmlJdbcTemplate() {
        return xmlJdbcTemplate;
    }

    public void setXmlJdbcTemplate(XmlJdbcTemplate xmlJdbcTemplate) {
        this.xmlJdbcTemplate = xmlJdbcTemplate;
    }
}

