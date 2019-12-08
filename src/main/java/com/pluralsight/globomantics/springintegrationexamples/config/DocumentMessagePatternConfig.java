package com.pluralsight.globomantics.springintegrationexamples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableIntegration
public class DocumentMessagePatternConfig {
    @Bean
    public MessageChannel reservationRecordChannel() {
        return new DirectChannel();
    }
}
