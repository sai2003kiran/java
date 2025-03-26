class Paper{
String paperSize;
String paperColour;
String paperFinish;
int paperWeigth;
String paperBrand;
String paperFeature;

Paper(){
this("A4Paper");
System.out.println("paper zero constructor is invoked");
}

Paper(String paperSize){
this("A4Paper","Yellow");
this.paperSize=paperSize;
System.out.println("paper para constructor with 1String is invoked");
}

Paper(String paperSize,String paperColour){
this("A4Paper","Yellow","Smooth");
this.paperSize=paperSize;
this.paperColour=paperColour;
System.out.println("paper para constructor with 2String is invoked");
}

Paper(String paperSize,String paperColour,String paperFinish){
this("A4Paper","Yellow","Smooth","JK paper");
this.paperSize=paperSize;
this.paperColour=paperColour;
this.paperFinish=paperFinish;
System.out.println("paper para constructor with 3String is invoked");
}

Paper(String paperSize,String paperColour,String paperFinish,String paperBrand){
this("A4Paper","Yellow","Smooth","JK paper","Recyclable");
this.paperSize=paperSize;
this.paperColour=paperColour;
this.paperFinish=paperFinish;
this.paperBrand=paperBrand;
System.out.println("paper para constructor with 4String is invoked");
}

Paper(String paperSize,String paperColour,String paperFinish,String paperBrand,String paperFeature){
this(5);
this.paperSize=paperSize;
this.paperColour=paperColour;
this.paperFinish=paperFinish;
this.paperBrand=paperBrand;
this.paperFeature=paperFeature;
System.out.println("paper para constructor with 5Strings is invoked");
}

Paper(int paperWeigth){
this.paperWeigth=paperWeigth;
System.out.println("paper para constructor with int is invoked");
}

public void fetchDetails(){
System.out.println("the paperSize is:"+this.paperSize);
System.out.println("the paperColour is:"+this.paperColour);
System.out.println("the paperFinish is:"+this.paperFinish);
System.out.println("the paperWeigth is:"+this.paperWeigth);
System.out.println("the paperBrand is:"+this.paperBrand);
System.out.println("the paperFeature is:"+this.paperFeature);
System.out.println("the paper All 7 constructor is executed"); 
}

}