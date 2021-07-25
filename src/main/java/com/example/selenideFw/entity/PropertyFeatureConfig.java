package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyFeatureConfig {
    private String clientCode;
    private String propertyCode;
    private boolean notificationsEnabled;
    private boolean notificationsInternal;
    private String notificationsEmail;
    private String g2HostUrl;
    private String defaultTimeZone;
    private Features features;
    private BetaFeatures betaFeatures;
    private SsoConfig ssoConfig;

}
