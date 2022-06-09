/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.bus.rest;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author favio
 */
@RestController
public class BusRest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusRest.class);

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/bus")
    public Object bus() {
        LOGGER.info("Bus bus");

        Object response = restTemplate.getForObject("http://service-tasador/tasador", Object.class);

        return response;
    }

}
