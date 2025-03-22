class Radio{
static boolean isConnected;
static int currentStatus;
static int maxVolume=3;
static int minVolume;

public static boolean onOff(){
if(isConnected==false){
 isConnected=true;
 System.out.println("power is on");
}else{
 isConnected=false;
  System.out.println("power is off");
}return isConnected;
}
public static int increaseVolume(){
if (isConnected==true){
if(currentStatus<maxVolume){
currentStatus=currentStatus+1;
System.out.println("the currentStatus is "+currentStatus);
}
else{
System.out.println("Maximum volume have reached ");}
}
else{System.out.println("please turn on the Radio");}
return currentStatus;
}

public static int decreaseVolume(){
if (isConnected==true){
if(currentStatus>minVolume){
currentStatus=currentStatus-1;
System.out.println("the currentStatus is "+currentStatus);}
else{
System.out.println("Minimum volume have reached ");}
}else{System.out.println("please turn on the Radio");}
return currentStatus;
}

}