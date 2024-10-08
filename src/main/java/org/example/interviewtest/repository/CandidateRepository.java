package org.example.interviewtest.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.example.interviewtest.model.Candidate;
import org.springframework.stereotype.Component;

@Component
public class CandidateRepository {

  private List<Candidate> candidateList = new ArrayList<>();


  public List<Candidate> getCandidates() {
    try {
      TimeUnit.SECONDS.sleep(6);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return candidateList;
  }


  public Candidate save(Candidate candidate) {

    candidateList.add(candidate);
    return candidate;

  }
}
