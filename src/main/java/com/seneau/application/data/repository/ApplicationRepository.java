package com.seneau.application.data.repository;

import com.seneau.application.data.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByClientIdInAndActiveTrue(List<String> applicationClientIds);
}
