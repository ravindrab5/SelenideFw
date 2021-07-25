package com.example.selenideFw.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Type {
    REVENUE("Revenue Only"),
    STATISTICS("Statistics"),
    STATS_AND_REVENUE("Stats & Revenue");

    private String description;
}
