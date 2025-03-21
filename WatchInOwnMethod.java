class WatchInOwnMethod{
  static long id = 1;
  static String brand = "Titan";
  static String colour = "black";
  static String shape  = "circle";
  static  String type = "wallclock";
  static boolean isWaterProof = true;
  
  public static void main(String accurrancy[]){
  System.out.println("main started");
  time();
  System.out.println("main Ended");
	}
  
  public static void time(){
  System.out.println(">>>>>>>>>>>>Before re-initialization<<<<<<<<<<<<<");
  System.out.println("The watch ID is : "+id);
  System.out.println("The watch Brand is : "+brand);
  System.out.println("The watch Colour is : "+colour);
  System.out.println("The watch shape is : "+shape);
  System.out.println("The watch type is : "+type);
  System.out.println("The watch WaterProof is : "+isWaterProof);
  id = 1;
  brand = "Titan";
  colour = "black";
  shape  = "circle";
  String type = "wallclock";
  isWaterProof = false;
  System.out.println(">>>>>>>>>>>>After re-initialization<<<<<<<<<<<<<");
  System.out.println("The watch ID is : "+id);
  System.out.println("The watch Brand is : "+brand);
  System.out.println("The watch Colour is : "+colour);
  System.out.println("The watch shape is : "+shape);
  System.out.println("The watch type is : "+type);
  System.out.println("The watch WaterProof is : "+isWaterProof);
 }
}