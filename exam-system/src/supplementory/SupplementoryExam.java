package supplementory;

import com.xworkz.exam.ticket.HallTicket;
import com.xworkz.exam.writing.Exam;

public class SupplementoryExam extends Exam {
    public int noOfAttempts;

    public boolean write(HallTicket ticket){
        boolean isAllowed = false;
        if (noOfAttempts >= 2) {
            isAllowed=super.write(ticket);
        }
        return isAllowed;
    }
}
