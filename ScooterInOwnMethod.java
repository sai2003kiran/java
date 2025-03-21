class ScooterInOwnMethod{
 static String brand="EOX E2";
 static String colour="black";
 static long distanceCovering=60L;
 static String motor="waterProofMotor";
 static long energyStar=5;
 static long price = 78000L;

 
 public static void main(String rtoEVBike[]){
 System.out.println("main Started");
 scot();
 System.out.println("main ended");
 }
 
 
 public static void scot(){
 System.out.println(">>>>>>Before re-initialization<<<<<<");
 System.out.println("The Scooter Brand is : "+brand);
 System.out.println("The Scooter Colour is : "+colour);
 System.out.println("The Scooter Distance Covering is : "+distanceCovering);
 System.out.println("The Scooter Motor is : "+motor);
 System.out.println("The Scooter EnergyStar is : "+energyStar);
 System.out.println("The Scooter price is : "+price);
 System.out.println(">>>>>>After re-initialization<<<<<<");
 brand="ester";
 colour="red";
 distanceCovering=36L;
 motor="shockProofMotor";
 energyStar=3;
 price = 85970L;
 System.out.println("The Scooter Brand is : "+brand);
 System.out.println("The Scooter Colour is : "+colour);
 System.out.println("The Scooter Distance Covering is : "+distanceCovering);
 System.out.println("The Scooter Motor is : "+motor);
 System.out.println("The Scooter EnergyStar is : "+energyStar);
 System.out.println("The Scooter price is : "+price);
 }
}