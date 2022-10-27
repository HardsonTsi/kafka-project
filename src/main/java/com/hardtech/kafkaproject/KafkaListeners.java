package com.hardtech.kafkaproject;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "hardtech",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received " + data + " <3");
    }

}
