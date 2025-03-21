class BallInMain{
 static String Brand = "FitBox Sports";
 static long weight = 50;
 static String material = "Blend";
 static String colour = "yellow";
 static String occasion = "playgroung";
 public static void main(String tennisGully[]){
   System.out.println(">>>>>>Before re-initialization<<<<<<");	
 System.out.println("the tennisBall Brand is : "+Brand);
 System.out.println("the tennisBall gripSize is : "+weight);
 System.out.println("the tennisBall Material is : "+material);
 System.out.println("the tennisBall colour is : "+colour);
 System.out.println("the tennisBall Occasion is : "+occasion);
  Brand = "Teloon";
  weight = 80;
  material = "Soft";
  colour = "red";
  occasion = "Tennis";
  System.out.println(">>>>>>After re-initialization<<<<<<");	
 System.out.println("the tennisBall Brand is : "+Brand);
 System.out.println("the tennisBall gripSize is : "+weight);
 System.out.println("the tennisBall Material is : "+material);
 System.out.println("the tennisBall colour is : "+colour);
 System.out.println("the tennisBall Occasion is : "+occasion);
 }
}