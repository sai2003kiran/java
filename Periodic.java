class Periodic{
 static String periodicnames[]= {"Hydrogen","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Phosphorus","Sulfur","Chlorine","Iodine","Vanadium"};
 static char periodicSymbols[] = {'H','B','C','N','O','F','P','S','C','I','V'}; 
 public static void main(String table[]){
 System.out.println("Started main method");
 readDetails();
 System.out.println("the Total no of periodic elements are:"+periodicnames.length);
 System.out.println("the Symbols periodic elements are:"+periodicSymbols.length);
 System.out.println("ended main method");
 } 
 public static void readDetails(){
 System.out.println("started inside the getdetails()");
 for(String periodicname:periodicnames){
  System.out.println(periodicname);
 }
 for(char periodicSymbol:periodicSymbols){
  System.out.println(periodicSymbol);
 } 
 System.out.println("started inside the getdetails()");
 } 
}