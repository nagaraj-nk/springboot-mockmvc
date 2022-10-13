package com.srjons.test.controller;

import com.srjons.test.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class WebController {

    @Autowired
    private WebService webService;

    @GetMapping("/status")
    public String status() {
        webService.status();
        return "server: up";
    }
}
