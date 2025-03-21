class HelmetsInOwnMethod{
  static String colour = "GlossyBlack";
  static String brand = "Steelbird";
  static String vehicleServiceType = "Bike";
  static double itemWeight = 0.9D;
  static String material = "High Impact Resistant Thermoplastic shell";

 public static void main(String sbh34[]){
 System.out.println("main Started");
 helmet();
 System.out.println("main ended");
 }

 public static void helmet(){
  System.out.println(">>>>>>Before re-initialization<<<<<<");	
  System.out.println("the Helmets Colour is : "+colour);
  System.out.println("the Helmets Brand is : "+brand);
  System.out.println("the Helmets Vehicle Service Type is : "+vehicleServiceType);
  System.out.println("the Helmets weight is : "+itemWeight);
  System.out.println("the Helmets material is : "+material);
  String colour = "Pink";
  String brand = "Activa";
  String vehicleServiceType = "Scooty";
  double itemWeight = 0.5D;
  String material = "Thermoplastic shell";
  System.out.println(">>>>>>After re-initialization<<<<<<");	
  System.out.println("the Helmets Colour is : "+colour);
  System.out.println("the Helmets Brand is : "+brand);
  System.out.println("the Helmets Vehicle Service Type is : "+vehicleServiceType);
  System.out.println("the Helmets weight is : "+itemWeight);
  System.out.println("the Helmets material is : "+material);
 }
}