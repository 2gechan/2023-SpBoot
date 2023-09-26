package com.gechan.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        log.debug("여기는 HelloController");
        return "hello";
    }
}
