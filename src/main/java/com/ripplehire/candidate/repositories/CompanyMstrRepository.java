package com.ripplehire.candidate.repositories;

import com.ripplehire.candidate.entities.CompanyMstr;
import com.ripplehire.candidate.entities.ParentCompanyMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyMstrRepository extends JpaRepository<CompanyMstr,Integer>{

}
