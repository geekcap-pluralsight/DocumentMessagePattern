package com.pluralsight.globomantics.springintegrationexamples.services;

import com.pluralsight.globomantics.springintegrationexamples.config.*;
import com.pluralsight.globomantics.springintegrationexamples.model.ReservationRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.IntegrationMessageHeaderAccessor;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private static final Logger logger = LogManager.getLogger(RegistrationServiceImpl.class);

    @Autowired
    private ReservationRecordGateway reservationRecordGateway;

    @Override
    public void updateReservationRecord(ReservationRecord record) {
        logger.info("RegistrationService: add registration record: {}", record);
        Message<ReservationRecord> message = MessageBuilder.withPayload(record)
                .setHeader(IntegrationMessageHeaderAccessor.SEQUENCE_NUMBER, 1)
                .setHeader(IntegrationMessageHeaderAccessor.SEQUENCE_SIZE, 5)
                .build();
        reservationRecordGateway.addRecord(message);
    }
}
