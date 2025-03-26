class Chemicals {
    // Six instance variables
    int quantity; 
    double pricePerKg;
    String name;
    String chemicalType;
    String safetyClassification;
    boolean isAvailable;

    // Constructor 1: Zero-parameter constructor
    Chemicals() {
        this("Sulfuric Acid"); // Calls Constructor 2
        System.out.println("Chemicals: Zero-parameter constructor invoked.");
    }

    // Constructor 2: One parameter
    Chemicals(String name) {
        this("Sulfuric Acid", "Acid"); // Calls Constructor 3
        this.name = name;
        System.out.println("Chemicals: Constructor with 1 parameter invoked.");
    }

    // Constructor 3: Two parameters
    Chemicals(String name, String chemicalType) {
        this("Sulfuric Acid", "Acid", "Corrosive"); // Calls Constructor 4
        this.name = name;
        this.chemicalType = chemicalType;
        System.out.println("Chemicals: Constructor with 2 parameters invoked.");
    }

    // Constructor 4: Three parameters
    Chemicals(String name, String chemicalType, String safetyClassification) {
        this(100); // Calls Constructor 5
        this.name = name;
        this.chemicalType = chemicalType;
        this.safetyClassification = safetyClassification;
        System.out.println("Chemicals: Constructor with 3 parameters invoked.");
    }

    // Constructor 5: Four parameters
    Chemicals(int quantity) {
        this(25.75); // Calls Constructor 6
        this.quantity = quantity;
        System.out.println("Chemicals: Constructor with 4 parameters invoked.");
    }

    // Constructor 6: Five parameters
    Chemicals(double pricePerKg) {
        this(true); // Calls Constructor 7
        this.pricePerKg = pricePerKg;
        System.out.println("Chemicals: Constructor with 5 parameters invoked.");
    }

    // Constructor 7: Six parameters
    Chemicals(boolean isAvailable) {
        this.isAvailable = isAvailable;
        System.out.println("Chemicals: Constructor with all parameters invoked.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nChemical Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Quantity (kg): " + this.quantity);
        System.out.println("Price per Kg: " + this.pricePerKg);
        System.out.println("Type: " + this.chemicalType);
        System.out.println("Safety Classification: " + this.safetyClassification);
        System.out.println("Available: " + this.isAvailable);
    }
}

