package com.ripplehire.candidate.service;


import com.ripplehire.candidate.exception.ApplicationException;
import com.ripplehire.candidate.repositories.CandidateRepository;
import com.ripplehire.candidate.repositories.EmplRefrlRepository;
import com.ripplehire.candidate.vo.CandidateResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;

import java.util.List;


@Service
public class CandidateService {

    private static final Logger logger = Logger
            .getLogger(CandidateService.class);

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private EmplRefrlRepository emplRefrlRepository;

    public CandidateResponseVO fetchCandidateResponseByRhIdAndListOfCompanySeq(String rhId, List<Integer> listOfCompanySeq) throws ApplicationException {
        try{
            CandidateResponseVO candidateResponseVO = emplRefrlRepository.fetchCandidateResponseByRhId(rhId,listOfCompanySeq);
            return candidateResponseVO;
        }catch(Exception e){
            e.printStackTrace();
            logger.error("Error in fetchCandidateResponseByRhId with "+e);
            throw new ApplicationException("Error in fetchCandidateResponseByRhId with"+e);
        }

    }
}
