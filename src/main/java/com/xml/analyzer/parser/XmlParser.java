package com.xml.analyzer.parser;

import com.xml.analyzer.node.XmlNode;
import com.xml.analyzer.result.Result;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class XmlParser {
    @Getter
    @Setter
    @Autowired
    private XmlNode xmlNode;

    @Getter
    @Setter
    @Autowired
    public Result result;

    public abstract Result parseXMLFromUrl(String url);
}
