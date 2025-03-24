class TubeLightRunner {
public static void main(String output[]) {
TubeLight philips = new TubeLight();
philips.tubeLength = 48;
philips.tubePower = 18;
philips.tubeColor = "Cool White";
System.out.println("The Philips tubeLength is: " + philips.tubeLength + " inches");
System.out.println("The Philips tubePower is: " + philips.tubePower + " watts");
System.out.println("The Philips tubeColor is: " + philips.tubeColor);
System.out.println("*****<><><><><>*****");

TubeLight syska = new TubeLight(36, 20, "Warm White");
System.out.println("The Syska tubeLength is: " + syska.tubeLength + " inches");
System.out.println("The Syska tubePower is: " + syska.tubePower + " watts");
System.out.println("The Syska tubeColor is: " + syska.tubeColor);
System.out.println("*****<><><><><>*****");

TubeLight havells = new TubeLight();
havells.tubeLength = 60;
havells.tubePower = 22;
havells.tubeColor = "Daylight";
System.out.println("The Havells tubeLength is: " + havells.tubeLength + " inches");
System.out.println("The Havells tubePower is: " + havells.tubePower + " watts");
System.out.println("The Havells tubeColor is: " + havells.tubeColor);
System.out.println("*****<><><><><>*****");

TubeLight crompton = new TubeLight(42, 16, "Natural White");
System.out.println("The Crompton tubeLength is: " + crompton.tubeLength + " inches");
System.out.println("The Crompton tubePower is: " + crompton.tubePower + " watts");
System.out.println("The Crompton tubeColor is: " + crompton.tubeColor);
System.out.println("*****<><><><><>*****");

TubeLight orient = new TubeLight();
orient.tubeLength = 48;
orient.tubePower = 24;
orient.tubeColor = "Bright White";
System.out.println("The Orient tubeLength is: " + orient.tubeLength + " inches");
System.out.println("The Orient tubePower is: " + orient.tubePower + " watts");
System.out.println("The Orient tubeColor is: " + orient.tubeColor);
System.out.println("*****<><><><><>*****");

TubeLight bajaj = new TubeLight(30, 12, "Soft White");
System.out.println("The Bajaj tubeLength is: " + bajaj.tubeLength + " inches");
System.out.println("The Bajaj tubePower is: " + bajaj.tubePower + " watts");
System.out.println("The Bajaj tubeColor is: " + bajaj.tubeColor);
System.out.println("*****<><><><><>*****");

TubeLight eveready = new TubeLight();
eveready.tubeLength = 36;
eveready.tubePower = 15;
eveready.tubeColor = "Golden White";
System.out.println("The Eveready tubeLength is: " + eveready.tubeLength + " inches");
System.out.println("The Eveready tubePower is: " + eveready.tubePower + " watts");
System.out.println("The Eveready tubeColor is: " + eveready.tubeColor);
System.out.println("*****<><><><><>*****");

TubeLight wipro = new TubeLight(48, 18, "Neutral White");
System.out.println("The Wipro tubeLength is: " + wipro.tubeLength + " inches");
System.out.println("The Wipro tubePower is: " + wipro.tubePower + " watts");
System.out.println("The Wipro tubeColor is: " + wipro.tubeColor);
System.out.println("*****<><><><><>*****");
    }
}