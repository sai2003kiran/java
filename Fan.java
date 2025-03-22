class Fan{
static boolean isConnected;
static int currentStatus;
static int maxSpeed=3;
static int minSpeed;
	public static boolean onOff(){
		if(isConnected==false){
		 isConnected=true;
		 System.out.println("power is on");
		}else{
		 System.out.println("power is off");		
		}return isConnected;
	}
	public static int increaseVolume(){
	 if(isConnected==true){
	 if(currentStatus<maxSpeed){
	 currentStatus=currentStatus+1;
	 System.out.println("the currentStatus is "+currentStatus);}
	 else{
	 System.out.println("Max Speed is exceeded");
	 }
	 }else{
	 System.out.println("please turn on the fan");}
	 return currentStatus;
	}
	
	public static int decreaseVolume(){
	 if(isConnected==true){
	 if(currentStatus>minSpeed){
	 currentStatus=currentStatus-1;
	 System.out.println("the currentStatus is "+currentStatus);}
	 else{
	 System.out.println("Min Speed is exceeded");
	 }
	 }else{
	 System.out.println("please turn on the fan");}
	 return currentStatus;
	}
		
}