class Flags {
    // Six instance variables
    int size;
    String color;
    String country;
    String type;
    String material;
    boolean isWaving;

    // Constructor 1: Zero-parameter constructor
    Flags() {
        this("National Flag"); // Calls Constructor 2
        System.out.println("Flags: Zero-parameter constructor invoked.");
    }

    // Constructor 2: One parameter
    Flags(String type) {
        this("India", "Cotton"); // Calls Constructor 3
        this.type = type;
        System.out.println("Flags: Constructor with 1 parameter invoked.");
    }

    // Constructor 3: Two parameters
    Flags(String country, String material) {
        this(10); // Calls Constructor 4
        this.country = country;
        this.material = material;
        System.out.println("Flags: Constructor with 2 parameters invoked.");
    }

    // Constructor 4: Three parameters
    Flags(int size) {
        this("India", "Cotton","Tricolor"); // Calls Constructor 5
        this.size = size;
        System.out.println("Flags: Constructor with 3 parameters invoked.");
    }

    // Constructor 5: Four parameters
    Flags(String country, String material,String color) {
        this(true); // Calls Constructor 6
        this.color = color;
        System.out.println("Flags: Constructor with 4 parameters invoked.");
    }

    // Constructor 6: Five parameters
    Flags(boolean isWaving) {
        this.isWaving = isWaving;
        System.out.println("Flags: Constructor with all parameters invoked.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nFlags Details:");
        System.out.println("Type: " + this.type);
        System.out.println("Country: " + this.country);
        System.out.println("Material: " + this.material);
        System.out.println("Size: " + this.size + " square meters");
        System.out.println("Color: " + this.color);
        System.out.println("Waving: " + this.isWaving);
    }
}

