package com.xworkz.celebrity;
import com.xworkz.celebrity.celebritydetails.Celebrity;
public class CelebrityRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Celebrity celebrity1 = new Celebrity();
        celebrity1.setName("Leonardo DiCaprio");
        celebrity1.setAge(49);
        celebrity1.setProfession("Actor");
        celebrity1.setNationality("American");
        celebrity1.setAwardWinner(true);
        celebrity1.setFamousWork("Titanic");

        String name1 = celebrity1.getName();
        int age1 = celebrity1.getAge();
        String profession1 = celebrity1.getProfession();
        String nationality1 = celebrity1.getNationality();
        boolean awardWinner1 = celebrity1.getAwardWinner();
        String famousWork1 = celebrity1.getFamousWork();

        System.out.println("Celebrity Name: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Profession: " + profession1);
        System.out.println("Nationality: " + nationality1);
        System.out.println("Award Winner: " + awardWinner1);
        System.out.println("Famous Work: " + famousWork1);
        System.out.println("*******Complete*********");

        // Celebrity 2
        Celebrity celebrity2 = new Celebrity();
        celebrity2.setName("Emma Watson");
        celebrity2.setAge(34);
        celebrity2.setProfession("Actress");
        celebrity2.setNationality("British");
        celebrity2.setAwardWinner(true);
        celebrity2.setFamousWork("Harry Potter");

        String name2 = celebrity2.getName();
        int age2 = celebrity2.getAge();
        String profession2 = celebrity2.getProfession();
        String nationality2 = celebrity2.getNationality();
        boolean awardWinner2 = celebrity2.getAwardWinner();
        String famousWork2 = celebrity2.getFamousWork();

        System.out.println("Celebrity Name: " + name2);
        System.out.println("Age: " + age2);
        System.out.println("Profession: " + profession2);
        System.out.println("Nationality: " + nationality2);
        System.out.println("Award Winner: " + awardWinner2);
        System.out.println("Famous Work: " + famousWork2);
        System.out.println("*******Complete*********");

        // Celebrity 3
        Celebrity celebrity3 = new Celebrity();
        celebrity3.setName("Cristiano Ronaldo");
        celebrity3.setAge(40);
        celebrity3.setProfession("Footballer");
        celebrity3.setNationality("Portuguese");
        celebrity3.setAwardWinner(true);
        celebrity3.setFamousWork("Ballon d'Or");

        String name3 = celebrity3.getName();
        int age3 = celebrity3.getAge();
        String profession3 = celebrity3.getProfession();
        String nationality3 = celebrity3.getNationality();
        boolean awardWinner3 = celebrity3.getAwardWinner();
        String famousWork3 = celebrity3.getFamousWork();

        System.out.println("Celebrity Name: " + name3);
        System.out.println("Age: " + age3);
        System.out.println("Profession: " + profession3);
        System.out.println("Nationality: " + nationality3);
        System.out.println("Award Winner: " + awardWinner3);
        System.out.println("Famous Work: " + famousWork3);
        System.out.println("*******Complete*********");

        // Celebrity 4
        Celebrity celebrity4 = new Celebrity();
        celebrity4.setName("Taylor Swift");
        celebrity4.setAge(35);
        celebrity4.setProfession("Singer");
        celebrity4.setNationality("American");
        celebrity4.setAwardWinner(true);
        celebrity4.setFamousWork("1989 Album");

        String name4 = celebrity4.getName();
        int age4 = celebrity4.getAge();
        String profession4 = celebrity4.getProfession();
        String nationality4 = celebrity4.getNationality();
        boolean awardWinner4 = celebrity4.getAwardWinner();
        String famousWork4 = celebrity4.getFamousWork();

        System.out.println("Celebrity Name: " + name4);
        System.out.println("Age: " + age4);
        System.out.println("Profession: " + profession4);
        System.out.println("Nationality: " + nationality4);
        System.out.println("Award Winner: " + awardWinner4);
        System.out.println("Famous Work: " + famousWork4);
        System.out.println("*******Complete*********");

        // Celebrity 5
        Celebrity celebrity5 = new Celebrity();
        celebrity5.setName("Roger Federer");
        celebrity5.setAge(43);
        celebrity5.setProfession("Tennis Player");
        celebrity5.setNationality("Swiss");
        celebrity5.setAwardWinner(true);
        celebrity5.setFamousWork("Grand Slam Titles");

        String name5 = celebrity5.getName();
        int age5 = celebrity5.getAge();
        String profession5 = celebrity5.getProfession();
        String nationality5 = celebrity5.getNationality();
        boolean awardWinner5 = celebrity5.getAwardWinner();
        String famousWork5 = celebrity5.getFamousWork();

        System.out.println("Celebrity Name: " + name5);
        System.out.println("Age: " + age5);
        System.out.println("Profession: " + profession5);
        System.out.println("Nationality: " + nationality5);
        System.out.println("Award Winner: " + awardWinner5);
        System.out.println("Famous Work: " + famousWork5);
        System.out.println("*******Complete*********");

        System.out.println("Main Ended");
    }
}
