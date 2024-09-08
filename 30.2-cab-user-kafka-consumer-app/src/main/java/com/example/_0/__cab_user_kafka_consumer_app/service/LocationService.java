package com.example._0.__cab_user_kafka_consumer_app.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics ="location",groupId = "userGroup")
    public void fetchUpdatedLocation(String location){
        System.out.println(location);
    }
}
