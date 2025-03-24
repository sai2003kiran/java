class ShampooRunner{
public static void main(String output[]){
 Shampoo beauty_Cave = new Shampoo();
 beauty_Cave.shampooType="Sulfate-FreeShampoo";
 beauty_Cave.shampooVol=1000;
 beauty_Cave.shampooStock=1234;
 System.out.println("the beauty_Cave shampooType is: "+beauty_Cave.shampooType);
 System.out.println("the beauty_Cave shampooVol is: "+beauty_Cave.shampooVol);
 System.out.println("the beauty_Cave shampooStock is: "+beauty_Cave.shampooStock);
 System.out.println("*****<><><><><>*****");
 Shampoo mamaearth = new Shampoo("Normal Hair Shampoo",250,15);
 System.out.println("the mamaearth shampooType is: "+mamaearth.shampooType);
 System.out.println("the mamaearth shampooVol is: "+mamaearth.shampooVol);
 System.out.println("the mamaearth shampooStock is: "+mamaearth.shampooStock);
 System.out.println("*****<><><><><>*****");
 Shampoo lorealParis  = new Shampoo();
 lorealParis.shampooType="CurlyHairShampoo";
 lorealParis.shampooVol=750;
 lorealParis.shampooStock=1454;
 System.out.println("the lorealParis shampooType is: "+lorealParis.shampooType);
 System.out.println("the lorealParis shampooVol is: "+lorealParis.shampooVol);
 System.out.println("the lorealParis shampooStock is: "+lorealParis.shampooStock);
 System.out.println("*****<><><><><>*****");
 Shampoo biotiqueAyurveda = new Shampoo("Herbal ShampooDry",500,12);
 System.out.println("the biotiqueAyurveda shampooType is: "+biotiqueAyurveda.shampooType);
 System.out.println("the biotiqueAyurveda shampooVol is: "+biotiqueAyurveda.shampooVol);
 System.out.println("the biotiqueAyurveda shampooStock is: "+biotiqueAyurveda.shampooStock);
 System.out.println("*****<><><><><>*****");
 Shampoo VLCC = new Shampoo();
 VLCC.shampooType="Anti-Dandruff Shampoo";
 VLCC.shampooVol=500;
 VLCC.shampooStock=345;
 System.out.println("the VLCC shampooType is: "+VLCC.shampooType);
 System.out.println("the VLCC shampooVol is: "+VLCC.shampooVol);
 System.out.println("the VLCC shampooStock is: "+VLCC.shampooStock);
 System.out.println("*****<><><><><>*****");
 Shampoo tresemme = new Shampoo("Color-Protecting Shampoo",750,10);
 System.out.println("the tresemme shampooType is: "+tresemme.shampooType);
 System.out.println("the tresemme shampooVol is: "+tresemme.shampooVol);
 System.out.println("the tresemme shampooStock is: "+tresemme.shampooStock);
 System.out.println("*****<><><><><>*****");
 Shampoo dove = new Shampoo();
 dove.shampooType="Volumizing Shampoo";
 dove.shampooVol=250;
 dove.shampooStock=98;
 System.out.println("the dove shampooType is: "+dove.shampooType);
 System.out.println("the dove shampooVol is: "+dove.shampooVol);
 System.out.println("the dove shampooStock is: "+dove.shampooStock);
 System.out.println("*****<><><><><>*****");
 Shampoo headAndShoulders = new Shampoo("Protein-Infused Shampoo",1000,62);
 System.out.println("the headAndShoulders shampooType is: "+headAndShoulders.shampooType);
 System.out.println("the headAndShoulders shampooVol is: "+headAndShoulders.shampooVol);
 System.out.println("the headAndShoulders shampooStock is: "+headAndShoulders.shampooStock);
 System.out.println("*****<><><><><>*****");
 
}
}