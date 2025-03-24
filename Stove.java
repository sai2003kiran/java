class Stove{
String stoveTemperature;
int noOfBurnals;
String stovePower ;
Stove(){
   System.out.println("Stove zero constructor is strated invoking");
   }
Stove(String stoveTemperature,int noOfBurnals,String stovePower ){
    System.out.println("Stove para constructor is strated invoking");
 //this keyword is used to indicate the instance variable
  this.stoveTemperature=stoveTemperature;
  this.noOfBurnals=noOfBurnals;
  this.stovePower =stovePower ;
  }
}