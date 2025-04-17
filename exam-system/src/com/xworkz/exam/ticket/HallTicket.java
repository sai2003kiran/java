package com.xworkz.exam.ticket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class HallTicket {
    private String usn;
    private String subjectCode;
    private String subName;
    private String date;

    public void displayDetails(){
        System.out.println("the Candidate USN is: "+usn);
        System.out.println("the Candidate SubjectCode is : "+subjectCode);
        System.out.println("the Candidate SubjectName is :"+subName);
        System.out.println("the Candidate attending date is : "+date);
    }
}
