package com.example.hotelsupport.controller;

import com.example.hotelsupport.model.CaseSupport;
import com.example.hotelsupport.service.CaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SupportController {
    @Autowired
    CaseService service;

    @GetMapping(path = "/cases/{id}")
    public Optional<CaseSupport> getCaseById(@PathVariable("id") long id) {
        return service.getCaseById(id);
    }

    @GetMapping(path = "/cases")
    public List<CaseSupport> getAllCases() {
        return service.getAllCases();
    }
}