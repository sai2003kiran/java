class SwiggyRunner{
 public static void main(String output[]){
   String foodItem = "Popcorn";
   int quantity = 9;
   double price=Swiggy.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
   double Qunatityprice=Swiggy.takeOrder(foodItem,quantity);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+Qunatityprice);
   else
   System.out.println("  ");
 }
}