package com.pluralsight.globomantics.springintegrationexamples.config;

import com.pluralsight.globomantics.springintegrationexamples.model.ReservationRecord;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = "reservationRecordGateway", defaultRequestChannel = "reservationRecordChannel")
public interface ReservationRecordGateway {
    @Gateway
    void addRecord(Message<ReservationRecord> record);
}
