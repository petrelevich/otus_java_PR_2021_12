package ru.otus.jms.client.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import ru.otus.jms.client.services.HeavyBusinessService;

@Component
@RequiredArgsConstructor
@Slf4j
public class Receiver {
    private final HeavyBusinessService heavyBusinessService;

    @RabbitListener(queues = {"${queue.name}"})
    public void receiveMessage(String message){
        log.error( "We got message '{}'", message );
        heavyBusinessService.process( message );
    }
}
