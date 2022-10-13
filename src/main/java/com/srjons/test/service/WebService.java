package com.srjons.test.service;

import org.springframework.stereotype.Service;

@Service
public class WebService {

    public String status() {
        System.out.println("WebService: status:up");
        return "true";
    }
}
