class RefrigeratorInMain{
	static String brand="IFB";
    static String colour="pink";
    static long capacity=197L;
    static String Configuration="Single";
    static long energyStar=5;
    static long price = 67000L;
    static double productDimensions = 127.8D;

 public static void main (String coolSingleDoor[]){
 System.out.println(">>>>>>>Before Re-intialization<<<<<<<<");
 System.out.println("The Refrigerator Brand is : "+brand);
 System.out.println("The Refrigerator Colour is : "+colour);
 System.out.println("The Refrigerator Capacity is : "+capacity);
 System.out.println("The Refrigerator Configuration is : "+Configuration);
 System.out.println("The Refrigerator EnergyStar is : "+energyStar);
 System.out.println("The Refrigerator price is : "+price);
 System.out.println("The Refrigerator productDimensions is : "+productDimensions);
     brand="IFB";
     colour="pink";
     capacity=197L;
     Configuration="Single";
     energyStar=5;
     price = 67000L;
     productDimensions = 127.8D;
 System.out.println(">>>>>>>After Re-intialization<<<<<<<<");
 System.out.println("The Refrigerator Brand is : "+brand);
 System.out.println("The Refrigerator Colour is : "+colour);
 System.out.println("The Refrigerator Capacity is : "+capacity);
 System.out.println("The Refrigerator Configuration is : "+Configuration);
 System.out.println("The Refrigerator EnergyStar is : "+energyStar);
 System.out.println("The Refrigerator price is : "+price);
 System.out.println("The Refrigerator productDimensions is : "+productDimensions);
 }
}