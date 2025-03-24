class Chain{
String material;
int price;
int weigth ;
Chain(){
   System.out.println("chain zero constructor is strated invoking");
   }
Chain(String material,int price,int weigth ){
    System.out.println("chain para constructor is strated invoking");
 //this keyword is used to indicate the instance variable
  this.material=material;
  this.price=price;
  this.weigth =weigth ;
  }
}