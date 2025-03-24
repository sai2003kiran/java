class Shampoo{
String shampooType;
int shampooVol;
int shampooStock;
Shampoo(){
 System.out.println("Shampoo zero constructor is invoked");
}
Shampoo(String shampooType,int shampooVol,int shampooStock){
 System.out.println("Shampoo para constructor is invoked");
   this.shampooType=shampooType;
   this.shampooVol=shampooVol;
   this.shampooStock=shampooStock;
}
}