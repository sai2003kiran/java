class Mixer{
static boolean isConnected;
static int currentStatus;
static int maxSpeed=3;
static int minSpeed;

public static boolean onOff(){
if(isConnected==false){
isConnected=true;
System.out.println("Power is on");
}else{System.out.println("Power is off");
}
return isConnected;
}
public static int increaseSpeed(){
if(isConnected==true){
if(currentStatus<maxSpeed){
currentStatus=currentStatus+1;
System.out.println("the Current Status is "+currentStatus);
}else{System.out.println("Maximum Speed is exceeded");}
}else{System.out.println("please turn on the Mixer");}
return currentStatus;
}
public static int decreaseSpeed(){
if(isConnected==true){
if(currentStatus>minSpeed){
currentStatus=currentStatus-1;
System.out.println("the Current Status is "+currentStatus);
}else{System.out.println("Minimum Speed is exceeded");}
}else{System.out.println("please turn on the Mixer");}
return currentStatus;
}

}