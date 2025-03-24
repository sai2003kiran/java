class CarryBag{
int bagCapacity;
String bagClosure;
String bagType;
CarryBag(){
 System.out.println("CarryBag zero constructor is invoked");
}
  CarryBag(int bagCapacity,String bagClosure ,String bagType){
  System.out.println("CarryBag para constructor is invoked");
   this.bagCapacity=bagCapacity;
   this.bagClosure =bagClosure ;
   this.bagType=bagType;
}
}