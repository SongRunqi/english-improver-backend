package com.ei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Crean Culty
 * @date 2023/12/16
 */
@RestController
@RequestMapping("/main")
public class MainController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
