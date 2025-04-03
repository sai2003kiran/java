package com.xworkz.hotelmanagement;
import com.xworkz.hotelmanagement.hotel.Hotel;
import com.xworkz.hotelmanagement.menu.Menu;

public class HotelRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        String[] hotelBranches = {"Vijayanagara" , "Jayanagara" , "JPnagara"};
        String[] ingridientsForTea = {"Milk" , "Tea Powder" , "Sugar" , "Water" , "Elaichi"};
        String[] ingridientsForPolav = {"Rice" , "Water" , "Vegetabels" , "Oil" , "Masala Items" , "Ghee"};


        // Menu class details:-
        Menu[] menus = new Menu[2];

        Menu menu1 = new Menu() ;
        menu1.itemId = 1;
        menu1.itemName = "Tea";
        menu1.ingridients = ingridientsForTea;
        menu1.itemPrice = 15.00;
        menu1.menuDetails();


        Menu menu2= new Menu();
        menu2.itemId = 2;
        menu2.itemName = "Polav";
        menu2.ingridients = ingridientsForPolav;
        menu2.itemPrice = 80.00;
        menu2.menuDetails();

        menus[0] = menu1;
        menus[1] = menu2;



        // Hotel class details:-
        Hotel hotel1 = new Hotel();
        hotel1.hotelId = 1;
        hotel1.hotelName = "Motel";
        hotel1.hotelLocation = "RR Nagar";
        hotel1.hotelBranches = hotelBranches ;
        // Hotel - menus[2]
        hotel1.menus= menus;
        hotel1.hotelDetails();

        Hotel hotel2 = new Hotel();
        hotel2.hotelId = 2;
        hotel2.hotelName = "saihotel";
        hotel2.hotelLocation = "majestic";
        hotel2.hotelBranches = hotelBranches ;
        // Hotel - menus[2]
        hotel2.menus= menus;
        hotel2.hotelDetails();

        System.out.println("Main Ended");
    }
}
