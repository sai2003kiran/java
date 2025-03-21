class Zepto{
 public static double takeOrder(String foodItem){
  double itemPrice = 0.0;
  if(foodItem=="Canned Peaches"){
 itemPrice=320.00; return itemPrice;}
  else if(foodItem=="Canned Pineapple "){
 itemPrice=4556.09; return itemPrice;}
  else if(foodItem=="Pickles"){
 itemPrice=345.99; return itemPrice; }
  else if(foodItem=="Olives"){
 itemPrice=54.98;  return itemPrice;}
  else if(foodItem=="Peanut Butter"){
 itemPrice=30.90; return itemPrice;}
  else if(foodItem=="Hazelnut Spread"){
 itemPrice=39.98;return itemPrice;}
  else if(foodItem=="Instant Pasta"){
 itemPrice=15.00;  return itemPrice;}
  else if(foodItem=="Instant Mashed Potatoes"){
 itemPrice=67.34;  return itemPrice;}
  else if(foodItem=="Microwave Popcorn"){
 itemPrice=854.09; return itemPrice; }
  else if(foodItem=="Baby Cereal"){
 itemPrice=20.98; return itemPrice;}
  else if(foodItem=="Marshmallows"){
 itemPrice=789.09;  return itemPrice;}
  else if(foodItem=="Frozen Burritos "){
 itemPrice=569.00;  return itemPrice;}
  else if(foodItem=="Frozen Lasagna"){
 itemPrice=349.78; return itemPrice;}
  else if(foodItem=="Cup Noodles"){
 itemPrice=465.98; return itemPrice;}
  else if(foodItem=="Cereal Bars"){
 itemPrice=43.90; return itemPrice; }
  else if(foodItem=="Instant Rice"){
 itemPrice=345.09; return itemPrice;} 
  else if(foodItem=="Salsa "){
 itemPrice=598.90; return itemPrice; }
  else if(foodItem=="Pesto Sauce"){
 itemPrice=1323.98; return itemPrice;}
  else if(foodItem=="Mayonnaise"){
 itemPrice=345.99; return itemPrice;} 
  else if(foodItem=="Barbecue Sauce"){
 itemPrice=7564.09; return itemPrice;}  
  else if(foodItem=="Ranch Dressing"){
 itemPrice=3452.98; return itemPrice;	}
  else if(foodItem=="Mustard Sauce"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Cheese Spread"){
 itemPrice=563.98; return itemPrice;}
  else if(foodItem=="Honey Mustard"){
 itemPrice=345.98; return itemPrice; }
  else if(foodItem=="Toddler Meal Pouches"){
 itemPrice=23.98; return itemPrice;}
  else if(foodItem=="Organic Baby Food"){
 itemPrice=345.98; return itemPrice;}
  else if(foodItem=="Baby Juice"){
 itemPrice=3489.45; return itemPrice;}  
  else if(foodItem=="Baby Juice"){
 itemPrice=789.00; return itemPrice; 	}
  else if(foodItem=="Baby Yogurt"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Kimchi"){
 itemPrice=14; return itemPrice;}  
  else if(foodItem=="Miso Paste"){
 itemPrice=678.90; return itemPrice; }
  else if(foodItem=="Pad Thai Noodles "){
 itemPrice=987.90; return itemPrice;}
  else if(foodItem=="Thai Curry Paste"){
 itemPrice=198.00; return itemPrice;}
  else if(foodItem=="Sriracha Sauce"){
 itemPrice=876.99; return itemPrice;}
  else if(foodItem=="Taco Shells"){
 itemPrice=563.09; return itemPrice;}	
  else if(foodItem=="Italian Pasta Sauce"){
 itemPrice=12.00; return itemPrice;}
  else if(foodItem=="Granola"){
 itemPrice=87.00; return itemPrice;} 
  else if(foodItem=="Cereal"){
 itemPrice=65.00; return itemPrice;} 
  else if(foodItem=="Oatmeal"){
 itemPrice=67.90; return itemPrice;}
  else if(foodItem=="Honey"){
 itemPrice=1200.00; return itemPrice;}
  else{
  System.out.println(foodItem+"is not found");}
  return itemPrice;
 } 
}