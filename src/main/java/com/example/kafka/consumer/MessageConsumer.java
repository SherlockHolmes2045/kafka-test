package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {


    @KafkaListener(topics = {"kafka-test"}, /*groupId = "${spring.kafka.consumer.group-id}",*/id = "myConsumer", autoStartup = "false")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}