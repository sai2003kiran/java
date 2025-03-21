class SmartRingInMain{
 static long capacity=1L;
 static String colour="brown";
 static String features="Sleep Monitor,Lightweight,MultisportTracker,Accelerometer,Activity Tracker";
 static String connectivityTechnology="Bluetooth";
 static long size=6;
 static long price = 35678L;

 public static void main (String fitnessTracker[]){
 System.out.println(">>>>>>Before re-initialization<<<<<<");
 System.out.println("The Smart Ring Capacity is : "+capacity+"mb");
 System.out.println("The Smart Ring Colour is : "+colour);
 System.out.println("The Smart Ring Features is : "+features);
 System.out.println("The Smart Ring Connectivity Technology is : "+connectivityTechnology);
 System.out.println("The Smart Ring Size is : "+size);
 System.out.println("The Smart Ring price is : "+price);
	capacity=3L;
	colour="black";
	features="Tracker";
	connectivityTechnology="Bluetooth";
	long size=8;
	price = 32878L;
 System.out.println(">>>>>>After re-initialization<<<<<<");
 System.out.println("The Smart Ring Capacity is : "+capacity+"mb");
 System.out.println("The Smart Ring Colour is : "+colour);
 System.out.println("The Smart Ring Features is : "+features);
 System.out.println("The Smart Ring Connectivity Technology is : "+connectivityTechnology);
 System.out.println("The Smart Ring Size is : "+size);
 System.out.println("The Smart Ring price is : "+price);
 }
}