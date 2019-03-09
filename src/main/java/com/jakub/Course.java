package com.jakub;

import java.time.LocalDate;

public class Course {

    private final String name;
    private final LocalDate startDate;

    public Course(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public String name() {

        return name;
    }

    public boolean wasStartedBefore(LocalDate date) {
        return startDate.isAfter(date);
    }
}
