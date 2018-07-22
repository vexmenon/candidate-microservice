package com.ripplehire.candidate.repositories;

import com.ripplehire.candidate.entities.ParentCompanyMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentCompanyMstrRepository extends JpaRepository<ParentCompanyMstr,Integer>{

    @Query("select p from CompanyMstr cm inner join cm.parentCompanyMstr p where cm.companyMstrSeq=?1")
    ParentCompanyMstr fetchParentCompanyByCompanyMstrSeq(Integer companyMstrSeq);
}
