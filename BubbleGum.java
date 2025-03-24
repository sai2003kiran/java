class BubbleGum{
String flavor;
int chewDuration;
String sugarFree;
BubbleGum(){
   System.out.println("BubbleGum zero constructor is strated invoking");
   }
BubbleGum(String flavor,int chewDuration,String sugarFree){
    System.out.println("BubbleGum para constructor is strated invoking");
 //this keyword is used to indicate the instance variable
  this.flavor=flavor;
  this.chewDuration=chewDuration;
  this.sugarFree=sugarFree;
  }
}