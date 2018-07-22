package com.ripplehire.candidate.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ripplehire.candidate.delegate.CandidateDelegate;
import com.ripplehire.candidate.vo.CandidateRequestVO;
import com.ripplehire.candidate.vo.CandidateResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value="/candidate-end-point")
public class CandidateWebService {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private CandidateDelegate candidateDelegate;



    @PostMapping(value="/by-rhid")
    public ResponseEntity fetchCandidateDetailByRhId(@RequestBody CandidateRequestVO candidateRequestVO,Errors errors){
        try{

            CandidateResponseVO candidateResponseVO = candidateDelegate.fetchCandidateResponseByRhId(candidateRequestVO);
            return new ResponseEntity<>(candidateResponseVO,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }





}
