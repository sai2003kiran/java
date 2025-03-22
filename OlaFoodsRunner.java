class OlaFoodsRunner{
public static void main(String output[]){
  String foodItem = "Ketchup";
  int quantity = 34;
  double price=FoodPandas.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
   double quantityprice=FoodPandas.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+quantityprice);
   else
   System.out.println("  ");
   
 }

}