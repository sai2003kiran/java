class BlinkIt 
{
    public static double foodPrice(String itemName) 
    {
        double foodPrice = 0.0;
        if (itemName=="Burritos") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (itemName=="Khandvi") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (itemName=="Methi Muthia") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (itemName=="Masala Papad") 
        {
            foodPrice = 50.00;
            return foodPrice;
        } 
        else if (itemName=="Chana Jor Garam") 
        {
            foodPrice = 60.00;
            return foodPrice;
        } 
        else if (itemName=="Farsan") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (itemName=="Khakra") 
        {
            foodPrice = 80.00;
            return foodPrice;
        } 
        else if (itemName=="Naan Khatai") 
        {
            foodPrice = 75.00;
            return foodPrice;
        } 
        else if (itemName=="Sabudana Vada") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (itemName=="Bhakri") 
        {
            foodPrice = 110.00;
            return foodPrice;
        } 
        else if (itemName=="Kachumber Salad") 
        {
            foodPrice = 70.00;
            return foodPrice;
        } 
        else if (itemName=="Chana Masala") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (itemName=="Gathiya") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (itemName=="Chana Dal Pakaudi") 
        {
            foodPrice = 130.00;
            return foodPrice;
        } 
        else if (itemName=="Gourmet Pizza") 
        {
            foodPrice = 350.00;
            return foodPrice;
        } 
        else if (itemName=="Papdi Chaat") 
        {
            foodPrice = 110.00;
            return foodPrice;
        } 
        else if (itemName=="Dhokla") 
        {
            foodPrice = 80.00;
            return foodPrice;
        } 
        else if (itemName=="Chana Chaat") 
        {
            foodPrice = 110.00;
            return foodPrice;
        } 
        else if (itemName=="Burrito Bowl") 
        {
            foodPrice = 180.00;
            return foodPrice;
        } 
        else if (itemName=="Veg Pakora") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (itemName=="Pasta Bolognese") 
        {
            foodPrice = 220.00;
            return foodPrice;
        } 
        else if (itemName=="Puran Poli") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (itemName=="Dal Tadka") 
        {
            foodPrice = 130.00;
            return foodPrice;
        } 
        else if (itemName=="Baida Roti") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (itemName=="Nachos") 
        {
            foodPrice = 160.00;
            return foodPrice;
        } 
        else if (itemName=="Misal Pav") 
        {
            foodPrice = 110.00;
            return foodPrice;
        } 
        else if (itemName=="Tacos") 
        {
            foodPrice = 160.00;
            return foodPrice;
        } 
        else if (itemName=="Polenta with Tomato Sauce") 
        {
            foodPrice = 180.00;
            return foodPrice;
        } 
        else if (itemName=="Malai Peda") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (itemName=="Panchmel Dal") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (itemName=="Bikaneri Bhujia") 
        {
            foodPrice = 70.00;
            return foodPrice;
        } 
        else if (itemName=="Makhan Wali Lassi") 
        {
            foodPrice = 80.00;
            return foodPrice;
        } 
        else if (itemName=="Rajasthani Dal Baati") 
        {
            foodPrice = 160.00;
            return foodPrice;
        } 
        else if (itemName=="Risotto al Nero di Seppia") 
        {
            foodPrice = 250.00;
            return foodPrice;
        } 
        else if (itemName=="Guacamole") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (itemName=="Amritsari Aloo Tikki") 
        {
            foodPrice = 130.00;
            return foodPrice;
        } 
        else if (itemName=="Lasagna") 
        {
            foodPrice = 300.00;
            return foodPrice;
        } 
        else if (itemName=="Parmigiana di Melanzane") 
        {
            foodPrice = 280.00;
            return foodPrice;
        } 
        else if (itemName=="Moong Dal Halwa") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (itemName=="Kaladi Kulcha") 
        {
            foodPrice = 90.00;
            return foodPrice;
        }
        else 
        {
            System.out.println("Please provide a correct name of the food item.");
            return foodPrice;
        }
    }
	
	public static double foodPrice(String itemName, int quantity) 
    {
        double foodPrice = 0.0;
        if (itemName=="Burritos") 
        {
            foodPrice = 150.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Khandvi") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Methi Muthia") 
        {
            foodPrice = 100.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Masala Papad") 
        {
            foodPrice = 50.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Chana Jor Garam") 
        {
            foodPrice = 60.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Farsan") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Khakra") 
        {
            foodPrice = 80.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Naan Khatai") 
        {
            foodPrice = 75.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Sabudana Vada") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Bhakri") 
        {
            foodPrice = 110.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Kachumber Salad") 
        {
            foodPrice = 70.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Chana Masala") 
        {
            foodPrice = 100.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Gathiya") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Chana Dal Pakaudi") 
        {
            foodPrice = 130.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Gourmet Pizza") 
        {
            foodPrice = 350.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Papdi Chaat") 
        {
            foodPrice = 110.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Dhokla") 
        {
            foodPrice = 80.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Chana Chaat") 
        {
            foodPrice = 110.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Burrito Bowl") 
        {
            foodPrice = 180.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Veg Pakora") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Pasta Bolognese") 
        {
            foodPrice = 220.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Puran Poli") 
        {
            foodPrice = 100.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Dal Tadka") 
        {
            foodPrice = 130.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Baida Roti") 
        {
            foodPrice = 150.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Nachos") 
        {
            foodPrice = 160.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Misal Pav") 
        {
            foodPrice = 110.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Tacos") 
        {
            foodPrice = 160.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Polenta with Tomato Sauce") 
        {
            foodPrice = 180.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Malai Peda") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Panchmel Dal") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Bikaneri Bhujia") 
        {
            foodPrice = 70.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Makhan Wali Lassi") 
        {
            foodPrice = 80.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Rajasthani Dal Baati") 
        {
            foodPrice = 160.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Risotto al Nero di Seppia") 
        {
            foodPrice = 250.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Guacamole") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Amritsari Aloo Tikki") 
        {
            foodPrice = 130.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Lasagna") 
        {
            foodPrice = 300.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Parmigiana di Melanzane") 
        {
            foodPrice = 280.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Moong Dal Halwa") 
        {
            foodPrice = 100.00*quantity;
            return foodPrice;
        } 
        else if (itemName=="Kaladi Kulcha") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        }
        else 
        {
            System.out.println("Please provide a correct name of the food item.");
            return foodPrice;
        }
    }
}
