package com.seneau.application.services;

import com.seneau.application.data.dto.ApplicationRequest;
import com.seneau.application.data.dto.ApplicationResponse;

import java.util.List;

public interface ApplicationService {
    ApplicationResponse createApplication(ApplicationRequest applicationRequest);
    List<ApplicationResponse> getAllApplication(List<String> applicationClientIds);
}
