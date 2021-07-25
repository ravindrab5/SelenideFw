package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Occupancy {
    private Date occupancyDate;
    private Integer propertyId;
    private String source;
    private long hotelCapacity;
    private Long oooRooms;
    private Long netAvlRooms;
    private Long roomsUnSold;
    private int roomsSold;
}

