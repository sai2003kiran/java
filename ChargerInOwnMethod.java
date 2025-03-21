class ChargerInOwnMethod{
  static long id = 132445;
  static String brand = "OOPO";
  static String color = "Black";
  static String power = "100kw";
  static char type = 'C';
  static String price = "$122";
  static boolean isportable = true;
  
 public static void main(String capacity[]){
 System.out.println("main Started");
 charger();
 System.out.println("main ended");
  }
  
 public static void charger(){
  System.out.println(">>>>>>Before re-initialization<<<<<<");
  System.out.println("the charger ID number : "+id);
  System.out.println("the charger Brand : "+brand);
  System.out.println("the charger Color : "+color);
  System.out.println("the charger Power : "+power);
  System.out.println("the charger Type : "+type);
  System.out.println("the charger Price : "+price);
  System.out.println("the charger Portable : "+isportable);
  id = 123456;
  brand = "VIVO";
  color = "RED";
  power = "200kw";
  type = 'B';
  price = "$130";
  isportable = false;
  System.out.println(">>>>>>After re-initialization<<<<<<");
  System.out.println("the charger ID number : "+id);
  System.out.println("the charger Brand : "+brand);
  System.out.println("the charger Color : "+color);
  System.out.println("the charger Power : "+power);
  System.out.println("the charger Type : "+type);
  System.out.println("the charger Price : "+price);
  System.out.println("the charger Portable : "+isportable); 
 }
}