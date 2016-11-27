package com.rjbits.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")    
public class WarController {

    @RequestMapping(value = "/bebi", method = RequestMethod.GET)
    public String get() {
        return "Hola mundo :D";
    }
    
    @RequestMapping(value = "/holi", method = RequestMethod.GET)
    public String getHoli() {
    	return "Holi estamos en pruebas :)";
    }
}


