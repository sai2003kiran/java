class Vase{
String VasePattern;
String VaseFeatures;
String VaseStyle;
Vase(){
 System.out.println("Vase zero constructor is invoked");
}
  Vase(String VasePattern,String VaseFeatures ,String VaseStyle){
  System.out.println("Vase para constructor is invoked");
   this.VasePattern=VasePattern;
   this.VaseFeatures =VaseFeatures ;
   this.VaseStyle=VaseStyle;
}
}