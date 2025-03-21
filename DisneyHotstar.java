class DisneyHotstar{
 static String hindiSerials[]={"Mirapur","FamilyMan","SacredGames","DelhiCrime","paatalLOk","InsideEdge","Panchayat","Aarya","Specialops","Kota Factory"};
 static String kannadaSerials[]={"AmruthaVarshini","SriDeviMahatme","Malikappuram","LakshmiTiffinRoom","janakiSamsara","GaramMasala","jeevaHoovagide","Agnisakshi","Geethanjali","Sangharsha"};
 static String teluguSerials[]={"Brahmamudi","GuppedanthaManasu","NuvvuNenuPrema","EnnennoJanmalaBandham","IntintiRamayanam","NagaPanchami","Maguvaomaguva","Karthikadeepam","Subhodayam","KrishnaTulasi","scoop"};
 static String englishSerials[]={"Shogun","SpecialOps","OutofLove","Rudra:TheEdgeofDarkness","SchoolofLies","NaveLakshya","ishqkills","Aarya","BadCop","ChutneySambar"};
 public static void main(String ott[]){
	System.out.println("Starting the main method");
	gethotstar();
	System.out.println("the Total no of teluguSerials is:"+teluguSerials.length); 
	System.out.println("the Total no of kannadaSerials is:"+kannadaSerials.length);
	System.out.println("the Total no of englishSerials is:"+englishSerials.length);
	System.out.println("the Total no of HindiSerials is:"+hindiSerials.length);
	System.out.println("ending the main method");
 }
 public static void gethotstar(){
  System.out.println("start inside the gethotstar()");
  for(String hindiSerial:hindiSerials){
   System.out.println(hindiSerial);
  }
  for(String kannadaSerial:kannadaSerials){
   System.out.println(kannadaSerial);
  }
  for(String teluguSerial:teluguSerials){
   System.out.println(teluguSerial);
  }
  for(String englishSerial:englishSerials){
   System.out.println(englishSerial);
  }
  System.out.println("end inside the gethotstar()");

 }
}