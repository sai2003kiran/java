class CookerInOwnMethod{
 static String Brand = "Pigeon";
 static long capacity = 5L; 
 static String material = "Stainless steel";
 static long watt = 220L;
 static String colour = "Silver";
 static long weight = 6L;
 static String product = "45D x 45W x 35H";
 
 public static void main(String pressure[]){
 System.out.println("main Started");
 cooker();
 System.out.println("main ended");
 }
 
 public static void cooker(){
 System.out.println(">>>>>>before re-initialization<<<<<<");	
 System.out.println("the cooker's Brand is : "+Brand);
 System.out.println("the cooker's Capacity is : "+capacity);
 System.out.println("the cooker's Material is : "+material);
 System.out.println("the cooker's colour is : "+colour);
 System.out.println("the cooker's Watt's is : "+watt);
 System.out.println("the cooker's weight in kg is : "+weight);
 System.out.println("the cooker's product dimension width and heigth is : "+product);
  Brand = "Pretige";
  capacity = 3L;
  material = "steel";
  watt = 220L;
  colour = "grey";
  weight = 5L;
  String product = "45D x 45W x 35H";
 System.out.println(">>>>>>After re-initialization<<<<<<");	
 System.out.println("the cooker's Brand is : "+Brand);
 System.out.println("the cooker's Capacity is : "+capacity);
 System.out.println("the cooker's Material is : "+material);
 System.out.println("the cooker's colour is : "+colour);
 System.out.println("the cooker's Watt's is : "+watt);
 System.out.println("the cooker's weight in kg is : "+weight);
 System.out.println("the cooker's product dimension width and heigth is : "+product);
 }
}