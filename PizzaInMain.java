class PizzaInMain{
	static long id =  12342267;
	static String name = "ChickenPanner";
    static String size = "Small";
    static String speed = "1hour";
    static String shape = "circle";

 public static void main(String pizzaHut[]){
  System.out.println(">>>>>>>Before Re-intialization<<<<<<<<");
  System.out.println("the Pizza id is : "+id);
  System.out.println("the Pizza Name is : "+name);
  System.out.println("the Pizza size is : "+size);
  System.out.println("the Pizza delivaryspeed is : "+speed);
  System.out.println("the Pizza Shape is : "+shape);
  	 id =  7654321;
	 name = "CheesePanner";
     size = "medium";
     speed = "2hour";
     shape = "Square";
  System.out.println(">>>>>>>After Re-intialization<<<<<<<<");
  System.out.println("the Pizza id is : "+id);
  System.out.println("the Pizza Name is : "+name);
  System.out.println("the Pizza size is : "+size);
  System.out.println("the Pizza delivaryspeed is : "+speed);
  System.out.println("the Pizza Shape is : "+shape);
 }
}