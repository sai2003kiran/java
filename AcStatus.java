class AcStatus{
static boolean isConnected = false;
static int currentTemp;
static int maxTemp=5;
static int minTemp;
public static void onOrOff(){
	if(isConnected==false){
		isConnected=true;		
 		System.out.println("the power is on ");

	}else{
		isConnected=false;
		 		System.out.println("the power is off ");
	}
}

 public static void increaseTemp(){
	 if (isConnected==true){
		if(currentTemp<maxTemp){
			currentTemp=currentTemp+1;
		 		System.out.println(currentTemp);
		}else{
		System.out.println("max temperture reached");} 
	 }else{
		System.out.println("please turn on");
	 }
 }
 
  public static void decreaseTemp(){
	 if (isConnected==true){
		if(currentTemp>minTemp){
			currentTemp=currentTemp-1;		
			System.out.println(currentTemp);
		}else{
		System.out.println("min temperture reached");} 
	 }else{
		System.out.println("please turn on");
	 }
 }
 
}