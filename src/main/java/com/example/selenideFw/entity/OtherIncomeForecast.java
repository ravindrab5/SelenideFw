package com.example.selenideFw.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OtherIncomeForecast {
    private Date lastUpdateDate;
    private Date createdDate;
}
