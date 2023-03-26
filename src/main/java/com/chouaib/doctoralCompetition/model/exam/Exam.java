package com.chouaib.doctoralCompetition.model.exam;


import com.chouaib.doctoralCompetition.model.department.Subject;
import com.chouaib.doctoralCompetition.model.user.Candidate;
import jakarta.persistence.*;
;

import java.time.LocalDate;

@Entity
@Table(name = "exam")
public class Exam {


    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "subject_id")
   private Subject subject;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    private LocalDate examDate;
    private String classRoom;


    @OneToOne(mappedBy = "exam" , cascade = CascadeType.ALL)
    private CandidateCopy candidateCopy;

    public Exam(int id) {
this.id=id;
    }



    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
