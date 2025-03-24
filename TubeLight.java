class TubeLight {
int tubeLength; 
int tubePower; 
String tubeColor;
	
TubeLight() {
System.out.println("TubeLight Zero constructor is invoked");
}
TubeLight(int length, int power, String color) {
System.out.println("TubeLight para constructor is invoked");
	this.tubeLength = tubeLength;
	this.tubePower = tubePower;
	this.tubeColor = tubeColor;
    }
}


