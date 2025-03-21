class AreaTry{
static int pinCodes[]={500069,560043,566094,560089};
 public static void getPinCode(){
  System.out.println("Started inside the  getPinCode()");
  for (int pinCode: pinCodes){
   System.out.println(pinCode);
  }
  System.out.println("ending inside the  getPinCode()");
 }
 public static void main(String area[]){
 System.out.println("Started main method");
 getPinCode();
 System.out.println("ending main method ");
 }
}