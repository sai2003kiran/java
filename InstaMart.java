class InstaMart{
 public static double takeOrder(String foodItem){
  double itemPrice = 0.0;
  if(foodItem=="Muesli"){
 itemPrice=320.00; return itemPrice;}
  else if(foodItem=="Waffle Mix"){
 itemPrice=4556.09; return itemPrice;}
  else if(foodItem=="Breakfast Biscuits"){
 itemPrice=345.99; return itemPrice; }
  else if(foodItem=="Protein Cereal"){
 itemPrice=54.98;  return itemPrice;}
  else if(foodItem=="Rosé Wine"){
 itemPrice=30.90; return itemPrice;}
  else if(foodItem=="Sparkling Wine"){
 itemPrice=39.98;return itemPrice;}
  else if(foodItem=="Champagne"){
 itemPrice=15.00;  return itemPrice;}
  else if(foodItem=="Whiskey"){
 itemPrice=67.34;  return itemPrice;}
  else if(foodItem=="Vodka"){
 itemPrice=854.09; return itemPrice; }
  else if(foodItem=="Rum"){
 itemPrice=20.98; return itemPrice;}
  else if(foodItem=="Tequila"){
 itemPrice=789.09;  return itemPrice;}
  else if(foodItem==""){
 itemPrice=569.00;  return itemPrice;}
  else if(foodItem=="Craft Beer"){
 itemPrice=349.78; return itemPrice;}
  else if(foodItem=="Walnuts"){
 itemPrice=465.98; return itemPrice;}
  else if(foodItem=="Harissa Paste "){
 itemPrice=43.90; return itemPrice; }
  else if(foodItem=="Truffle Cheese"){
 itemPrice=345.09; return itemPrice;} 
  else if(foodItem=="Foie Gras"){
 itemPrice=598.90; return itemPrice; }
  else if(foodItem=="Blue Cheese"){
 itemPrice=1323.98; return itemPrice;}
  else if(foodItem=="Parmigiano Reggiano"){
 itemPrice=345.99; return itemPrice;} 
  else if(foodItem=="Saffron"){
 itemPrice=7564.09; return itemPrice;}  
  else if(foodItem=="Himalayan Pink Salt"){
 itemPrice=3452.98; return itemPrice;	}
  else if(foodItem=="Plant-Based Milk"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Tofu"){
 itemPrice=563.98; return itemPrice;}
  else if(foodItem=="Jackfruit"){
 itemPrice=345.98; return itemPrice; }
  else if(foodItem=="Vegan Ice Cream"){
 itemPrice=23.98; return itemPrice;}
  else if(foodItem=="Vegan Mayo"){
 itemPrice=345.98; return itemPrice;}
  else if(foodItem=="Coconut Yogurt"){
 itemPrice=3489.45; return itemPrice;}  
  else if(foodItem=="Seitan"){
 itemPrice=789.00; return itemPrice; 	}
  else if(foodItem=="Almond Butter"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Chocolate Cake"){
 itemPrice=14; return itemPrice;}  
  else if(foodItem=="Macarons"){
 itemPrice=678.90; return itemPrice; }
  else if(foodItem=="Éclairs"){
 itemPrice=987.90; return itemPrice;}
  else if(foodItem=="Hazelnuts"){
 itemPrice=198.00; return itemPrice;}
  else if(foodItem=="Danish Pastries"){
 itemPrice=876.99; return itemPrice;}
  else if(foodItem=="Cream Puffs "){
 itemPrice=563.09; return itemPrice;}	
  else if(foodItem=="Fruit Tart"){
 itemPrice=12.00; return itemPrice;}
  else if(foodItem=="Apple Pie"){
 itemPrice=87.00; return itemPrice;} 
  else if(foodItem=="Red Velvet Cake"){
 itemPrice=65.00; return itemPrice;} 
  else if(foodItem=="Fusilli Pasta"){
 itemPrice=67.90; return itemPrice;}
  else if(foodItem=="Lasagna Sheets "){
 itemPrice=1200.00; return itemPrice;}
  else{
  System.out.println(foodItem+"is not found");}
  return itemPrice;
 } 
}