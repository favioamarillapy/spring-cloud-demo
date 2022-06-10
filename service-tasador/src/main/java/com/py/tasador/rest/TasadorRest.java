/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.tasador.rest;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author favio
 */
@RestController
public class TasadorRest {

    private static final Logger LOGGER = LoggerFactory.getLogger(TasadorRest.class);

    @GetMapping("/tasador")
    public Map<String, Object> bus() {
        LOGGER.info("Bus bus");

        Map<String, Object> data = new HashMap<>();
        data.put("id", 1);
        data.put("messageID", "asd98as87as");
        data.put("monto", "200");

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "Exito al realizar la tasación");
        response.put("data", data);

        return response;
    }

}
