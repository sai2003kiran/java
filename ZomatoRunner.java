class ZomatoRunner{
 public static void main(String output[]){
  String foodItem = "Red Lentils";
  double price=Zomato.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
 }
}