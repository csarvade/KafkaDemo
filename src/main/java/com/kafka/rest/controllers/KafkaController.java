package com.kafka.rest.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.services.KafkaProducerService;

@RestController
public class KafkaController {
    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/messages")
    public void sendMessageToKafka(@RequestBody String message) {
        producerService.sendMessage(message);
    }
}
