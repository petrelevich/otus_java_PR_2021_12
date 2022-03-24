package ru.otus.jms.client.mq;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MqProducer {
    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    public void send( String message ) {
        rabbitTemplate.convertAndSend( queue.getName(), message );
    }
}
