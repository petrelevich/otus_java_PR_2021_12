package ru.otus.jms.client.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {

    @Value( "${queue.name}" )
    private String QUEUE_NAME;
    private final String TOPIC_NAME = "otus_topic";

    @Bean
    public Queue queue(){
        return new Queue( QUEUE_NAME );
    }
}
