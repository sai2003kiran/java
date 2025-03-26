class Glass {
    // Six instance variables
    int capacity; 
    double pricePerUnit;
    String color;
    String materialType;
    String transparencyLevel;
    boolean isFragile;

    // Constructor 1: Zero-parameter constructor
    Glass() {
        this("Clear Glass"); // Calls Constructor 2
        System.out.println("Glass: Zero-parameter constructor invoked.");
    }

    // Constructor 2: One parameter
    Glass(String materialType) {
        this("Clear Glass", "Transparent"); // Calls Constructor 3
        this.materialType = materialType;
        System.out.println("Glass: Constructor with 1 parameter invoked.");
    }

    // Constructor 3: Two parameters
    Glass(String materialType, String transparencyLevel) {
        this("Clear Glass", "Transparent", "No Tint"); // Calls Constructor 4
        this.materialType = materialType;
        this.transparencyLevel = transparencyLevel;
        System.out.println("Glass: Constructor with 2 parameters invoked.");
    }

    // Constructor 4: Three parameters
    Glass(String materialType, String transparencyLevel, String color) {
        this(500); // Calls Constructor 5
        this.materialType = materialType;
        this.transparencyLevel = transparencyLevel;
        this.color = color;
        System.out.println("Glass: Constructor with 3 parameters invoked.");
    }

    // Constructor 5: Four parameters
    Glass(int capacity) {
        this(10.50); // Calls Constructor 6
        this.capacity = capacity;
        System.out.println("Glass: Constructor with 4 parameters invoked.");
    }

    // Constructor 6: Five parameters
    Glass(double pricePerUnit) {
        this(true); // Calls Constructor 7
        this.pricePerUnit = pricePerUnit;
        System.out.println("Glass: Constructor with 5 parameters invoked.");
    }

    // Constructor 7: Six parameters
    Glass(boolean isFragile) {
        this.isFragile = isFragile;
        System.out.println("Glass: Constructor with all parameters invoked.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nGlass Details:");
        System.out.println("Material Type: " + this.materialType);
        System.out.println("Capacity (ml): " + this.capacity);
        System.out.println("Price per Unit: " + this.pricePerUnit);
        System.out.println("Color: " + this.color);
        System.out.println("Transparency Level: " + this.transparencyLevel);
        System.out.println("Fragile: " + this.isFragile);
    }
}

