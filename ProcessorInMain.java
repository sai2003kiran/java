class ProcessorInMain{
  static long id = 987605;
  static String name = "Intel";
  static String clockspeed = "4.4GHz";
  static int gen = 5;
  static String socket = "LGA1700";
 
  public static void main(String specification[]){
  System.out.println(">>>>>>>Before Re-intialization<<<<<<<<");
  System.out.println("The Processor iID is : "+id);
  System.out.println("The Processor Name is : "+name);
  System.out.println("The Processor Generation is : "+gen);
  System.out.println("The Processor Clockspeed is : "+clockspeed);
  System.out.println("The Processor Socket is : "+socket);
  
  id = 578632;
  name = "IBM";
  clockspeed = "9.9GHz";
  gen = 3;
  socket = "L";
  
  System.out.println(">>>>>>>After Re-intialization<<<<<<<<");
  System.out.println("The Processor iID is : "+id);
  System.out.println("The Processor Name is : "+name);
  System.out.println("The Processor Generation is : "+gen);
  System.out.println("The Processor Clockspeed is : "+clockspeed);
  System.out.println("The Processor Socket is : "+socket);  
 }
}