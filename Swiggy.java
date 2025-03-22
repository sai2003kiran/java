class Swiggy{
 public static double takeOrder(String foodItem){
  double itemPrice = 0.0;
  if(foodItem=="Green Lentils")
    itemPrice=320.00;
  else if(foodItem=="Brown Rice")
    itemPrice=4556.09;
  else if(foodItem=="Olive Oil")
    itemPrice=345.99;  
  else if(foodItem=="Skim Milk")
    itemPrice=54.98;  
  else if(foodItem=="Popcorn")
    itemPrice=30.90;  
  else if(foodItem=="Grapes")
    itemPrice=39.98;
  else if(foodItem=="Green Tea")
    itemPrice=15.00;  
  else if(foodItem=="Potatoes")
    itemPrice=67.34;  
  else if(foodItem=="Coffee Beans ")
    itemPrice=854.09;  
  else if(foodItem=="Frozen Mixed Vegetables")
    itemPrice=20.98;
  else if(foodItem=="Cumin Powder")
    itemPrice=789.09;  
  else if(foodItem=="Whole Wheat Bread")
    itemPrice=569.00;  
  else if(foodItem=="Whole Chicken ")
    itemPrice=349.78; 
  else if(foodItem=="Tuna Steaks")
    itemPrice=465.98;
  else if(foodItem=="Dark Chocolate Bar")
    itemPrice=43.90;  
  else if(foodItem=="Organic Walnuts")
    itemPrice=345.09;  
  else if(foodItem=="Canned Beans")
    itemPrice=598.90;  
  else if(foodItem=="Instant Soup")
    itemPrice=1323.98;
  else if(foodItem=="Guacamole")
    itemPrice=345.99;  
  else if(foodItem=="Red Wine")
    itemPrice=7564.09;  
  else if(foodItem=="Fruit Puree ")
    itemPrice=3452.98; 	
  else if(foodItem=="Nori Sheets")
    itemPrice=234.98;
  else if(foodItem=="Maple Syrup")
    itemPrice=563.98;  
  else if(foodItem=="White Wine")
    itemPrice=345.98;  
  else if(foodItem=="Caviar")
    itemPrice=23.98;
  else if(foodItem=="Vegan Cheese ")
    itemPrice=345.98;
  else if(foodItem=="Cheesecake")
    itemPrice=3489.45;  
  else if(foodItem=="Cheesecake")
    itemPrice=789.00; 	
  else if(foodItem=="Almonds")
    itemPrice=234.98;
  else if(foodItem=="Wheatgrass Powder")
    itemPrice=14;  
  else if(foodItem=="Fish Sauce")
    itemPrice=678.90;  
  else if(foodItem=="Hoisin Sauce")
    itemPrice=987.90;
  else if(foodItem=="Chocolate Cereal")
    itemPrice=198.00;
  else if(foodItem=="Artisanal Cheese Platter")
    itemPrice=876.99;  
  else if(foodItem=="Japanese Matcha Kit")
    itemPrice=563.09; 	
  else if(foodItem=="Nachos")
    itemPrice=12.00;
  else if(foodItem=="Almond Butter")
    itemPrice=87.00;  
  else if(foodItem=="Organic Sourdough Bread")
    itemPrice=65.00;  
  else if(foodItem=="Honeycomb")
    itemPrice=67.90;
  else if(foodItem=="Sugar-Free Maple Syrup")
    itemPrice=1200.00;
  else
    System.out.println(foodItem+"is not found");
  return itemPrice;
 } 
 
  public static double takeOrder(String foodItem,int quantity){
  double itemPrice = 0.0;
  if(foodItem=="Green Lentils")
    itemPrice=320.00*quantity;
  else if(foodItem=="Brown Rice")
    itemPrice=4556.09*quantity;
  else if(foodItem=="Olive Oil")
    itemPrice=345.99*quantity;  
  else if(foodItem=="Skim Milk")
    itemPrice=54.98*quantity;  
  else if(foodItem=="Popcorn")
    itemPrice=30.90*quantity;  
  else if(foodItem=="Grapes")
    itemPrice=39.98*quantity;
  else if(foodItem=="Green Tea")
    itemPrice=15.00*quantity;  
  else if(foodItem=="Potatoes")
    itemPrice=67.34*quantity;  
  else if(foodItem=="Coffee Beans ")
    itemPrice=854.09*quantity;  
  else if(foodItem=="Frozen Mixed Vegetables")
    itemPrice=20.98*quantity;
  else if(foodItem=="Cumin Powder")
    itemPrice=789.09*quantity;  
  else if(foodItem=="Whole Wheat Bread")
    itemPrice=569.00*quantity;  
  else if(foodItem=="Whole Chicken ")
    itemPrice=349.78*quantity; 
  else if(foodItem=="Tuna Steaks")
    itemPrice=465.98*quantity;
  else if(foodItem=="Dark Chocolate Bar")
    itemPrice=43.90*quantity;  
  else if(foodItem=="Organic Walnuts")
    itemPrice=345.09*quantity;  
  else if(foodItem=="Canned Beans")
    itemPrice=598.90*quantity;  
  else if(foodItem=="Instant Soup")
    itemPrice=1323.98*quantity;
  else if(foodItem=="Guacamole")
    itemPrice=345.99*quantity;  
  else if(foodItem=="Red Wine")
    itemPrice=7564.09*quantity;  
  else if(foodItem=="Fruit Puree ")
    itemPrice=3452.98*quantity; 	
  else if(foodItem=="Nori Sheets")
    itemPrice=234.98*quantity;
  else if(foodItem=="Maple Syrup")
    itemPrice=563.98*quantity;  
  else if(foodItem=="White Wine")
    itemPrice=345.98*quantity;  
  else if(foodItem=="Caviar")
    itemPrice=23.98*quantity;
  else if(foodItem=="Vegan Cheese ")
    itemPrice=345.98*quantity;
  else if(foodItem=="Cheesecake")
    itemPrice=3489.45*quantity;  
  else if(foodItem=="Cheesecake")
    itemPrice=789.00*quantity; 	
  else if(foodItem=="Almonds")
    itemPrice=234.98*quantity;
  else if(foodItem=="Wheatgrass Powder")
    itemPrice=14.056*quantity;  
  else if(foodItem=="Fish Sauce")
    itemPrice=678.90*quantity;  
  else if(foodItem=="Hoisin Sauce")
    itemPrice=987.90*quantity;
  else if(foodItem=="Chocolate Cereal")
    itemPrice=198.00*quantity;
  else if(foodItem=="Artisanal Cheese Platter")
    itemPrice=876.99*quantity;  
  else if(foodItem=="Japanese Matcha Kit")
    itemPrice=563.09*quantity; 	
  else if(foodItem=="Nachos")
    itemPrice=12.00*quantity;
  else if(foodItem=="Almond Butter")
    itemPrice=87.00*quantity;  
  else if(foodItem=="Organic Sourdough Bread")
    itemPrice=65.00*quantity;  
  else if(foodItem=="Honeycomb")
    itemPrice=67.90*quantity;
  else if(foodItem=="Sugar-Free Maple Syrup")
    itemPrice=1200.00*quantity;
  else
    System.out.println(foodItem+"is not found");
  return itemPrice;
 }
 
}