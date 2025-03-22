class Zomato{
 public static double takeOrder(String foodItem){
  double itemPrice = 0.0;
  if(foodItem=="Red Lentils"){
 itemPrice=320.00; return itemPrice;}
  else if(foodItem=="Sunflower Oil"){
 itemPrice=4556.09; return itemPrice;}
  else if(foodItem=="Whole Milk"){
 itemPrice=345.99; return itemPrice; }
  else if(foodItem=="Potato Chips"){
 itemPrice=54.98;  return itemPrice;}
  else if(foodItem=="Apples juice"){
 itemPrice=30.90; return itemPrice;}
  else if(foodItem=="Tomatoes"){
 itemPrice=39.98;return itemPrice;}
  else if(foodItem=="Green Tea"){
 itemPrice=15.00;  return itemPrice;}
  else if(foodItem=="Frozen Peas"){
 itemPrice=67.34;  return itemPrice;}
  else if(foodItem=="Black Pepper"){
 itemPrice=854.09; return itemPrice; }
  else if(foodItem=="White Bread"){
 itemPrice=20.98; return itemPrice;}
  else if(foodItem=="Chicken Breast"){
 itemPrice=789.09;  return itemPrice;}
  else if(foodItem=="Salmon Fillet"){
 itemPrice=569.00;  return itemPrice;}
  else if(foodItem=="Milk Chocolate Bar"){
 itemPrice=349.78; return itemPrice;}
  else if(foodItem=="Organic Almonds"){
 itemPrice=465.98; return itemPrice;}
  else if(foodItem=="Canned Tomatoes"){
 itemPrice=43.90; return itemPrice; }
  else if(foodItem=="Hummus"){
 itemPrice=345.09; return itemPrice;} 
  else if(foodItem=="Baby Cereal"){
 itemPrice=598.90; return itemPrice; }
  else if(foodItem=="Sushi Rice"){
 itemPrice=1323.98; return itemPrice;}
  else if(foodItem=="Pancake Mix"){
 itemPrice=345.99; return itemPrice;} 
  else if(foodItem=="Red Wine"){
 itemPrice=7564.09; return itemPrice;}  
  else if(foodItem=="Truffle Oil"){
 itemPrice=3452.98; return itemPrice;	}
  else if(foodItem=="Vegan Meat Substitute"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Tiramisu"){
 itemPrice=563.98; return itemPrice;}
  else if(foodItem=="Spaghetti"){
 itemPrice=345.98; return itemPrice; }
  else if(foodItem=="Cashews"){
 itemPrice=23.98; return itemPrice;}
  else if(foodItem=="Spirulina Powder"){
 itemPrice=345.98; return itemPrice;}
  else if(foodItem=="Hoisin Sauce"){
 itemPrice=3489.45; return itemPrice;}  
  else if(foodItem=="Corn Flakes"){
 itemPrice=789.00; return itemPrice; 	}
  else if(foodItem=="Vegan Jerky"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Black Tea"){
 itemPrice=14; return itemPrice;}  
  else if(foodItem=="Chickpeas"){
 itemPrice=678.90; return itemPrice; }
  else if(foodItem=="chitrana rice"){
 itemPrice=987.90; return itemPrice;}
  else if(foodItem=="kabab"){
 itemPrice=198.00; return itemPrice;}
  else if(foodItem=="Olive Oil"){
 itemPrice=876.99; return itemPrice;}
  else if(foodItem=="Skim Milk"){
 itemPrice=563.09; return itemPrice;}	
  else if(foodItem=="Nachos"){
 itemPrice=12.00; return itemPrice;}
  else if(foodItem=="Bananas juice"){
 itemPrice=87.00; return itemPrice;} 
  else if(foodItem=="Onions"){
 itemPrice=65.00; return itemPrice;} 
  else if(foodItem=="Black Tea"){
 itemPrice=67.90; return itemPrice;}
  else if(foodItem=="Basmati Rice"){
 itemPrice=1200.00; return itemPrice;}
  else{
  System.out.println(foodItem+"is not found");}
  return itemPrice;
 } 
 
 public static double takeOrder(String foodItem,int quantity){
  double itemPrice = 0.0;
  if(foodItem=="Red Lentils"){
 itemPrice=320.00*quantity; return itemPrice;}
  else if(foodItem=="Sunflower Oil"){
 itemPrice=4556.09*quantity; return itemPrice;}
  else if(foodItem=="Whole Milk"){
 itemPrice=345.99*quantity; return itemPrice; }
  else if(foodItem=="Potato Chips"){
 itemPrice=54.98*quantity;  return itemPrice;}
  else if(foodItem=="Apples juice"){
 itemPrice=30.90*quantity; return itemPrice;}
  else if(foodItem=="Tomatoes"){
 itemPrice=39.98*quantity;return itemPrice;}
  else if(foodItem=="Green Tea"){
 itemPrice=15.00*quantity;  return itemPrice;}
  else if(foodItem=="Frozen Peas"){
 itemPrice=67.34*quantity;  return itemPrice;}
  else if(foodItem=="Black Pepper"){
 itemPrice=854.09*quantity; return itemPrice; }
  else if(foodItem=="White Bread"){
 itemPrice=20.98*quantity; return itemPrice;}
  else if(foodItem=="Chicken Breast"){
 itemPrice=789.09*quantity;  return itemPrice;}
  else if(foodItem=="Salmon Fillet"){
 itemPrice=569.00*quantity;  return itemPrice;}
  else if(foodItem=="Milk Chocolate Bar"){
 itemPrice=349.78*quantity; return itemPrice;}
  else if(foodItem=="Organic Almonds"){
 itemPrice=465.98*quantity; return itemPrice;}
  else if(foodItem=="Canned Tomatoes"){
 itemPrice=43.90*quantity; return itemPrice; }
  else if(foodItem=="Hummus"){
 itemPrice=345.09*quantity; return itemPrice;} 
  else if(foodItem=="Baby Cereal"){
 itemPrice=598.90*quantity; return itemPrice; }
  else if(foodItem=="Sushi Rice"){
 itemPrice=1323.98*quantity; return itemPrice;}
  else if(foodItem=="Pancake Mix"){
 itemPrice=345.99*quantity; return itemPrice;} 
  else if(foodItem=="Red Wine"){
 itemPrice=7564.09*quantity; return itemPrice;}  
  else if(foodItem=="Truffle Oil"){
 itemPrice=3452.98*quantity; return itemPrice;	}
  else if(foodItem=="Vegan Meat Substitute"){
 itemPrice=234.98*quantity; return itemPrice;}
  else if(foodItem=="Tiramisu"){
 itemPrice=563.98*quantity; return itemPrice;}
  else if(foodItem=="Spaghetti"){
 itemPrice=345.98*quantity; return itemPrice; }
  else if(foodItem=="Cashews"){
 itemPrice=23.98*quantity; return itemPrice;}
  else if(foodItem=="Spirulina Powder"){
 itemPrice=345.98*quantity; return itemPrice;}
  else if(foodItem=="Hoisin Sauce"){
 itemPrice=3489.45*quantity; return itemPrice;}  
  else if(foodItem=="Corn Flakes"){
 itemPrice=789.00*quantity; return itemPrice; 	}
  else if(foodItem=="Vegan Jerky"){
 itemPrice=234.98*quantity; return itemPrice;}
  else if(foodItem=="Black Tea"){
 itemPrice=14*quantity; return itemPrice;}  
  else if(foodItem=="Chickpeas"){
 itemPrice=678.90*quantity; return itemPrice; }
  else if(foodItem=="chitrana rice"){
 itemPrice=987.90*quantity; return itemPrice;}
  else if(foodItem=="kabab"){
 itemPrice=198.00*quantity*quantity; return itemPrice;}
  else if(foodItem=="Olive Oil"){
 itemPrice=876.99*quantity; return itemPrice;}
  else if(foodItem=="Skim Milk"){
 itemPrice=563.09*quantity; return itemPrice;}	
  else if(foodItem=="Nachos"){
 itemPrice=12.00*quantity; return itemPrice;}
  else if(foodItem=="Bananas juice"){
 itemPrice=87.00*quantity; return itemPrice;} 
  else if(foodItem=="Onions"){
 itemPrice=65.00*quantity; return itemPrice;} 
  else if(foodItem=="Black Tea"){
 itemPrice=67.90*quantity; return itemPrice;}
  else if(foodItem=="Basmati Rice"){
 itemPrice=1200.00*quantity; return itemPrice;}
  else{
  System.out.println(foodItem+"is not found");}
  return itemPrice;
 } 
}