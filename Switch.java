class Switch {
    // Six instance variables
    int voltageRating; 
    double pricePerUnit;
    String type;
    String brand;
    String usage;
    boolean isOperational;

    // Constructor 1: Zero-parameter constructor
    Switch() {
        this("Toggle Switch"); // Calls Constructor 2
        System.out.println("Switch: Zero-parameter constructor invoked.");
    }

    // Constructor 2: One parameter
    Switch(String type) {
        this("Toggle Switch", "Philips"); // Calls Constructor 3
        this.type = type;
        System.out.println("Switch: Constructor with 1 parameter invoked.");
    }

    // Constructor 3: Two parameters
    Switch(String type, String brand) {
        this("Toggle Switch", "Philips", "Home Appliances"); // Calls Constructor 4
        this.type = type;
        this.brand = brand;
        System.out.println("Switch: Constructor with 2 parameters invoked.");
    }

    // Constructor 4: Three parameters
    Switch(String type, String brand, String usage) {
        this(220); // Calls Constructor 5
        this.type = type;
        this.brand = brand;
        this.usage = usage;
        System.out.println("Switch: Constructor with 3 parameters invoked.");
    }

    // Constructor 5: Four parameters
    Switch(int voltageRating) {
        this(15.75); // Calls Constructor 6
        this.voltageRating = voltageRating;
        System.out.println("Switch: Constructor with 4 parameters invoked.");
    }

    // Constructor 6: Five parameters
    Switch(double pricePerUnit) {
        this(true); // Calls Constructor 7
        this.pricePerUnit = pricePerUnit;
        System.out.println("Switch: Constructor with 5 parameters invoked.");
    }

    // Constructor 7: Six parameters
    Switch(boolean isOperational) {
        this.isOperational = isOperational;
        System.out.println("Switch: Constructor with all parameters invoked.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nSwitch Details:");
        System.out.println("Type: " + this.type);
        System.out.println("Brand: " + this.brand);
        System.out.println("Usage: " + this.usage);
        System.out.println("Voltage Rating: " + this.voltageRating + "V");
        System.out.println("Price per Unit: " + this.pricePerUnit);
        System.out.println("Operational: " + this.isOperational);
    }
}

