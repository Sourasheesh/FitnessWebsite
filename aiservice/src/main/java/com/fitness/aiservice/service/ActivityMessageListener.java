package com.fitness.aiservice.service;

import com.fitness.aiservice.model.Activity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityMessageListener {
    @KafkaListener(topics = "${kafka.topic.name}", groupId = "activity-producer-group")
    public void activityProcessing(Activity activity){

        log.info("Recieved Activity for processing:${}" , activity.getUserId());
    }

}
