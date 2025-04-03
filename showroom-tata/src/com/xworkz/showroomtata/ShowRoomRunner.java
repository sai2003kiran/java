package com.xworkz.showroomtata;
import com.xworkz.showroomtata.showroom.ShowRoom;
import com.xworkz.showroomtata.manager.Manager;

public class ShowRoomRunner {
    public static void main(String[] args) {
        String[] staffs={"demoStaff","helpingStaff","guidingStaff"};
        String[] tatacars={"Nexon","Punch","Tiago","Safari"};

        Manager[] names = new Manager[2];

        Manager ramesh = new Manager();
        ramesh.staffid=101;
        ramesh.staffName="suresh";
        ramesh.staffAdderess="bangalore";
        ramesh.getManagerdetail();

        Manager baba = new Manager();
        baba.staffid=102;
        baba.staffName="ganesh";
        baba.staffAdderess="bangalore";
        baba.getManagerdetail();

        names[0]=ramesh;
        names[1]=baba;

        ShowRoom tata =new ShowRoom();
        tata.showRoomId=12342;
        tata.custermerName="sai";
        tata.staff=staffs;
        tata.showRoomcars=tatacars;
        tata.showManager=names;
        tata.getShowRoomDetails();
    }
}
