package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BetaFeatures {
    private boolean isUserSessionEnabled;
    private boolean isScimEmailChangeEnabled;
    private boolean isOldRoomsChangeGoalAdjustmentEnabled;
    private boolean isFnbAutoAdjustEnabled;
    private boolean isActionRequestEnabled;
}
