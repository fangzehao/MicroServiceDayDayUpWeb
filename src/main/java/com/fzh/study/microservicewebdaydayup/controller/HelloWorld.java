package com.fzh.study.microservicewebdaydayup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangzehao
 * @date 2023/3/17 18:01
 */
@RestController
@RequestMapping("/dayDayUp")
public class HelloWorld {

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }
}
