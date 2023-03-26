package com.chouaib.doctoralCompetition.model.user;

import java.time.LocalDate;
import java.util.List;

import com.chouaib.doctoralCompetition.model.department.Department;
import com.chouaib.doctoralCompetition.model.department.Subject;

import jakarta.persistence.*;

@Entity
public class Candidate extends User {


	private String candidateToken ;
	@ManyToOne(fetch = FetchType.LAZY)
	private Department department;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Exam",
	joinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "candidate_id", referencedColumnName = "id"))
	private List<Subject> subjects;


	public Candidate(int id, String firstName, String lastName, String userName, String email, String password, LocalDate birthDate) {
		super(id, firstName, lastName, userName, email, password, birthDate);
	}

	public Candidate() {

	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public void setCandidateToken(String candidateToken) {

		//Generate Token and store in db
		this.candidateToken = candidateToken;
	}

	public String getCandidateToken() {
		return candidateToken;
	}
}
