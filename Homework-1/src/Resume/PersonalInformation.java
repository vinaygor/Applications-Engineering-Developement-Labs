/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resume;
import java.io.File;

/**
 *
 * @author vinay
 */
public class PersonalInformation {
    
    private Address address;
    private Education education;
    public PersonalInformation(){
        address = new Address();
        education = new Education();
    }
    
    private String firstName;
    private String lastName;
    private String affiliation;
    private String careerObjectiveStatement;
    private File file;
    private String phoneNumber;
    private String emailAddress;
    private String computerSkills;
    private String linkedInProfileLink;
    private String hobbies;
    private String month;
    private String date;
    private String year;
    private String degreeTitle;
    private String degreeDate;
    private String university;


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getCareerObjectiveStatement() {
        return careerObjectiveStatement;
    }

    public void setCareerObjectiveStatement(String careerObjectiveStatement) {
        this.careerObjectiveStatement = careerObjectiveStatement;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getComputerSkills() {
        return computerSkills;
    }

    public void setComputerSkills(String computerSkills) {
        this.computerSkills = computerSkills;
    }

    public String getLinkedInProfileLink() {
        return linkedInProfileLink;
    }

    public void setLinkedInProfileLink(String linkedInProfileLink) {
        this.linkedInProfileLink = linkedInProfileLink;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    
    
}
