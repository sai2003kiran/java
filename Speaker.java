class Speaker{
 static boolean isConnected = false;
 static int currentVolume;
 static int minvolume;
 static int maxvolume=3;

 
 public static boolean onOrOff(){
 if(isConnected==false){
  isConnected=true;
  System.out.println("power is on");
 }else{
 isConnected=false;
 System.out.println("power is off");
 }
 return isConnected;
 }
 
 public static int volumeUp(){
  if(isConnected==true){
   if(currentVolume < maxvolume){
     currentVolume = currentVolume + 1;
	 System.out.println("the currentVolume is "+currentVolume);
   }else{
   System.out.println("maximum volume is exceeded");
   }
  }else{
   System.out.println("please turn on the power button");
  }
  return currentVolume;
 }
 
 
 public static int volumeDown(){
   if(isConnected==true){
   if(currentVolume > minvolume){
     currentVolume = currentVolume-1;
	 System.out.println("the currentVolume is "+currentVolume);
   }else{
   System.out.println("minimum volume is exceeded");
   }
  }else{
   System.out.println("please turn on the power button");
  }
  return currentVolume;
 }
 
}