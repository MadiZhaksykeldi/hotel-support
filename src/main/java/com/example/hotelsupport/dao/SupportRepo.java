package com.example.hotelsupport.dao;

import com.example.hotelsupport.model.CaseSupport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupportRepo extends JpaRepository<CaseSupport, Long> {

}