class TubeLight {
int tubeLength; 
int tubePower; 
String tubeColor;
TubeLight() {
System.out.println("TubeLight Zero constructor is invoked");
}
TubeLight(int length, int power, String color) {
System.out.println("TubeLight para constructor is invoked");
	this.tubeLength = length;
	this.tubePower = power;
	this.tubeColor = color;
    }
}


