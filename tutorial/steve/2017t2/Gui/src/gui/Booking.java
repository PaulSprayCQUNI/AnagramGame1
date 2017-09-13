/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Booking {
	private String firstName;
	private String lastName;
	private Integer yearOfBirth;

	public Booking()  {
		setFirstName("");
		setLastName("");
		setYearOfBirth(0);
	}

	public Booking(String firstName, String lastName, Integer yearOfBirth) {
		setFirstName(firstName);
		setLastName(lastName);
		setYearOfBirth(yearOfBirth);
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

	public Integer getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + yearOfBirth;
	}
}
