class DominosRunner{
 public static void main(String output[]){
  String foodItem = "Specialty Cold Brew";
  double price=Dominos.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
 }
}