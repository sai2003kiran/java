package com.xworkz.exam;

import com.xworkz.exam.ticket.HallTicket;
import com.xworkz.exam.writing.Exam;

public class Runner {
    public static void main(String[] args) {
        HallTicket ticket = new HallTicket("1vk24nei3", "21cs03","csbbvf", "364/689/80");
        Exam exam = new Exam();
        Exam.fees = 1700;
        exam.write(ticket);


    }
}
