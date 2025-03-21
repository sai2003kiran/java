class CupInOwnMethod{

 static String Brand = "Greenwave";
 static long capacity = 5L;
 static String material = "mug";
 static String colour = "yellow";
 static String occasion = "Wedding & Birthday";
 static String  pattern = "Solid";
 static String product = "Home";

 public static void main(String emojiStyleTea[]){
 System.out.println("main Started");
 cup();
 System.out.println("main ended");
 }

 public static void cup(){
 System.out.println(">>>>>>Before re-initialization<<<<<<");
 System.out.println("the Cup Brand is : "+Brand);
 System.out.println("the Cup Capacity is : "+capacity);
 System.out.println("the Cup Material is : "+material);
 System.out.println("the Cup colour is : "+colour);
 System.out.println("the Cup Occasion is : "+occasion);
 System.out.println("the Cup pattern in kg is : "+pattern);
 System.out.println("the Cup product is : "+product);	
 Brand = "complain";
 capacity = 3L;
 material = "fiber";
 colour = "pink";
 occasion = "Birthday";
 pattern = "cylinder";
 product = "Hotal";
 System.out.println(">>>>>>After re-initialization<<<<<<");	
 System.out.println("the Cup Brand is : "+Brand);
 System.out.println("the Cup Capacity is : "+capacity);
 System.out.println("the Cup Material is : "+material);
 System.out.println("the Cup colour is : "+colour);
 System.out.println("the Cup Occasion is : "+occasion);
 System.out.println("the Cup pattern in kg is : "+pattern);
 System.out.println("the Cup product is : "+product);
 }
}