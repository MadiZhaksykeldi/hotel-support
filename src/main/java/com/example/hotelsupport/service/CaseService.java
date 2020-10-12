package com.example.hotelsupport.service;

import com.example.hotelsupport.dao.SupportRepo;
import com.example.hotelsupport.model.CaseSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CaseService {
    @Autowired
    SupportRepo Ratings;

    public List<CaseSupport> getAllCases() {
        return Ratings.findAll();
    }

    public Optional<CaseSupport> getCaseById(long id) {
        return Ratings.findById(id);
    }
}