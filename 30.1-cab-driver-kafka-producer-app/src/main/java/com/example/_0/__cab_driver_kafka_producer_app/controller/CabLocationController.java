package com.example._0.__cab_driver_kafka_producer_app.controller;

import com.example._0.__cab_driver_kafka_producer_app.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PostMapping("/updateLocation")
    public String updateLocation(){
        for (int n=0;n<100;n++){
            cabLocationService.updateLocation(Math.random()+"::south");
        }
        return "testing the producer app";
    }
}
