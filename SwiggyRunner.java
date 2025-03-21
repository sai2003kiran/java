class SwiggyRunner{
 public static void main(String output[]){
  String foodItem = "Popcorn";
  double price=Swiggy.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
 }
}