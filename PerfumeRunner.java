class PerfumeRunner {
public static void main(String output[]) {
Perfume chanel = new Perfume();
chanel.perfumeName = "Chanel No. 5";
chanel.perfumeFragrance = "Floral";
chanel.perfumeLongevity = 10;
System.out.println("The Chanel No. 5 perfumeName is: " + chanel.perfumeName);
System.out.println("The Chanel No. 5 perfumeFragrance is: " + chanel.perfumeFragrance);
System.out.println("The Chanel No. 5 perfumeLongevity is: " + chanel.perfumeLongevity + " hours");
System.out.println("*****<><><><><>*****");

Perfume dior = new Perfume("Dior Sauvage", "Woody", 8);
System.out.println("The Dior Sauvage perfumeName is: " + dior.perfumeName);
System.out.println("The Dior Sauvage perfumeFragrance is: " + dior.perfumeFragrance);
System.out.println("The Dior Sauvage perfumeLongevity is: " + dior.perfumeLongevity + " hours");
System.out.println("*****<><><><><>*****");

Perfume versace = new Perfume();
versace.perfumeName = "Versace Eros";
versace.perfumeFragrance = "Citrus";
versace.perfumeLongevity = 6;
System.out.println("The Versace Eros perfumeName is: " + versace.perfumeName);
System.out.println("The Versace Eros perfumeFragrance is: " + versace.perfumeFragrance);
System.out.println("The Versace Eros perfumeLongevity is: " + versace.perfumeLongevity + " hours");
System.out.println("*****<><><><><>*****");

Perfume bvlgariMan = new Perfume("Bvlgari Man.98", "Woody Citrus", 12);
System.out.println("The Bvlgari Man perfumeName is: " + bvlgariMan.perfumeName);
System.out.println("The Bvlgari Man perfumeFragrance is: " + bvlgariMan.perfumeFragrance);
System.out.println("The Bvlgari Man perfumeLongevity is: " + bvlgariMan.perfumeLongevity + " hours");
System.out.println("*****<><><><><>*****");

Perfume tomFord = new Perfume();
tomFord.perfumeName = "Tom Ford Black Orchid";
tomFord.perfumeFragrance = "Oriental Floral";
tomFord.perfumeLongevity = 14;
System.out.println("The Tom Ford perfumeName is: " + tomFord.perfumeName);
System.out.println("The Tom Ford perfumeFragrance is: " + tomFord.perfumeFragrance);
System.out.println("The Tom Ford perfumeLongevity is: " + tomFord.perfumeLongevity + " hours");
System.out.println("*****<><><><><>*****");

Perfume gucci = new Perfume("Gucci Bloom", "Floral", 9);
System.out.println("The Gucci Bloom perfumeName is: " + gucci.perfumeName);
System.out.println("The Gucci Bloom perfumeFragrance is: " + gucci.perfumeFragrance);
System.out.println("The Gucci Bloom perfumeLongevity is: " + gucci.perfumeLongevity + " hours");
System.out.println("*****<><><><><>*****");

Perfume calvinKlein = new Perfume();
calvinKlein.perfumeName = "Calvin Klein Euphoria";
calvinKlein.perfumeFragrance = "Fruity Floral";
calvinKlein.perfumeLongevity = 7;
System.out.println("The Calvin Klein perfumeName is: " + calvinKlein.perfumeName);
System.out.println("The Calvin Klein perfumeFragrance is: " + calvinKlein.perfumeFragrance);
System.out.println("The Calvin Klein perfumeLongevity is: " + calvinKlein.perfumeLongevity + " hours");
System.out.println("*****<><><><><>*****");

Perfume armaniCode = new Perfume("Armani Code", "Spicy Oriental", 11);
System.out.println("The Armani Code perfumeName is: " + armaniCode.perfumeName);
System.out.println("The Armani Code perfumeFragrance is: " + armaniCode.perfumeFragrance);
System.out.println("The Armani Code perfumeLongevity is: " + armaniCode.perfumeLongevity + " hours");
System.out.println("*****<><><><><>*****");
}
}
