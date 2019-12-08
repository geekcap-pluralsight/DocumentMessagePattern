package com.pluralsight.globomantics.springintegrationexamples.model;

import java.util.Date;

public class ReservationRecord {
    private String name;
    private Date checkInDate;

    public ReservationRecord() {
    }

    public ReservationRecord(String name, Date checkInDate) {
        this.name = name;
        this.checkInDate = checkInDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    @Override
    public String toString() {
        return "ReservationRecord{" +
                "name='" + name + '\'' +
                ", checkInDate=" + checkInDate +
                '}';
    }
}
