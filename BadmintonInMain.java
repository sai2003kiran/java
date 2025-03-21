class BadmintonInMain{ 
    static String Brand = "jaspo"; 
	static long gripSize = 5L; 
	static String material = "alloySteel";  
	static String colour = "yellow";  
	static String occasion = "playgroung";
 public static void main(String metalAlloyRackets[]){
 System.out.println(">>>>>>Before re-initialization<<<<<<");	
 System.out.println("the Badminton Brand is : "+Brand);
 System.out.println("the Badminton gripSize is : "+gripSize);
 System.out.println("the Badminton Material is : "+material);
 System.out.println("the Badminton colour is : "+colour);
 System.out.println("the Badminton Occasion is : "+occasion);
 Brand = "SMAXKOREA"; 
 gripSize = 675L; 
 material = "Aluminum";  
 colour = "Blue";  
 occasion = "Strung";
 System.out.println(">>>>>>After re-initialization<<<<<<");	
 System.out.println("the Badminton Brand is : "+Brand);
 System.out.println("the Badminton gripSize is : "+gripSize);
 System.out.println("the Badminton Material is : "+material);
 System.out.println("the Badminton colour is : "+colour);
 System.out.println("the Badminton Occasion is : "+occasion);
 }
}