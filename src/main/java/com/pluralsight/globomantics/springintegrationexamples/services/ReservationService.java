package com.pluralsight.globomantics.springintegrationexamples.services;

import com.pluralsight.globomantics.springintegrationexamples.model.ReservationRecord;
import org.springframework.messaging.Message;

public interface ReservationService {
    void addRecord(Message<ReservationRecord> message);
}
