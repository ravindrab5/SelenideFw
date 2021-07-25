package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DateRange {
    private  LocalDate startDate;
    private LocalDate endDate;
}
