package com.ripplehire.candidate.delegate;

import com.ripplehire.candidate.constants.ApplicationConstants;
import com.ripplehire.candidate.entities.ParentCompanyMstr;
import com.ripplehire.candidate.exception.ApplicationException;
import com.ripplehire.candidate.service.CandidateService;
import com.ripplehire.candidate.service.CompanyService;
import com.ripplehire.candidate.service.JobService;
import com.ripplehire.candidate.vo.CandidateRequestVO;
import com.ripplehire.candidate.vo.CandidateResponseVO;
import com.ripplehire.candidate.vo.JobVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CandidateDelegate {

    private static final Logger logger = Logger
            .getLogger(CandidateDelegate.class);

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private JobService jobService;

    public CandidateResponseVO fetchCandidateResponseByRhId(CandidateRequestVO candidateRequestVO) throws ApplicationException {
        try{
            List<Integer> listOfCompanies = new ArrayList<>();
            listOfCompanies.add(candidateRequestVO.getCompanyMstrSeq());
            ParentCompanyMstr parentCompanyMstr = companyService.fetchParentFromCompanyMstrSeq(candidateRequestVO.getCompanyMstrSeq());
            if(!(parentCompanyMstr.getParentCompanySeq() == ApplicationConstants.INT_ZERO)){
                listOfCompanies.add(parentCompanyMstr.getParentCompanySeq());
            }
            CandidateResponseVO candidateResponseVO = candidateService.fetchCandidateResponseByRhIdAndListOfCompanySeq(candidateRequestVO.getRipplehireId(),listOfCompanies);
            JobVO jobDetails = jobService.getJobDetailsFromRhID(candidateRequestVO.getRipplehireId(),listOfCompanies);
            candidateResponseVO.setJob(jobDetails);
            return candidateResponseVO;
        }catch(Exception e){
            throw e;
        }

    }

}
