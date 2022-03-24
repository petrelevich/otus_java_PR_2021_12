package ru.otus.jms.client.config;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {

    @Value("${topic.name}")
    private String TOPIC_NAME;

    @Bean
    public TopicExchange topic() {
        return new TopicExchange( TOPIC_NAME, true , true);
    }
}
