package com.xworkz.showroomtata.showroom;
import com.xworkz.showroomtata.manager.Manager;
public class ShowRoom {
    public int showRoomId;
    public String custermerName;
    public String[] staff;
    public String[] showRoomcars;
    public Manager[] showManager;

    public void getShowRoomDetails(){
        System.out.println("the showroom Id is :"+this.showRoomId);
        System.out.println("the showroom visited custermer name is :"+this.custermerName);
        for (String staffTpye :staff) {
            System.out.println("the present staff are :"+staffTpye);
        }
        for (String cars:showRoomcars) {
            System.out.println("the present cars are :"+cars);
        }
        for(Manager indivisualMAnager :showManager){
             indivisualMAnager.getManagerdetail();
        }
    }

}
