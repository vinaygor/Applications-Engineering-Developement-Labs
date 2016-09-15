/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Resume.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author vinay
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    
    private String imageURL;
    private File file;
    
    private PersonalInformation personalInformation;
    
    //Variables declaration
    private String firstName;
    private String lastName;
    private String workExperience;
    private String affiliation;
    private String careerObjectiveStatement;
    private String phoneNumber;
    private String emailAddress;
    private String computerSkills;
    private String linkedInProfileLink;
    private String hobbies;
    private String month;
    private String date;
    private String year;
    private String street1;    
    private String street2;
    private String city;
    private String country;
    private String zipCode;
    private String degree1Title;
    private String degree1Date;
    private String university1;
    private String degree2Title;
    private String degree2Date;
    private String university2;
    private String degree3Title;
    private String degree3Date;
    private String university3;
    
    
    public DisplayJPanel(PersonalInformation personalInformation) {
        initComponents();
        this.personalInformation = personalInformation;
        
        System.out.println(personalInformation.getFile());
        display();
        
        
    }
    public void display(){
        
        getSetData();
        

        //Displaying image 
        file= personalInformation.getFile();
        imageURL=file.getAbsolutePath();
        
        File imageFile = new File(imageURL);
        BufferedImage br;
        try{
            br= ImageIO.read(imageFile);
            ImageIcon icon = new ImageIcon(br);
            ImageIcon finalIcon=new ImageIcon(icon.getImage().getScaledInstance(350, 475, Image.SCALE_DEFAULT));
            imageDisplayer.setIcon(finalIcon);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    private void getSetData(){
        
        firstName = personalInformation.getFirstName();
        lastName = personalInformation.getLastName();
        workExperience = personalInformation.getWorkExperience();
        affiliation = personalInformation.getAffiliation();
        careerObjectiveStatement = personalInformation.getCareerObjectiveStatement();
        phoneNumber = personalInformation.getPhoneNumber();
        emailAddress = personalInformation.getEmailAddress();
        computerSkills = personalInformation.getComputerSkills();
        linkedInProfileLink = personalInformation.getLinkedInProfileLink();
        hobbies = personalInformation.getHobbies();
        month = personalInformation.getMonth();
        date = personalInformation.getDate();
        year = personalInformation.getYear();
        street1 = personalInformation.address.getStreet1();
        street2 = personalInformation.address.getStreet2();
        city = personalInformation.address.getCity();
        country = personalInformation.address.getCountry();
        zipCode = personalInformation.address.getZipCode();
        degree1Title = personalInformation.education.getDegree1Title();
        degree1Date=personalInformation.education.getDegree1Date();
        university1=personalInformation.education.getUniversity1();
        degree2Title=personalInformation.education.getDegree2Title();
        degree2Date=personalInformation.education.getDegree2Date();
        university2=personalInformation.education.getUniversity2();
        degree3Title=personalInformation.education.getDegree3Title();
        degree3Date=personalInformation.education.getDegree3Date();
        university3=personalInformation.education.getUniversity3();
        
        firstNameDisplayLabel.setText(firstName);
        lastNameDisplayLabel.setText(lastName);
        emailAddressDisplayLabel.setText(emailAddress);
        dateOfBirthDisplayLabel.setText(month+"/"+date+"/"+year);
        hobbiesDisplayLabel.setText(hobbies);
        
        careerObjectiveDisplayLabel.setText(careerObjectiveStatement);
        workExperienceDisplayingLabel1.setText(workExperience);
        degreeTitle1DisplayLabel.setText(degree1Title);
        degreeTitle2DisplayLabel.setText(degree2Title);
        degree3TitleDisplayLabel.setText(degree3Title);
        degreeDate1DisplayLabel.setText(degree1Date);
        degreeDate2DisplayLabel.setText(degree2Date);
        degreeDate3DisplayLabel.setText(degree3Date);
        university1DisplayLabel.setText(university1);
        university2DisplayLabel.setText(university2);
        university3DisplayLabel.setText(university3);
        
        street1DisplayLabel.setText(street1);
        street2DisplayLabel.setText(street2);
        cityDisplayLabel.setText(city);
        countryDisplayLabel.setText(country);
        zipCodeDisplayLabel.setText(zipCode);
        
        computerSkillsDisplayLabel.setText(computerSkills);
        affiliationDisplayLabel.setText(affiliation);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        dateOfBirthLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        createResumeTitleLabel = new javax.swing.JLabel();
        emailAddressLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        imageDisplayer = new javax.swing.JLabel();
        firstNameDisplayLabel = new javax.swing.JLabel();
        lastNameDisplayLabel = new javax.swing.JLabel();
        emailAddressDisplayLabel = new javax.swing.JLabel();
        dateOfBirthDisplayLabel = new javax.swing.JLabel();
        hobbiesLabel = new javax.swing.JLabel();
        hobbiesDisplayLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        careerObjectiveDisplayLabel = new javax.swing.JLabel();
        personalInformationLabel1 = new javax.swing.JLabel();
        workExperienceLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        careerObjectiveLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        workExperienceLabel1 = new javax.swing.JLabel();
        workExperienceDisplayingLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        workExperienceLabel2 = new javax.swing.JLabel();
        street1Label = new javax.swing.JLabel();
        street2Label = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        zipCodeLabel = new javax.swing.JLabel();
        street1DisplayLabel = new javax.swing.JLabel();
        street2DisplayLabel = new javax.swing.JLabel();
        cityDisplayLabel = new javax.swing.JLabel();
        countryDisplayLabel = new javax.swing.JLabel();
        zipCodeDisplayLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        othersLabel = new javax.swing.JLabel();
        computerSkillsLabel = new javax.swing.JLabel();
        computerSkillsDisplayLabel = new javax.swing.JLabel();
        affiliationLabel = new javax.swing.JLabel();
        affiliationDisplayLabel = new javax.swing.JLabel();
        degreeTitle1DisplayLabel = new javax.swing.JLabel();
        degreeDate1DisplayLabel = new javax.swing.JLabel();
        university1DisplayLabel = new javax.swing.JLabel();
        degreeTitle2DisplayLabel = new javax.swing.JLabel();
        degreeDate2DisplayLabel = new javax.swing.JLabel();
        university2DisplayLabel = new javax.swing.JLabel();
        degree3TitleDisplayLabel = new javax.swing.JLabel();
        degreeDate3DisplayLabel = new javax.swing.JLabel();
        university3DisplayLabel = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        dateOfBirthLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        dateOfBirthLabel.setText("Date of Birth:");

        lastNameLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lastNameLabel.setText("Last Name:");

        firstNameLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        firstNameLabel.setText("First Name:");

        createResumeTitleLabel.setFont(new java.awt.Font("Verdana", 2, 36)); // NOI18N
        createResumeTitleLabel.setText("              Curriculum Vitae");

        emailAddressLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        emailAddressLabel.setText("Email Address:");

        imageDisplayer.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        firstNameDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        lastNameDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        emailAddressDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        dateOfBirthDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        hobbiesLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        hobbiesLabel.setText("Hobbies:");

        hobbiesDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        careerObjectiveDisplayLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        careerObjectiveDisplayLabel.setText("Career objective");

        personalInformationLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        personalInformationLabel1.setText("Personal Information");

        workExperienceLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        workExperienceLabel.setText("Work Experience");

        careerObjectiveLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        careerObjectiveLabel.setText("Career Objective");

        workExperienceLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        workExperienceLabel1.setText("Education History");

        workExperienceDisplayingLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        workExperienceDisplayingLabel1.setText("Work Experience");

        workExperienceLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        workExperienceLabel2.setText("Address details");

        street1Label.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        street1Label.setText("Street 1:");

        street2Label.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        street2Label.setText("Street 2:");

        cityLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        cityLabel.setText("City:");

        countryLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        countryLabel.setText("Country:");

        zipCodeLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        zipCodeLabel.setText("Zip Code:");

        street1DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        street2DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        cityDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        countryDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        zipCodeDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        othersLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        othersLabel.setText("Others:");

        computerSkillsLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        computerSkillsLabel.setText("Computer Skills:");

        computerSkillsDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        affiliationLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        affiliationLabel.setText("Affiliations:");

        affiliationDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        degreeTitle1DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        degreeDate1DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        university1DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        degreeTitle2DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        degreeDate2DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        university2DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        degree3TitleDisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        degreeDate3DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        university3DisplayLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(careerObjectiveDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createResumeTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(emailAddressLabel)
                            .addComponent(dateOfBirthLabel)
                            .addComponent(hobbiesLabel))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hobbiesDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateOfBirthDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailAddressDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imageDisplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)))))
                .addContainerGap())
            .addComponent(jSeparator3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workExperienceLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator4)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workExperienceLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator5)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(workExperienceLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(street1Label)
                    .addComponent(street2Label)
                    .addComponent(cityLabel)
                    .addComponent(countryLabel)
                    .addComponent(zipCodeLabel))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(street1DisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(street2DisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(countryDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zipCodeDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator6)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(othersLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computerSkillsLabel)
                    .addComponent(affiliationLabel))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(affiliationDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addComponent(computerSkillsDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(degreeTitle1DisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(degreeDate1DisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(university1DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(degreeTitle2DisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(degreeDate2DisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(university2DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(degree3TitleDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(degreeDate3DisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(university3DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(personalInformationLabel1)
                    .addContainerGap(926, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(careerObjectiveLabel)
                    .addContainerGap(977, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(workExperienceDisplayingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createResumeTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstNameDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lastNameDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(emailAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(emailAddressDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(dateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateOfBirthDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(imageDisplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hobbiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hobbiesDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(careerObjectiveDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(workExperienceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(workExperienceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(degreeTitle1DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(degreeDate1DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50))
                        .addComponent(university1DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(degreeTitle2DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(degreeDate2DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50))
                        .addComponent(university2DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(degree3TitleDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(degreeDate3DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addComponent(university3DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(workExperienceLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(street1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(street2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(street1DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(street2DisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cityDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(countryDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zipCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCodeDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(othersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(computerSkillsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(computerSkillsDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(affiliationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(affiliationDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(623, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(personalInformationLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(2773, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(526, 526, 526)
                    .addComponent(careerObjectiveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(2388, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(1067, 1067, 1067)
                    .addComponent(workExperienceDisplayingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1637, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel affiliationDisplayLabel;
    private javax.swing.JLabel affiliationLabel;
    private javax.swing.JLabel careerObjectiveDisplayLabel;
    private javax.swing.JLabel careerObjectiveLabel;
    private javax.swing.JLabel cityDisplayLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel computerSkillsDisplayLabel;
    private javax.swing.JLabel computerSkillsLabel;
    private javax.swing.JLabel countryDisplayLabel;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel createResumeTitleLabel;
    private javax.swing.JLabel dateOfBirthDisplayLabel;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JLabel degree3TitleDisplayLabel;
    private javax.swing.JLabel degreeDate1DisplayLabel;
    private javax.swing.JLabel degreeDate2DisplayLabel;
    private javax.swing.JLabel degreeDate3DisplayLabel;
    private javax.swing.JLabel degreeTitle1DisplayLabel;
    private javax.swing.JLabel degreeTitle2DisplayLabel;
    private javax.swing.JLabel emailAddressDisplayLabel;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JLabel firstNameDisplayLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel hobbiesDisplayLabel;
    private javax.swing.JLabel hobbiesLabel;
    private javax.swing.JLabel imageDisplayer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lastNameDisplayLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel othersLabel;
    private javax.swing.JLabel personalInformationLabel1;
    private javax.swing.JLabel street1DisplayLabel;
    private javax.swing.JLabel street1Label;
    private javax.swing.JLabel street2DisplayLabel;
    private javax.swing.JLabel street2Label;
    private javax.swing.JLabel university1DisplayLabel;
    private javax.swing.JLabel university2DisplayLabel;
    private javax.swing.JLabel university3DisplayLabel;
    private javax.swing.JLabel workExperienceDisplayingLabel1;
    private javax.swing.JLabel workExperienceLabel;
    private javax.swing.JLabel workExperienceLabel1;
    private javax.swing.JLabel workExperienceLabel2;
    private javax.swing.JLabel zipCodeDisplayLabel;
    private javax.swing.JLabel zipCodeLabel;
    // End of variables declaration//GEN-END:variables
}
