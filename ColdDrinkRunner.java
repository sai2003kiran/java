class ColdDrinkRunner {
public static void main(String output[]) {
ColdDrink cocaCola = new ColdDrink();
cocaCola.drinkSize = 500;
cocaCola.drinkPackaging = "Bottle";
cocaCola.drinkFlavor = "Cola";
System.out.println("The Coca-Cola drinkSize is: " + cocaCola.drinkSize + "ml");
System.out.println("The Coca-Cola drinkPackaging is: " + cocaCola.drinkPackaging);
System.out.println("The Coca-Cola drinkFlavor is: " + cocaCola.drinkFlavor);
System.out.println("*****<><><><><>*****");

ColdDrink pepsi = new ColdDrink(330, "Can", "Cola");
System.out.println("The Pepsi drinkSize is: " + pepsi.drinkSize + "ml");
System.out.println("The Pepsi drinkPackaging is: " + pepsi.drinkPackaging);
System.out.println("The Pepsi drinkFlavor is: " + pepsi.drinkFlavor);
System.out.println("*****<><><><><>*****");

ColdDrink sprite = new ColdDrink();
sprite.drinkSize = 250;
sprite.drinkPackaging = "GlassBottle";
sprite.drinkFlavor = "Lemon";
System.out.println("The Sprite drinkSize is: " + sprite.drinkSize + "ml");
System.out.println("The Sprite drinkPackaging is: " + sprite.drinkPackaging);
System.out.println("The Sprite drinkFlavor is: " + sprite.drinkFlavor);
System.out.println("*****<><><><><>*****");

ColdDrink mountainDew = new ColdDrink(600, "Can", "Citrus");
System.out.println("The Mountain Dew drinkSize is: " + mountainDew.drinkSize + "ml");
System.out.println("The Mountain Dew drinkPackaging is: " + mountainDew.drinkPackaging);
System.out.println("The Mountain Dew drinkFlavor is: " + mountainDew.drinkFlavor);
System.out.println("*****<><><><><>*****");

ColdDrink fanta = new ColdDrink();
fanta.drinkSize = 500;
fanta.drinkPackaging = "GlassBottle";
fanta.drinkFlavor = "Orange";
System.out.println("The Fanta drinkSize is: " + fanta.drinkSize + "ml");
System.out.println("The Fanta drinkPackaging is: " + fanta.drinkPackaging);
System.out.println("The Fanta drinkFlavor is: " + fanta.drinkFlavor);
System.out.println("*****<><><><><>*****");

ColdDrink thumbsUp = new ColdDrink(300, "Can", "Strong Cola");
System.out.println("The Thumbs Up drinkSize is: " + thumbsUp.drinkSize + "ml");
System.out.println("The Thumbs Up drinkPackaging is: " + thumbsUp.drinkPackaging);
System.out.println("The Thumbs Up drinkFlavor is: " + thumbsUp.drinkFlavor);
System.out.println("*****<><><><><>*****");

ColdDrink mirinda = new ColdDrink();
mirinda.drinkSize = 400;
mirinda.drinkPackaging = "Plastic Bottle";
mirinda.drinkFlavor = "Orange Soda";
System.out.println("The Mirinda drinkSize is: " + mirinda.drinkSize + "ml");
System.out.println("The Mirinda drinkPackaging is: " + mirinda.drinkPackaging);
System.out.println("The Mirinda drinkFlavor is: " + mirinda.drinkFlavor);
System.out.println("*****<><><><><>*****");

ColdDrink sevenUp = new ColdDrink(600, "Can", "Lime");
System.out.println("The Seven Up drinkSize is: " + sevenUp.drinkSize + "ml");
System.out.println("The Seven Up drinkPackaging is: " + sevenUp.drinkPackaging);
System.out.println("The Seven Up drinkFlavor is: " + sevenUp.drinkFlavor);
System.out.println("*****<><><><><>*****");
    }
}
