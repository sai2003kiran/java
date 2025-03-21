class AirportInMain{
 static  long id = 432567; 
 static String  name = "Indica";
 static String location = "delhi";
 static int noOfTerminals = 14;
 static String type = "BusinessClass";

 public static void main (String highSpeedFan[]){
 System.out.println(">>>>>>Before re-initialization<<<<<<");
 System.out.println("the plane id is : "+id);
 System.out.println("the plane name is : "+name);
 System.out.println("the plane Location is : "+location);
 System.out.println("the plane number Of Terminals is : "+noOfTerminals);
 System.out.println("the plane classtype is : "+type);
 System.out.println(">>>>>>After re-initialization<<<<<<");	
	id = 985674; 
	name = "AirIndia";
	location = "Andhrapradesh";
	int noOfTerminals = 10;
	type = "EconomyClass";
 System.out.println("the plane id is : "+id);
 System.out.println("the plane name is : "+name);
 System.out.println("the plane Location is : "+location);
 System.out.println("the plane number Of Terminals is : "+noOfTerminals);
 System.out.println("the plane classtype is : "+type); }
}