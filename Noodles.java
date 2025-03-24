class Noodles{
String noodleType;
String noodleFlavor;
int noodleThickness;
Noodles(){
 System.out.println("Noodles zero constructor is invoked");
}
  Noodles(int bagCapacity,String bagClosure ,String bagType){
  System.out.println("CarryBag para constructor is invoked");
   this.bagCapacity=bagCapacity;
   this.bagClosure =bagClosure ;
   this.bagType=bagType;
}
}