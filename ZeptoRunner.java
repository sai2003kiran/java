class ZeptoRunner{
public static void main(String output[]){
  String foodItem = "Pickles";
  int quantity = 45;
  double price=Zepto.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
   double Quantityprice=Zepto.takeOrder(foodItem,quantity);
   if(price!=0.0)
   System.out.println(foodItem+" with "+quantity+" quantity "+" as comtaining rupees "+Quantityprice);
   else
   System.out.println("  ");
 }

}