class FoodPandasRunner{
public static void main(String output[]){
  String foodItem = "Pumpkin Seeds";
  double price=FoodPandas.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
 }

}