import java.time.LocalDate;
import java.util.*;


public class Officer {



    //declare variables
    private boolean promotion_eligibility;
    private String name;
    private String address;
    private LocalDate Birthday;
    private String education;
    private String hobby;
    private String phone_number;
    private int contact_info_id;
    private int officer_info_id;
    private String rank;
    private int id;
    private String email;
    private String hometown;
    private boolean marital_status;
    private String relationship;
    private String family_member_name;


//set officer name
    public void setName(String name) {
        this.name = name;
    }

//get officer name
    public String getName() {
        return name;
    }


    //set address
    public void setAddress(String address) {
        this.address = address;
    }


    //get address
    public String getAddress() {
        return address;
    }


    //set birthday
    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }


    //get birthday
    public LocalDate getBirthday() {
        return Birthday;
    }


    //set contact info id
    public void setContact_info_id(int contact_info_id) {
        this.contact_info_id = contact_info_id;
    }


    //get contact info id
    public int getContact_info_id() {
        return contact_info_id;
    }

    // set education
    public void setEducation(String education) {
        this.education = education;
    }


    //get education
    public String getEducation() {
        return education;
    }


    //set officer info id
    public void setOfficer_info_id(int officer_info_id) {
        this.officer_info_id = officer_info_id;
    }


    //get officer info id
    public int getOfficer_info_id() {
        return officer_info_id;
    }


    //set phone number
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    //get phone number
    public String getPhone_number() {
        return phone_number;
    }

    //set promotion eligibility
    public void setPromotion_eligibility(boolean promotion_eligibility) {
        this.promotion_eligibility = promotion_eligibility;
    }


    //check promotion eligibility
    public boolean isPromotion_eligibility() {
        return promotion_eligibility;
    }

    //set officer's hobby
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    //get officer's hobby
    public String getHobby() {
        return hobby;
    }

    //set officer's rank
    public void setRank(String rank) {
        this.rank = rank;
    }

    //get officer's rank
    public String getRank() {
        return rank;
    }


    //set officer's id
    public void setId(int id) {
        this.id = id;
    }


    //get officer's id
    public int getId() {
        return id;
    }

//set the officer's email
    public void setEmail(String email) {
        this.email = email;
    }

 //get the officer's email
    public String getEmail() {
        return email;
    }

//set hometown
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

//get hometown
    public String getHometown() {
        return hometown;
    }

//set marital status
    public void setMarital_status(boolean marital_status) {
        this.marital_status = marital_status;
    }

//get marital status
    public boolean isMarital_status() {
        return marital_status;
    }

//set the relationship
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

//get the relationship
    public String getRelationship() {
        return relationship;
    }

//set family member name
    public void setFamily_member_name(String family_member_name) {
        this.family_member_name = family_member_name;
    }

//get family member name
    public String getFamily_member_name() {
        return family_member_name;
    }
}
