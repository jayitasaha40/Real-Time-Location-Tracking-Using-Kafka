package com.deliveryboy.Deliveryboy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.Deliveryboy.config.AppConstants;

@Service
public class KafkaService {
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate; //We are passing string string as key value

    public boolean updateLocation(String location){
         kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
         return true;
    }
}
