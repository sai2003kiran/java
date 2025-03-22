class ZomatoRunner{
 public static void main(String output[]){
  String foodItem = "Red Lentils";
  int quantity = 3;
  double price=Zomato.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
   double Quantityprice=Zomato.takeOrder(foodItem,quantity);
   if(Quantityprice!=0.0)
   System.out.println(foodItem+" with quantity "+quantity+" as comtaining rupees "+Quantityprice);
   else
   System.out.println("  ");
 }
}