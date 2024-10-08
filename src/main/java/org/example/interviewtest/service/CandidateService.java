package org.example.interviewtest.service;

import java.util.List;
import org.example.interviewtest.model.Candidate;
import org.example.interviewtest.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {

  @Autowired
  CandidateRepository candidateRepository;

  public List<Candidate> getCandidates() {
    return candidateRepository.getCandidates();
  }

  public Candidate save(Candidate candidate) {
    return candidateRepository.save(candidate);
  }
}
