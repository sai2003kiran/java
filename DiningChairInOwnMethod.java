class DiningChairInOwnMethod{
	static String brand="SONA ART & CRAFTS";
	static String colour="brown";
	static String Type="GlassTop";
	static long dimension=60L;
	static long size=6;
	static long price = 35678L;

 public static void main (String solidSheeshamWood[]){
 System.out.println("main Started");
 dc();
 System.out.println("main ended"); 
 }
 
 
 public static void dc(){
 System.out.println(">>>>>>Before re-initialization<<<<<<");	
 System.out.println("The DiningChair Brand is : "+brand);
 System.out.println("The DiningChair Colour is : "+colour);
 System.out.println("The DiningChair Type is : "+Type);
 System.out.println("The DiningChair Dimension is : "+dimension);
 System.out.println("The DiningChair Size is : "+size);
 System.out.println("The DiningChair price is : "+price);
 	brand="CRAFTS";
	colour="black";
	Type="top";
	dimension=80L;
	size=4;
	price = 45987L;
 System.out.println(">>>>>>After re-initialization<<<<<<");	
 System.out.println("The DiningChair Brand is : "+brand);
 System.out.println("The DiningChair Colour is : "+colour);
 System.out.println("The DiningChair Type is : "+Type);
 System.out.println("The DiningChair Dimension is : "+dimension);
 System.out.println("The DiningChair Size is : "+size);
 System.out.println("The DiningChair price is : "+price);
 
 }
}