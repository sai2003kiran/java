class Microwen{
static boolean isConnect=false;
static int currentStatus;
static int maxTemp = 4;
static int minTemp;

 public static boolean onOff(){
  if(isConnect==false){
   isConnect=true;
   System.out.println("Microwen is on");
  }else{
      System.out.println("Microwen is off");
  }
  return isConnect;
 }
 
 public static int increaseHeat(){
 if(isConnect==true){
 if(currentStatus<maxTemp){
 currentStatus=currentStatus+1;
  System.out.println("the current Status is "+currentStatus);
 }else{System.out.println("maximum temperature is exceeded");}
 }else{
 System.out.println("please turn on the owen");
 }return currentStatus;
 }
 
  public static int decreaseHeat(){
 if(isConnect==true){
 if(currentStatus>minTemp){
 currentStatus=currentStatus-1;
  System.out.println("the current Status is "+currentStatus);
 }else{System.out.println("minimum temperature is exceeded");}
 }else{
 System.out.println("please turn on the owen");
 }return currentStatus;
 }
 
}