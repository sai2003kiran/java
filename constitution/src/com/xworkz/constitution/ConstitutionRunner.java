package com.xworkz.constitution;
import com.xworkz.constitution.laws.Constitution;
public class ConstitutionRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Constitution constitution1 = new Constitution();
        constitution1.setConstitutionName("Indian Constitution");
        constitution1.setTotalArticles(395);
        constitution1.setPrimaryDraftedBy("Dr. B.R. Ambedkar");
        constitution1.setCountryOfOrigin("India");
        constitution1.setEnactmentDate("26 January 1950");
        constitution1.setOfficialLanguages("Hindi, English");
        constitution1.setAmendmentsCount(105);

        System.out.println("Constitution Name: " + constitution1.getConstitutionName());
        System.out.println("Total Articles: " + (constitution1.getTotalArticles() + " articles"));
        System.out.println("Drafted By: " + constitution1.getPrimaryDraftedBy());
        System.out.println("Country of Origin: " + ("Originated in " + constitution1.getCountryOfOrigin()));
        System.out.println("Enactment Date: " + constitution1.getEnactmentDate());
        System.out.println("Official Languages: " + ("Languages include: " + constitution1.getOfficialLanguages()));
        System.out.println("Amendments Count: " + ("Number of amendments: " + constitution1.getAmendmentsCount()));
        System.out.println("*******Complete*********");

        Constitution constitution2 = new Constitution();
        constitution2.setConstitutionName("US Constitution");
        constitution2.setTotalArticles(7);
        constitution2.setPrimaryDraftedBy("James Madison");
        constitution2.setCountryOfOrigin("USA");
        constitution2.setEnactmentDate("17 September 1787");
        constitution2.setOfficialLanguages("English");
        constitution2.setAmendmentsCount(27);

        System.out.println("Constitution Name: " + constitution2.getConstitutionName());
        System.out.println("Total Articles: " + (constitution2.getTotalArticles() + " articles"));
        System.out.println("Drafted By: " + constitution2.getPrimaryDraftedBy());
        System.out.println("Country of Origin: " + ("Originated in " + constitution2.getCountryOfOrigin()));
        System.out.println("Enactment Date: " + constitution2.getEnactmentDate());
        System.out.println("Official Languages: " + ("Languages include: " + constitution2.getOfficialLanguages()));
        System.out.println("Amendments Count: " + ("Number of amendments: " + constitution2.getAmendmentsCount()));
        System.out.println("*******Complete*********");

        Constitution constitution4 = new Constitution();
        constitution4.setConstitutionName("Canadian Constitution");
        constitution4.setTotalArticles(52);
        constitution4.setPrimaryDraftedBy("Multiple Authors");
        constitution4.setCountryOfOrigin("Canada");
        constitution4.setEnactmentDate("17 April 1982");
        constitution4.setOfficialLanguages("English, French");
        constitution4.setAmendmentsCount(11);

        System.out.println("Constitution Name: " + constitution4.getConstitutionName());
        System.out.println("Total Articles: " + (constitution4.getTotalArticles() + " articles"));
        System.out.println("Drafted By: " + constitution4.getPrimaryDraftedBy());
        System.out.println("Country of Origin: " + ("Originated in " + constitution4.getCountryOfOrigin()));
        System.out.println("Enactment Date: " + constitution4.getEnactmentDate());
        System.out.println("Official Languages: " + ("Languages include: " + constitution4.getOfficialLanguages()));
        System.out.println("Amendments Count: " + ("Number of amendments: " + constitution4.getAmendmentsCount()));
        System.out.println("*******Complete*********");

        Constitution constitution3 = new Constitution();
        constitution3.setConstitutionName("japan Constitution");
        constitution3.setTotalArticles(103);
        constitution3.setPrimaryDraftedBy("Dr. B.R. Ambedkar");
        constitution3.setCountryOfOrigin("japan");
        constitution3.setEnactmentDate("3 May 1947");
        constitution3.setOfficialLanguages("Japanese");
        constitution3.setAmendmentsCount(34);

        System.out.println("Constitution Name: " + constitution3.getConstitutionName());
        System.out.println("Total Articles: " + (constitution3.getTotalArticles() + " articles"));
        System.out.println("Drafted By: " + constitution3.getPrimaryDraftedBy());
        System.out.println("Country of Origin: " + ("Originated in " + constitution3.getCountryOfOrigin()));
        System.out.println("Enactment Date: " + constitution3.getEnactmentDate());
        System.out.println("Official Languages: " + ("Languages include: " + constitution3.getOfficialLanguages()));
        System.out.println("Amendments Count: " + ("Number of amendments: " + constitution3.getAmendmentsCount()));
        System.out.println("*******Complete*********");


        Constitution constitution5 = new Constitution();
        constitution5.setConstitutionName("Australian Constitution");
        constitution5.setTotalArticles(128);
        constitution5.setPrimaryDraftedBy("Sir Samuel Griffith");
        constitution5.setCountryOfOrigin("Australia");
        constitution5.setEnactmentDate("1 January 1906");
        constitution5.setOfficialLanguages("English");
        constitution5.setAmendmentsCount(8);

        System.out.println("Constitution Name: " + constitution5.getConstitutionName());
        System.out.println("Total Articles: " + (constitution5.getTotalArticles() + " articles"));
        System.out.println("Drafted By: " + constitution5.getPrimaryDraftedBy());
        System.out.println("Country of Origin: " + ("Originated in " + constitution5.getCountryOfOrigin()));
        System.out.println("Enactment Date: " + constitution5.getEnactmentDate());
        System.out.println("Official Languages: " + ("Languages include: " + constitution5.getOfficialLanguages()));
        System.out.println("Amendments Count: " + ("Number of amendments: " + constitution5.getAmendmentsCount()));
        System.out.println("*******Complete*********");

        System.out.println("Main Ended");
    }
}

