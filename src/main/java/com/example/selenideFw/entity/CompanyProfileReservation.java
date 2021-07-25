package com.example.selenideFw.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "companyProfileReservation")
public class CompanyProfileReservation {
    @Id
    private String id;
    private int propertyId;
    private String companyProfileID;
    private String confirmationNumber;
    private Date occupancyDate;
    private int reservationRoomCount;
    private String reservationStatus;
    private String isPseudoRoom;
    private String stayedRoomType;
    private String marketCode;
}
