package com.xworkz.votingapp.votingdto;

public class VoterDto {

    private String voterName;
    private String voterId;
    private int age;
    private String gender;
    private String constituency;
    private boolean isIndianCitizen;

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setIsIndianCitizen(boolean isIndianCitizen) {
        this.isIndianCitizen = isIndianCitizen;
    }

    public boolean getIsIndianCitizen() {
        return isIndianCitizen;
    }
}
