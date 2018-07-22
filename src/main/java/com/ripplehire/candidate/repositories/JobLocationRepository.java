package com.ripplehire.candidate.repositories;

import com.ripplehire.candidate.entities.JobLocation;
import com.ripplehire.candidate.vo.JobVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JobLocationRepository extends JpaRepository<JobLocation,Integer>{


}
