package ru.otus.jms.client.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class HeavyBusinessServiceImpl implements HeavyBusinessService {

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

        log.error( "we sended back {}", response );
        return response;
    }
}
