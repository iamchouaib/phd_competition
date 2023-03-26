package com.chouaib.doctoralCompetition.model.exam;


import com.chouaib.doctoralCompetition.model.user.Examiner;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "correction")
public class Correction {
    @Id
    private int id;

    @Max(3)
    @Min(1)
    private long correctionNumber;

    @Min(0)
    @Max(20)
    private long correctionMark;

    @ManyToOne
    @JoinColumn(name = "candidateCopy_id")
    private CandidateCopy candidateCopy;

    @ManyToOne
    @JoinColumn(name = "examiner_id")
    private Examiner examiner;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
