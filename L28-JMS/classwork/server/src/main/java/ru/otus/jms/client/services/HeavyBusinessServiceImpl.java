package ru.otus.jms.client.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class HeavyBusinessServiceImpl implements HeavyBusinessService {
    private final RabbitTemplate rabbitTemplate;
    private final TopicExchange topic;

    @Value("${routing.back}")
    private String ROUTING_KEY;

    @Override
    public String process( String value ) {
        try {
            Thread.sleep( 5000 );
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }
        var response = value.toUpperCase();
        log.error( "we ready to send back" );
        rabbitTemplate.convertAndSend( topic.getName(), ROUTING_KEY, response );
        log.error( "we sended back {}", response );
        return response;
    }
}
