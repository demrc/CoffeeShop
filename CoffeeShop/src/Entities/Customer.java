package Entities;

import Abstact.Entity;

import java.time.LocalDate;

public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    public String nationalIdentity;

    public Customer(){

    }

    public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalIdentity) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.nationalIdentity=nationalIdentity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
		// TODO Auto-generated method stub
		return dateOfBirth;
	}
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

	public String getYear() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
