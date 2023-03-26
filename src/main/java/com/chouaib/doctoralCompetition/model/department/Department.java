package com.chouaib.doctoralCompetition.model.department;

import com.chouaib.doctoralCompetition.model.user.Candidate;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private int id ;
    
 
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Subject> subjects;
    
    @OneToMany(mappedBy = "department")
    private List<Candidate> candidates;



    public Department(int id, String name , List<Subject>subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    public Department() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
