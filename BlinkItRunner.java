class BlinkItRunner 
{
    public static void main(String food[]) 
	{
        String foodName = "Burritos";
		int quantity =2;
        double price = BlinkIt.foodPrice(foodName);  
        System.out.println("The price of " + foodName + " is: " + price);
		double priceQuantity = BlinkIt.foodPrice(foodName,quantity);
		System.out.println("The price of the "+foodName+" for the requred quantity "+quantity+" is "+priceQuantity);
		
    }
}
