class OlaFoods{
 public static double takeOrder(String foodItem){
  double itemPrice = 0.0;
  if(foodItem=="Mustard Sauce"){
 itemPrice=320.00; return itemPrice;}
  else if(foodItem=="Ketchup"){
 itemPrice=4556.09; return itemPrice;}
  else if(foodItem=="Cinnamon Sticks"){
 itemPrice=345.99; return itemPrice; }
  else if(foodItem=="Red Chili Powder"){
 itemPrice=54.98;  return itemPrice;}
  else if(foodItem=="Turmeric Powder"){
 itemPrice=30.90; return itemPrice;}
  else if(foodItem=="Frozen Waffles"){
 itemPrice=39.98;return itemPrice;}
  else if(foodItem=="Frozen French Fries"){
 itemPrice=15.00;  return itemPrice;}
  else if(foodItem=="Frozen Chicken Nuggets"){
 itemPrice=67.34;  return itemPrice;}
  else if(foodItem=="Frozen Yogurt"){
 itemPrice=854.09; return itemPrice; }
  else if(foodItem=="Frozen Shrimp"){
 itemPrice=20.98; return itemPrice;}
  else if(foodItem=="Frozen Fish Fillets"){
 itemPrice=789.09;  return itemPrice;}
  else if(foodItem=="Frozen Pizza"){
 itemPrice=569.00;  return itemPrice;}
  else if(foodItem=="Almond Coffee "){
 itemPrice=349.78; return itemPrice;}
  else if(foodItem=="Sparkling Water "){
 itemPrice=465.98; return itemPrice;}
  else if(foodItem=="Energy Drink"){
 itemPrice=43.90; return itemPrice; }
  else if(foodItem=="Coconut Water"){
 itemPrice=345.09; return itemPrice;} 
  else if(foodItem=="Fresh Juice"){
 itemPrice=598.90; return itemPrice; }
  else if(foodItem=="Instant Coffee"){
 itemPrice=1323.98; return itemPrice;}
  else if(foodItem=="Coffee Beans"){
 itemPrice=345.99; return itemPrice;} 
  else if(foodItem=="Zucchini"){
 itemPrice=7564.09; return itemPrice;}  
  else if(foodItem=="Bell Peppers"){
 itemPrice=3452.98; return itemPrice;	}
  else if(foodItem=="Broccoli"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Spinach"){
 itemPrice=563.98; return itemPrice;}
  else if(foodItem=="Lettuce"){
 itemPrice=345.98; return itemPrice; }
  else if(foodItem=="Cucumbers"){
 itemPrice=23.98; return itemPrice;}
  else if(foodItem=="Carrots"){
 itemPrice=345.98; return itemPrice;}
  else if(foodItem=="Avocado juice"){
 itemPrice=3489.45; return itemPrice;}  
  else if(foodItem=="Watermelon Juice"){
 itemPrice=789.00; return itemPrice; 	}
  else if(foodItem=="Roasted Chickpeas"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Granola Bar"){
 itemPrice=14; return itemPrice;}  
  else if(foodItem=="Pretzels"){
 itemPrice=678.90; return itemPrice; }
  else if(foodItem=="Rice Cakes"){
 itemPrice=987.90; return itemPrice;}
  else if(foodItem=="Energy Bars"){
 itemPrice=198.00; return itemPrice;}
  else if(foodItem=="Trail Mix"){
 itemPrice=876.99; return itemPrice;}
  else if(foodItem=="Blueberries juice"){
 itemPrice=563.09; return itemPrice;}	
  else if(foodItem=="Coconut Oil"){
 itemPrice=12.00; return itemPrice;}
  else if(foodItem=="Millet"){
 itemPrice=87.00; return itemPrice;} 
  else if(foodItem=="Sesame Oil"){
 itemPrice=65.00; return itemPrice;} 
  else if(foodItem=="Peanut Oil"){
 itemPrice=67.90; return itemPrice;}
  else if(foodItem=="Mozzarella Cheese"){
 itemPrice=1200.00; return itemPrice;}
  else{
  System.out.println(foodItem+"is not found");}
  return itemPrice;
 } 
}