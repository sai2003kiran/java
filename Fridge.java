class Fridge{
static boolean isConnected;
static int currentStatus;
static int maxTemp=3;
static int minTemp;
 public static boolean onOff(){
  if(isConnected==false){
   isConnected=true;
   System.out.println("power is on");
  }else{
   System.out.println("power is off");
  }return isConnected;
 }

public static int increaseCooling(){
 if (isConnected==true){
   if(currentStatus<maxTemp){
    currentStatus=currentStatus+1;
	System.out.println("the currentStatus is "+currentStatus);
   }else{
    System.out.println("maxTemp is exceeded");
   }
 }else{System.out.println("please turn on the fridge");}
  return currentStatus;
}
 
 public static int decreaseCooling(){
 if (isConnected==true){
   if(currentStatus>minTemp){
    currentStatus=currentStatus-1;
	System.out.println("the currentStatus is "+currentStatus);
   }else{
    System.out.println("minTemp is exceeded");
   }
 }else{System.out.println("please turn on the fridge");}
  return currentStatus;
}
 
}