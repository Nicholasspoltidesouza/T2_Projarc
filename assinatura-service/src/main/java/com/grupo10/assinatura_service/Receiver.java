package com.grupo10.assinatura_service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    public static final String queueName = "conversions.v1.conversion-request.save-history";
    private static Logger logger = LogManager.getLogger(Receiver.class);

    @RabbitListener(queues = queueName)
    public void receive(AssinaturaDTO dto) {
        logger.info("Mensagem recebida: " + dto);
    }
}