package com.xworkz.exam.writing;

import com.xworkz.exam.ticket.HallTicket;

public class Exam {
     HallTicket ticket;
     public  static int fees;

     public boolean write(HallTicket ticket){
         boolean isAllowed = false;
         if (fees == 1700) {
             if ( ticket!= null) {
                 System.out.println("hallticket is Verified");
                 this.ticket=ticket;
                 this.ticket.displayDetails();
                 System.out.println("Allowed to write example");
             }else System.out.println("No ticket found...Sorry");
         }else System.out.println("the fees is not paid");
         return isAllowed;
     }

}
