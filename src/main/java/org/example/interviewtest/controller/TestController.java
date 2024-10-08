package org.example.interviewtest.controller;

import java.util.List;
import org.example.interviewtest.model.Candidate;
import org.example.interviewtest.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/interview-test/candidates", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
public class TestController {

  @Autowired
  private CandidateService candidateService;

  @GetMapping
  public ResponseEntity<List<Candidate>> getCandidates() {
    return ResponseEntity.ok(candidateService.getCandidates());
  }


  @PostMapping
  public Candidate addCandidate(@RequestBody Candidate candidate) {
    return candidateService.save(candidate);
  }




}
