package com.example.hotelsupport.controller;

import com.example.hotelsupport.model.CaseSupport;
import com.example.hotelsupport.service.CaseService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SupportController {
    @Autowired
    CaseService service;

    @GetMapping(path = "/cases")
    public List<CaseSupport> getAllCases() {
        return service.getAllCases();
    }

    @HystrixCommand(fallbackMethod = "getFallbackService",
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "20"),
                    @HystrixProperty(name = "maxQueueSize", value = "10"),
            }
    )
    @GetMapping(path = "/cases/{id}")
    public Optional<CaseSupport> getCaseById(@PathVariable("id") long id) {
        return service.getCaseById(id);
    }

    public List<CaseSupport> getFallbackService(@PathVariable("id") long id) {
        List<CaseSupport> supportList = new ArrayList<>();
        supportList.add(new CaseSupport());
        return supportList;
    }
}