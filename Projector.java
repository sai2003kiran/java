class Projector{
static boolean isConnect=false;
static int currentStatus;
static int currentBright;
static int maxBrightness = 4;
static int minBrightness;
static int maxVol=3;
static int minVol;

 public static boolean onOff(){
  if(isConnect==false){
   isConnect=true;
   System.out.println("Microwen is on");
  }else{
      System.out.println("Microwen is off");
  }
  return isConnect;
 }
 
 public static int increaseBright(){
 if(isConnect==true){
 if(currentBright<maxBrightness){
 currentBright=currentBright+1;
  System.out.println("the current Status is of Brightness"+currentBright);
 }else{System.out.println("maximum Brightness is exceeded");}
 }else{
 System.out.println("please turn on the owen");
 }return currentBright;
 }
 
 public static int decreaseBright(){
 if(isConnect==true){
 if(currentBright>minBrightness){
 currentBright=currentBright-1;
  System.out.println("the current Status is of Brightness"+currentBright);
 }else{System.out.println("minimum Brightness is exceeded");}
 }else{
 System.out.println("please turn on the owen");
 }return currentBright;
 }
 
 public static int increaseVolume(){
 if(isConnect==true){
 if(currentStatus<maxVol){
 currentStatus=currentStatus+1;
  System.out.println("the current Status is of volume"+currentStatus);
 }else{System.out.println("maximum Volume is exceeded");}
 }else{
 System.out.println("please turn on the owen");
 }return currentStatus;
 }
 
 public static int decreaseVolume(){
 if(isConnect==true){
 if(currentStatus>minVol){
 currentStatus=currentStatus-1;
  System.out.println("the current Status is of volume "+currentStatus);
 }else{System.out.println("minimum Volume is exceeded");}
 }else{
 System.out.println("please turn on the owen");
 }return currentStatus;
 }
 
}