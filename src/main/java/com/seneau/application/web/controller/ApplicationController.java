package com.seneau.application.web.controller;

import com.seneau.application.data.dto.ApplicationRequest;
import com.seneau.application.data.dto.ApplicationResponse;
import com.seneau.application.services.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/application")
public class ApplicationController {
    private final ApplicationService applicationService;

    @PostMapping
    public ResponseEntity<ApplicationResponse> create(@RequestBody ApplicationRequest applicationRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(applicationService.createApplication(applicationRequest));
    }

    @GetMapping
    public ResponseEntity<List<ApplicationResponse>> getAllApplication(@RequestParam("applicationClientIds") List<String> applicationClientIds) {
        return ResponseEntity.ok(applicationService.getAllApplication(applicationClientIds));
    }

}
