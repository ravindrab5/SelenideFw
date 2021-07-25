package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SsoConfig {
    private boolean isSSOEnabled;
    private String cognitoClientId;
    private String cognitoClientSecret;
    private String cognitoPoolId;
    private String cognitoRegion;
    private String cognitoCustomDomain;
    private String cognitoRedirectUrl;
    private String cognitoIdentityProvider;
    private boolean autoUserMappingEnabled;
    private String logoutRedirectUrl;
}
