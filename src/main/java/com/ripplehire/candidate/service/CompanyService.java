package com.ripplehire.candidate.service;

import com.ripplehire.candidate.entities.ParentCompanyMstr;
import com.ripplehire.candidate.exception.ApplicationException;
import com.ripplehire.candidate.repositories.CompanyMstrRepository;
import com.ripplehire.candidate.repositories.ParentCompanyMstrRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {


    private static final Logger logger = Logger
            .getLogger(CompanyService.class);


    @Autowired
    private CompanyMstrRepository companyMstrRepository;

    @Autowired
    private ParentCompanyMstrRepository parentCompanyMstrRepository;

    public ParentCompanyMstr fetchParentFromCompanyMstrSeq(Integer companyMstrSeq) throws ApplicationException {
        try{
            ParentCompanyMstr parentCompanyMstr = parentCompanyMstrRepository.fetchParentCompanyByCompanyMstrSeq(companyMstrSeq);
            return parentCompanyMstr;
        }catch(Exception e){
            e.printStackTrace();
            logger.error("Error in fetchParentFromCompanyMstrSeq with "+e);
            throw new ApplicationException("Error in fetchParentFromCompanyMstrSeq with"+e);
        }
    }


}
