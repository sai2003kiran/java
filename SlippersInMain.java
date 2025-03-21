class SlippersInMain{
	static String closureType = "Slip On";
	static String heelType="Flat";
	static String resistanceLevel="Water Resistant";
	static String strapType="Knee";
	static String soleMaterial="Ethylene Vinyl Acetate";
	static String countryOfOrigin="India";

 public static void main(String diabatic[]){
 	System.out.println(">>>>>>Before re-initialization<<<<<<");
	System.out.println("the slipper closureType is : "+closureType);
	System.out.println("the slipper heelType is : "+heelType);
	System.out.println("the slipper resistance level : "+resistanceLevel);
	System.out.println("the slipper strapType :"+strapType);
	System.out.println("the slipper soleMaterial is :"+soleMaterial);
	System.out.println("the slipper country Of Origin is :"+countryOfOrigin);
	closureType = "Slips";
	heelType="normal";
	resistanceLevel="Waterproof Resistant";
	strapType="Knee";
	soleMaterial="Acetate";
	countryOfOrigin="iran";
	System.out.println(">>>>>>After re-initialization<<<<<<");	
	System.out.println("the slipper closureType is : "+closureType);
	System.out.println("the slipper heelType is : "+heelType);
	System.out.println("the slipper resistance level : "+resistanceLevel);
	System.out.println("the slipper strapType :"+strapType);
	System.out.println("the slipper soleMaterial is :"+soleMaterial);
	System.out.println("the slipper country Of Origin is :"+countryOfOrigin);
 }
}