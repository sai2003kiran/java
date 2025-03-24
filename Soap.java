class Soap{
String latherQuality;
String ecoFriendly ;
int bubbleCount;
Soap(){
 System.out.println("Soap zero constructor is invoked");
}
Soap(String latherQuality,String ecoFriendly ,int bubbleCount){
 System.out.println("Soap para constructor is invoked");
   this.latherQuality=latherQuality;
   this.ecoFriendly =ecoFriendly ;
   this.bubbleCount=bubbleCount;
}
}