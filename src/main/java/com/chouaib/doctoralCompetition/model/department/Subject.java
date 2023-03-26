package com.chouaib.doctoralCompetition.model.department;

import com.chouaib.doctoralCompetition.model.user.Candidate;
import com.chouaib.doctoralCompetition.model.user.Examiner;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Subject {

	@Id
	@GeneratedValue
	private int id;

	private String SubjectName;

	private long coefficient;

//    Relations

	@ManyToOne(fetch = FetchType.LAZY)
	private Department department;

	@OneToMany(mappedBy = "subject")
	private List<Examiner> examiners;

	@ManyToMany(mappedBy = "subjects")
	private List<Candidate> candidates;
	
	

	// Constructor

	public Subject(int id, String subjectName, long coefficient, Department department) {
		super();
		this.id = id;
		SubjectName = subjectName;
		this.coefficient = coefficient;
		this.department = department;
	}

	public Subject() {

	}

	// Getter and Setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public long getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(long coefficient) {
		this.coefficient = coefficient;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Examiner> getExaminers() {
		return examiners;
	}

	public void setExaminers(List<Examiner> examiners) {
		this.examiners = examiners;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}
}
