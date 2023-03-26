package com.chouaib.doctoralCompetition.model.exam;

import com.chouaib.doctoralCompetition.model.user.Examiner;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.util.List;

@Entity
public class CandidateCopy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Min(0)
    @Max(20)
    private long correctionFinalMark;


    @OneToOne()
    @JoinTable(name = "exam_id")
   private Exam exam ;

    @ManyToMany(mappedBy = "candidateCopies")
    private List<Examiner>examiners;

   public CandidateCopy(){
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExaminers(List<Examiner> examiners) {
        this.examiners = examiners;
    }

    public List<Examiner> getExaminers() {
        return examiners;
    }


}
