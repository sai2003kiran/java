class Dominos{
 public static double takeOrder(String foodItem){
  double itemPrice = 0.0;
  if(foodItem=="Exotic Mushroom Mix"){
 itemPrice=320.00; return itemPrice;}
  else if(foodItem=="Edible Gold Flakes"){
 itemPrice=4556.09; return itemPrice;}
  else if(foodItem=="Dark Chocolate Covered Almonds"){
 itemPrice=345.99; return itemPrice; }
  else if(foodItem=="Specialty Cold Brew"){
 itemPrice=54.98;  return itemPrice;}
  else if(foodItem=="Organic Kombucha "){
 itemPrice=30.90; return itemPrice;}
  else if(foodItem=="Bran Flakes"){
 itemPrice=39.98;return itemPrice;}
  else if(foodItem=="Jam"){
 itemPrice=15.00;  return itemPrice;}
  else if(foodItem=="Peanut Butter with Honey"){
 itemPrice=67.34;  return itemPrice;}
  else if(foodItem=="Muesli with Fruits"){
 itemPrice=854.09; return itemPrice; }
  else if(foodItem=="Nutella"){
 itemPrice=20.98; return itemPrice;}
  else if(foodItem=="Black Bean Sauce"){
 itemPrice=789.09;  return itemPrice;}
  else if(foodItem=="Tahini"){
 itemPrice=569.00;  return itemPrice;}
  else if(foodItem=="Wasabi Paste"){
 itemPrice=349.78; return itemPrice;}
  else if(foodItem=="Gochujang"){
 itemPrice=465.98; return itemPrice;}
  else if(foodItem=="Harissa Paste "){
 itemPrice=43.90; return itemPrice; }
  else if(foodItem=="Teriyaki Sauce"){
 itemPrice=345.09; return itemPrice;} 
  else if(foodItem=="Thai Red Curry Paste"){
 itemPrice=598.90; return itemPrice; }
  else if(foodItem=="Apple Cider Vinegar"){
 itemPrice=1323.98; return itemPrice;}
  else if(foodItem=="Maca Powder"){
 itemPrice=345.99; return itemPrice;} 
  else if(foodItem=="Moringa Powder"){
 itemPrice=7564.09; return itemPrice;}  
  else if(foodItem=="Ashwagandha Powder"){
 itemPrice=3452.98; return itemPrice;	}
  else if(foodItem=="Collagen Powder"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Oyster Sauce"){
 itemPrice=563.98; return itemPrice;}
  else if(foodItem=="Protein Powder"){
 itemPrice=345.98; return itemPrice; }
  else if(foodItem=="Matcha Powder"){
 itemPrice=23.98; return itemPrice;}
  else if(foodItem=="Figs"){
 itemPrice=345.98; return itemPrice;}
  else if(foodItem=="Prunes"){
 itemPrice=3489.45; return itemPrice;}  
  else if(foodItem=="Corn Flakes"){
 itemPrice=789.00; return itemPrice; 	}
  else if(foodItem=="Raisins"){
 itemPrice=234.98; return itemPrice;}
  else if(foodItem=="Dried Apricots"){
 itemPrice=14; return itemPrice;}  
  else if(foodItem=="Chickpeas"){
 itemPrice=678.90; return itemPrice; }
  else if(foodItem=="Dates"){
 itemPrice=987.90; return itemPrice;}
  else if(foodItem=="Hazelnuts"){
 itemPrice=198.00; return itemPrice;}
  else if(foodItem=="Pistachios"){
 itemPrice=876.99; return itemPrice;}
  else if(foodItem=="Egg Noodles "){
 itemPrice=563.09; return itemPrice;}	
  else if(foodItem=="Vermicelli"){
 itemPrice=12.00; return itemPrice;}
  else if(foodItem=="Soba Noodles"){
 itemPrice=87.00; return itemPrice;} 
  else if(foodItem=="Udon Noodles"){
 itemPrice=65.00; return itemPrice;} 
  else if(foodItem=="Rice Noodles"){
 itemPrice=67.90; return itemPrice;}
  else if(foodItem=="Ramen Noodles"){
 itemPrice=1200.00; return itemPrice;}
  else{
  System.out.println(foodItem+"is not found");}
  return itemPrice;
 } 
}