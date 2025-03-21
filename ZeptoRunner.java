class ZeptoRunner{
public static void main(String output[]){
  String foodItem = "Breakfast Biscuits";
  double price=Zepto.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
 }

}