package com.ripplehire.candidate.service;

import com.ripplehire.candidate.entities.JobDetail;
import com.ripplehire.candidate.exception.ApplicationException;
import com.ripplehire.candidate.repositories.JobRepository;
import com.ripplehire.candidate.vo.JobVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private static final Logger logger = Logger
            .getLogger(JobService.class);

    @Autowired
    private JobRepository jobRepository;

    public JobVO getJobDetailsFromRhID(String rhId,List<Integer> listOfCompanyMstrSeq)  throws ApplicationException {
        try{
            JobVO jobDetails = jobRepository.fetchJobDetailsFromRhid(rhId,listOfCompanyMstrSeq);
            return jobDetails;
        }catch(Exception e){
            e.printStackTrace();
            logger.error("Error in getJobDetailsFromRhID with "+e);
            throw new ApplicationException("Error in getJobDetailsFromRhID with"+e);
        }


    }
}
