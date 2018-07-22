package com.ripplehire.candidate.repositories;

import com.ripplehire.candidate.entities.EmplRefrl;
import com.ripplehire.candidate.vo.CandidateResponseVO;
import com.ripplehire.candidate.vo.JobVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmplRefrlRepository extends JpaRepository<EmplRefrl,Integer>{

    @Query("select new com.ripplehire.candidate.vo.CandidateResponseVO(COALESCE(c.salutation,''), COALESCE(c.firstName,''),COALESCE(c.lastName,''), COALESCE(c.emailAddr,''),COALESCE(c.phoneNo,''), COALESCE(c.alternatePhoneNo,'')) from EmplRefrl e inner join e.candidate c" +
            " inner join e.job j where e.ripplehireSeq =:rhId and e.companyMstrSeq in(:listOfCompanySeq)")
    CandidateResponseVO fetchCandidateResponseByRhId(@Param("rhId") String rhId,@Param("listOfCompanySeq") List<Integer> listOfCompanySeq);



}
