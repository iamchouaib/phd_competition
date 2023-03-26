package com.chouaib.doctoralCompetition.repository;

import com.chouaib.doctoralCompetition.model.user.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate , Integer> {
}
