class StoveRunner{
public static void main(String poping[]){

//popular Stove brands
Stove Whirlpool = new Stove();
Whirlpool.stoveTemperature="70.degree";
Whirlpool.noOfBurnals=3;
Whirlpool.stovePower ="Low";
System.out.println("the Whirlpool Stove as stoveTemperature of :"+Whirlpool.stoveTemperature);
System.out.println("the Whirlpool Stove as noOfBurnals of :"+Whirlpool.noOfBurnals);
System.out.println("the Whirlpool Stove as isstovePower  of :"+Whirlpool.stovePower );
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Stove Samsung  = new Stove("150.degree",4,"High");
System.out.println("the Samsung  Stove as stoveTemperature of :"+Samsung .stoveTemperature);
System.out.println("the Samsung  Stove as noOfBurnals of :"+Samsung .noOfBurnals);
System.out.println("the Samsung  Stove as is stovePower  of :"+Samsung .stovePower );
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Stove Bosch = new Stove();
Bosch.stoveTemperature="120.degree";
Bosch.noOfBurnals=1;
Bosch.stovePower ="Medium";
System.out.println("the Bosch Stove as stoveTemperature of :"+Bosch.stoveTemperature);
System.out.println("the Bosch Stove as noOfBurnals of :"+Bosch.noOfBurnals);
System.out.println("the Bosch Stove as isstovePower  of :"+Bosch.stovePower );
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Stove LG  = new Stove("70.degree",2,"Low");
System.out.println("the LG stove as stoveTemperature of :"+LG .stoveTemperature);
System.out.println("the LG stove as noOfBurnals of :"+LG .noOfBurnals);
System.out.println("the LG stove as is stovePower  of :"+LG .stovePower );
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Stove KitchenAid = new Stove();
KitchenAid.stoveTemperature="120.degree";
KitchenAid.noOfBurnals=3;
KitchenAid.stovePower ="Medium";
System.out.println("the KitchenAid Stove as stoveTemperature of :"+KitchenAid.stoveTemperature);
System.out.println("the KitchenAid Stove as noOfBurnals of :"+KitchenAid.noOfBurnals);
System.out.println("the KitchenAid Stove as isstovePower  of :"+KitchenAid.stovePower );
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Stove Frigidaire  = new Stove("150.degree",1,"High");
System.out.println("the Frigidaire  Stove as stoveTemperature of :"+Frigidaire .stoveTemperature);
System.out.println("the Frigidaire  Stove as noOfBurnals of :"+Frigidaire .noOfBurnals);
System.out.println("the Frigidaire  Stove as is stovePower  of :"+Frigidaire .stovePower );
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Stove Maytag = new Stove();
Maytag.stoveTemperature="120.degree";
Maytag.noOfBurnals=3;
Maytag.stovePower ="Low";
System.out.println("the Maytag Stove as stoveTemperature of :"+Maytag.stoveTemperature);
System.out.println("the Maytag Stove as noOfBurnals of :"+Maytag.noOfBurnals);
System.out.println("the Maytag Stove as isstovePower  of :"+Maytag.stovePower );
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Stove Thermador  = new Stove("70.degree",4,"Low");
System.out.println("the Thermador  Stove as stoveTemperature of :"+Thermador .stoveTemperature);
System.out.println("the Thermador  Stove as noOfBurnals of :"+Thermador .noOfBurnals);
System.out.println("the Thermador  Stove as is stovePower  of :"+Thermador .stovePower );
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
}
}