package com.wxz.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wangxingze
 * @date 2019-08-26 12:58
 */
@RestController
public class Test {

    @Value("${foo}")
    public String  foo;

    @GetMapping("/t")
    public String t(){
        return foo;
    }
}
