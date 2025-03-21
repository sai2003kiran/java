class FoodPandas{
 public static double takeOrder(String foodItem){
  double itemPrice = 0.0;
  if(foodItem=="Organic Coconut Sugar"){
 itemPrice=320.00; return itemPrice;}
  else if(foodItem=="Organic Coconut Sugar "){
 itemPrice=4556.09; return itemPrice;}
  else if(foodItem=="Pumpkin Seeds"){
 itemPrice=345.99; return itemPrice; }
  else if(foodItem=="Hemp Seeds"){
 itemPrice=54.98;  return itemPrice;}
  else if(foodItem=="Flax Seeds"){
 itemPrice=30.90; return itemPrice;}
  else if(foodItem=="Chia Seeds "){
 itemPrice=39.98;return itemPrice;}
  else if(foodItem=="Organic Cashews"){
 itemPrice=15.00;  return itemPrice;}
  else if(foodItem=="Toffee"){
 itemPrice=67.34;  return itemPrice;}
  else if(foodItem=="Lollipops"){
 itemPrice=854.09; return itemPrice; }
  else if(foodItem=="Caramel Candies"){
 itemPrice=20.98; return itemPrice;}
  else if(foodItem=="Gummy Bears"){
 itemPrice=789.09;  return itemPrice;}
  else if(foodItem=="Chocolate Spread"){
 itemPrice=569.00;  return itemPrice;}
  else if(foodItem=="Chocolate Truffles "){
 itemPrice=349.78; return itemPrice;}
  else if(foodItem=="White Chocolate Bar"){
 itemPrice=465.98; return itemPrice;}
  else if(foodItem=="Canned Tuna"){
 itemPrice=43.90; return itemPrice; }
  else if(foodItem=="Cod Fillet"){
 itemPrice=345.09; return itemPrice;} 
  else if(foodItem=="Mackerel"){
 itemPrice=598.90; return itemPrice; }
  else if(foodItem=="Sardines"){
 itemPrice=1323.98; return itemPrice;}
  else if(foodItem=="Squid"){
 itemPrice=345.99; return itemPrice;} 
  else if(foodItem=="Lobster"){
 itemPrice=7564.09; return itemPrice;}  
  else if(foodItem=="Crab Meat"){
 itemPrice=3452.98; return itemPrice;	}
  else if(foodItem=="Prawns"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Turkey Breast"){
 itemPrice=563.98; return itemPrice;}
  else if(foodItem=="Lamb Chops"){
 itemPrice=345.98; return itemPrice; }
  else if(foodItem=="Pork Chops"){
 itemPrice=23.98; return itemPrice;}
  else if(foodItem=="Ground Beef"){
 itemPrice=345.98; return itemPrice;}
  else if(foodItem=="Beef Steak"){
 itemPrice=3489.45; return itemPrice;}  
  else if(foodItem=="Chicken Mince"){
 itemPrice=789.00; return itemPrice; 	}
  else if(foodItem=="Chicken Sausages "){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Chicken Wings"){
 itemPrice=14; return itemPrice;}  
  else if(foodItem=="Bagels"){
 itemPrice=678.90; return itemPrice; }
  else if(foodItem=="Cake"){
 itemPrice=987.90; return itemPrice;}
  else if(foodItem=="Brownies"){
 itemPrice=198.00; return itemPrice;}
  else if(foodItem=="Doughnuts"){
 itemPrice=876.99; return itemPrice;}
  else if(foodItem=="Muffins"){
 itemPrice=563.09; return itemPrice;}	
  else if(foodItem=="Croissant"){
 itemPrice=12.00; return itemPrice;}
  else if(foodItem=="Baguette"){
 itemPrice=87.00; return itemPrice;} 
  else if(foodItem=="Multigrain Bread"){
 itemPrice=65.00; return itemPrice;} 
  else if(foodItem=="Soy Sauce"){
 itemPrice=67.90; return itemPrice;}
  else if(foodItem=="Mayonnaise"){
 itemPrice=1200.00; return itemPrice;}
  else{
  System.out.println(foodItem+"is not found");}
  return itemPrice;
 } 
}