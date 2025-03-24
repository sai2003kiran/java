class Bell{
String bellSound;
String bellTone;
String bellPurpose;
Bell(){
 System.out.println("Bell zero constructor is invoked");
}
  Bell(String bellSound,String bellTone ,String bellPurpose){
  System.out.println("Bell para constructor is invoked");
   this.bellSound=bellSound;
   this.bellTone =bellTone ;
   this.bellPurpose=bellPurpose;
}
}