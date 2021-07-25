package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
class EventInstance {
  private Date startDate;
  private Date endDate;

  public EventInstance() {
  }

  public EventInstance(Date startDate, Date endDate) {
    this.startDate = startDate;
    this.endDate = endDate;
  }
}
