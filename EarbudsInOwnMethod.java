class EarbudsInOwnMethod{
    static String Brand  =	"GM";
	static String colour =	"Blue";
    static String earPlacement	= "Ear";
    static String impedance = "32 Ohm";
    static String formFactor =	"Smooth";

 public static void main(String clearCalls[]){
 System.out.println("main Started");
 eb();
 System.out.println("main ended");
 }

 public static void eb(){
    System.out.println(">>>>>>Before re-initialization<<<<<<");	
	System.out.println("The earbuds Brand is : "+Brand);
	System.out.println("The earbuds Colour is : "+colour);
	System.out.println("The earbuds Placement is : "+earPlacement);
	System.out.println("The earbuds FormFactor is : "+formFactor);
	System.out.println("The earbuds impedance is : "+impedance);
	Brand="Boat";
	colour="Brown";
    earPlacement="Ear";
    impedance="56Ohm";
    formFactor="hard";
	System.out.println(">>>>>>After re-initialization<<<<<<");	
	System.out.println("The earbuds Brand is : "+Brand);
	System.out.println("The earbuds Colour is : "+colour);
	System.out.println("The earbuds Placement is : "+earPlacement);
	System.out.println("The earbuds FormFactor is : "+formFactor);
	System.out.println("The earbuds impedance is : "+impedance);
 }
}