class Mat{
String matMatrix;
String stepShield;
String pathPad;
Mat(){
 System.out.println("Mat zero constructor is invoked");
}
  Mat(String matMatrix,String stepShield ,String pathPad){
  System.out.println("Mat para constructor is invoked");
   this.matMatrix=matMatrix;
   this.stepShield =stepShield ;
   this.pathPad=pathPad;
}
}