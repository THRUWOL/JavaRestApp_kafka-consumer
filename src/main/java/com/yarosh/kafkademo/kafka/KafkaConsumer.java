package com.yarosh.kafkademo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics="cats", groupId = "my_consumer")
    public void listener(String message) {
        log.info("Received message: " + message);
    }
}
