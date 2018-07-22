package com.ripplehire.candidate.repositories;

import com.ripplehire.candidate.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Integer>{



}
