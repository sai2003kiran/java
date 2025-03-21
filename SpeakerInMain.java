class SpeakerInMain{
 static String brand="boAt";
 static String colour="green";
 static String mountingType="Wall";
 static  long distanceCovering=60L;
 static String connectivityTechnology="Bluetooth";
 static  long audioOutputResult=5;
 static long price = 5678L;

 public static void main (String multiCompatibility[]){
 System.out.println(">>>>>>Before re-initialization<<<<<<");
 System.out.println("The Speaker Brand is : "+brand);
 System.out.println("The Speaker Colour is : "+colour);
 System.out.println("The Speaker MountingType is : "+mountingType);
 System.out.println("The Speaker Distance Covering is : "+distanceCovering+" kmph");
 System.out.println("The Speaker Connectivity Technology is : "+connectivityTechnology);
 System.out.println("The Speaker AudioOutputResult is : "+audioOutputResult+"th level");
 System.out.println("The Speaker price is : "+price+" rupees"); 
 brand="phillipes";
 colour="pink";
 mountingType="Walled";
 connectivityTechnology="Bluetooth";
 distanceCovering=50L;
 audioOutputResult=3;
 price = 56342L;
 System.out.println(">>>>>>After re-initialization<<<<<<");
 System.out.println("The Speaker Brand is : "+brand);
 System.out.println("The Speaker Colour is : "+colour);
 System.out.println("The Speaker MountingType is : "+mountingType);
 System.out.println("The Speaker Distance Covering is : "+distanceCovering+" kmph");
 System.out.println("The Speaker Connectivity Technology is : "+connectivityTechnology);
 System.out.println("The Speaker AudioOutputResult is : "+audioOutputResult+"th level");
 System.out.println("The Speaker price is : "+price+" rupees");
 }
}