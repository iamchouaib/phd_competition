package com.chouaib.doctoralCompetition.model.user;

import com.chouaib.doctoralCompetition.model.department.Subject;
import com.chouaib.doctoralCompetition.model.exam.CandidateCopy;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Examiner extends User{



    @ManyToOne
    private  Subject subject ;

    @ManyToMany
    @JoinTable(name = "correction" ,
            joinColumns = @JoinColumn(name = "examiner_id"),
            inverseJoinColumns = @JoinColumn(name = "candidateCopy_id"))

     private List<CandidateCopy> candidateCopies;

    public Examiner() {

    }


    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setCandidateCopies(List<CandidateCopy> candidateCopies) {
        this.candidateCopies = candidateCopies;
    }

    public List<CandidateCopy> getCandidateCopies() {
        return candidateCopies;
    }
}
