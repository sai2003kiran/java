class PeriodicTable{
 static String periodicname[]= {"Hydrogen","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Phosphorus","Sulfur","Chlorine","Iodine","Vanadium"};
 static char periodicSymbols[] = {'H','B','C','N','O','F','P','S','C','I','V'}; 
 
public static void main(String table[]){
 System.out.println("the Total no of periodic elements are:"+periodicname.length);
 System.out.println("the Symbols periodic elements are:"+periodicSymbols.length);
 System.out.println(periodicname[0]+" "+periodicname[1]+" "+periodicname[2]+" "+periodicname[3]+" "+periodicname[4]+" "+periodicname[5]+" "+periodicname[6]+" "+periodicname[7]+" "+periodicname[8]+" "+periodicname[9]);
  System.out.println(periodicSymbols[0]+" "+periodicSymbols[1]+" "+periodicSymbols[2]+" "+periodicSymbols[3]+" "+periodicSymbols[4]+" "+periodicSymbols[5]+" "+periodicSymbols[6]+" "+periodicSymbols[7]+" "+periodicSymbols[8]+" "+periodicSymbols[9]);
 }
}