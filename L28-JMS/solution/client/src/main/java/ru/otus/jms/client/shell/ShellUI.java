package ru.otus.jms.client.shell;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import ru.otus.jms.client.mq.MqProducer;

@ShellComponent
@Slf4j
@RequiredArgsConstructor
public class ShellUI {
    private final MqProducer producer;

    @ShellMethod(value = "send", key = {"s", "send"})
    public String send( @ShellOption String message ){
        log.error( message );
        producer.send( message );
        return "";
    }
}
