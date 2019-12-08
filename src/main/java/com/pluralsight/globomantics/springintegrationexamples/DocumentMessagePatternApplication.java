package com.pluralsight.globomantics.springintegrationexamples;

import com.pluralsight.globomantics.springintegrationexamples.model.ReservationRecord;
import com.pluralsight.globomantics.springintegrationexamples.services.RegistrationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DocumentMessagePatternApplication implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(DocumentMessagePatternApplication.class);

    @Autowired
    private RegistrationService registrationService;

    @Override
    public void run(String... args) throws Exception {
        registrationService.updateReservationRecord(new ReservationRecord("Person A", new Date()));
    }

    public static void main(String[] args) {
        SpringApplication.run(DocumentMessagePatternApplication.class, args);
    }
}
