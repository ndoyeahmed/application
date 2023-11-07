package com.seneau.application.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRequest {
    private Long id;
    private String clientId;
    private String applicationName;
    private String description;
    private String icon;
    private boolean active;
}
