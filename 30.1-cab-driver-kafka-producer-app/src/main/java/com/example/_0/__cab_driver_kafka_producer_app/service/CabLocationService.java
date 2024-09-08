package com.example._0.__cab_driver_kafka_producer_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void updateLocation(String location){
        kafkaTemplate.send("location",location);
    }
}
