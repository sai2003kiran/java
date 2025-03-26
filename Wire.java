class Wire {
    String material;
    double length;
    float diameter;
    boolean isInsulated;
    int voltageRating;
    char grade;

    // Zero-parameter constructor
    Wire() {
        this("Copper");
        System.out.println("wire zero constructor is invoked");
    }

    Wire(String material) {
        this(10.5);
        this.material = material;
        System.out.println("wire para constructor with 1String is invoked");
    }

    Wire(double length) {
        this(1.5f);
        this.length = length;
        System.out.println("wire para constructor with 2 parameters is invoked");
    }

    Wire(float diameter) {
        this(true);
        this.diameter = diameter;
        System.out.println("wire para constructor with 3 parameters is invoked");
    }

    Wire(boolean isInsulated) {
        this(220);
        this.isInsulated = isInsulated;
        System.out.println("wire para constructor with 4 parameters is invoked");
    }

    Wire(int voltageRating) {
        this('A');
        this.voltageRating = voltageRating;
        System.out.println("wire para constructor with 5 parameters is invoked");
    }

    Wire(char grade) {
        this.grade = grade;
        System.out.println("wire para constructor with all parameters is invoked");
    }

    public void fetchDetails() {
        System.out.println("Material: " + this.material);
        System.out.println("Length: " + this.length + " meters");
        System.out.println("Diameter: " + this.diameter + " mm");
        System.out.println("Insulated: " + (this.isInsulated ? "Yes" : "No"));
        System.out.println("Voltage Rating: " + this.voltageRating + " volts");
        System.out.println("Grade: " + this.grade);
        System.out.println("wire All 7 constructors are executed");
    }
}


