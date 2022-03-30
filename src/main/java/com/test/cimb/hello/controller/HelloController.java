package com.test.cimb.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public ResponseEntity<?> hello(){
        //for testing test test
        //for test gitlab gitlogin

        return ResponseEntity.ok().body("Hello HKEX");
    }



}
