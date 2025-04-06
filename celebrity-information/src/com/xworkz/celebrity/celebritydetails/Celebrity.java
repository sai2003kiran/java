package com.xworkz.celebrity.celebritydetails;

public class Celebrity {
    private String name;
    private int age;
    private String profession;
    private String nationality;
    private boolean isAwardWinner;
    private String famousWork;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setAwardWinner(boolean isAwardWinner) {
        this.isAwardWinner = isAwardWinner;
    }

    public boolean getAwardWinner() {
        return isAwardWinner;
    }

    public void setFamousWork(String famousWork) {
        this.famousWork = famousWork;
    }

    public String getFamousWork() {
        return famousWork;
    }
}