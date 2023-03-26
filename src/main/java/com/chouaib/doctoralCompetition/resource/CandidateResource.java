package com.chouaib.doctoralCompetition.resource;


import com.chouaib.doctoralCompetition.model.user.Candidate;
import com.chouaib.doctoralCompetition.repository.CandidateRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CandidateResource {
   private CandidateRepository candidateRepository;


   @Autowired
    public CandidateResource(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping("/candidates")
    public ResponseEntity<List <Candidate>> index(){
        List<Candidate> retrievedCandidates = candidateRepository.findAll();
        if (retrievedCandidates.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

}
       return new ResponseEntity<>(retrievedCandidates,HttpStatus.OK);


    }

    @GetMapping("/candidates/{candidate}")
    public Candidate show(@PathVariable("candidate") int candidate){
        Optional<Candidate> retrievedCandidate = candidateRepository.findById(candidate);
       if (retrievedCandidate.isEmpty()) return null;

           return retrievedCandidate.get();

    }

    @PostMapping ("/candidate/store")
    public String store(@Valid @RequestBody Candidate candidate){

//       Candidate candidate =  new Candidate(1,"chouaib" ,"amine","chouaib_19","chouaibe@gg.com","password",
//               LocalDate.now().minusYears(20));


       candidateRepository.save(candidate);

       return "ok";
    }


}
