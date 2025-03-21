class AirCoolerInOwnMethod{
 static String brand="Bajaj"; 
 static String colour="Bhite";
 static String features="Adjustable Speed, Portable";
 static String controlsType="Knob";
 static long FloorArea=200;
 static long price = 3578L;
 
 public static void ac(){
 System.out.println(">>>>>>Before re-initialization<<<<<<");
 System.out.println("The AirCooler Brand is : "+brand);
 System.out.println("The AirCooler Colour is : "+colour);
 System.out.println("The AirCooler Features is : "+features);
 System.out.println("The AirCooler controlsType is : "+controlsType);
 System.out.println("The AirCooler FloorArea is : "+FloorArea+"Square Feet");
 System.out.println("The AirCooler price is : "+price+"rupees");
 System.out.println(">>>>>>After re-initialization<<<<<<");	
	brand="CENSTECH"; 
	colour="Black";
	features="Convenient Control and Operation";
	controlsType="Remote";
	FloorArea=50;
	price = 3850L;
 System.out.println("The AirCooler Brand is : "+brand);
 System.out.println("The AirCooler Colour is : "+colour);
 System.out.println("The AirCooler Features is : "+features);
 System.out.println("The AirCooler controlsType is : "+controlsType);
 System.out.println("The AirCooler FloorArea is : "+FloorArea+"Square Feet");
 System.out.println("The AirCooler price is : "+price+"rupees");
 }

 public static void main (String highSpeedFan[]){
 System.out.println("main Started");
 ac();
 System.out.println("main ended");
 }
}