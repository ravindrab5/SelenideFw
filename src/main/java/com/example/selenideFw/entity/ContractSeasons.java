package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ContractSeasons {
    private Date startDate;
    private  Date endDate;
    private boolean seasonClosed;
    private List<RoomCategoryMetrics> roomCategoryMetrics;
    private List<String> incidentals;
}
