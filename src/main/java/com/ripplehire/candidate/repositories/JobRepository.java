package com.ripplehire.candidate.repositories;

import com.ripplehire.candidate.entities.Job;
import com.ripplehire.candidate.vo.JobVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer>{

    @Query("select new com.ripplehire.candidate.vo.JobVO(CONCAT(COALESCE(j.jobSeq,''),''),COALESCE(j.jobCd,''),COALESCE(j.jobTitle,''), CONCAT(COALESCE(j.reqExpMin,''),''), CONCAT(COALESCE(j.reqExpMax,''),''), COALESCE(lm.city,''), CONCAT(COALESCE(j.totalPositions,''),'')) from EmplRefrl e,Job j,JobLocation jl,LocationMstr lm" +
            " where e.job.jobSeq = j.jobSeq and j.jobSeq = jl.job.jobSeq and jl.locationMstr.locationMstrSeq = lm.locationMstrSeq and e.ripplehireSeq =:rhId and e.companyMstrSeq in(:listOfCompanySeq)")
    JobVO fetchJobDetailsFromRhid(@Param("rhId") String rhId, @Param("listOfCompanySeq") List<Integer> listOfCompanySeq);
}
