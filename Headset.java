class Headset{
 static boolean isConnection = true;
 static boolean isDisconnection = true;

 public static boolean powerOn(){
  System.out.println("Conecting process");
  System.out.println("the headset Status initially is :"+isConnection);
  if(isConnection!=true){
   isConnection = true;
   System.out.println("its successful turned ON");
  }else{
  System.out.println("please press the button to turn Off");
  }
  return isConnection;
 }  
 
 public static boolean powerOff(){
	 System.out.println("Disconecting process");
	 System.out.println("the headset Status initially is :"+isDisconnection);
  if(isDisconnection==true){
   isDisconnection = false;
   System.out.println("its successful turned OFF");
  }else{
  System.out.println("please press the button to turn ON");
  powerOn();
  }
  return isDisconnection;
 }
 
 
}