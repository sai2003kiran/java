class MSmart{
	 static String utensiles[] = {"Cuttingboard","Woodenspoon","Measuringcups","Bakingsheet","Chef's_knife","Mortar","pestle","gelato","Saladtongs","LemonSqueezer","Oilbottle"};
     static String biscuilts[] = {"Bakery","Marie","britannia","Digestive","Oreo","Priyagold","McVitie","Cream","Salted","Parle-G","Sunfeast"};
     static String perfumes[]={"Chanel","GiorgioArmani","TomFord","Burberry","Hugo","Gucci","SaintLaurent","Dior","DolceGabbana","JoMaloneLondon","DaviDoff"};
     static String vegetables[] = {"carrot","broccoli","spinach","tomato","potato","Onion","Cucumber","pappaya","Cauliflower","Eggplant"}; 
     static String groceries[] = {"DairyProduct","Snacks","cereal","FrozenFoods","Rice","Oats","Beverages","Fish","Condiment","Soups"}; 

 public static void main(String superMarket[]){
  System.out.println("Started main method");
  getDetail();
  System.out.println("total no of groceries added "+groceries.length);
  System.out.println("total no of vegetables added "+vegetables.length);
  System.out.println("total no of perfumes added "+perfumes.length);
  System.out.println("total no of biscuilts added "+biscuilts.length);
  System.out.println("total no of utensile added "+utensiles.length);
  System.out.println("ended main method");
  }
  public static void getDetail(){
	  System.out.println("inside the Start of getDetail()");
  for (String grocerie  :groceries){
    System.out.println(grocerie);
  }
  for (String vegetable:vegetables){
    System.out.println(vegetable);
  }
  for (String perfume:perfumes){
    System.out.println(perfume);
  }
  for (String biscuilt :biscuilts){
    System.out.println(biscuilt);
  }
  for (String utensile:utensiles){
    System.out.println(utensile);
  }
   System.out.println("end of getDetail()");
 }
}