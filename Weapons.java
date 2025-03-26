class Weapons {
    // Six instance variables
    int range;
    double price;
    String name;
    String type;
    String material;
    boolean isOperational;

    // Constructor 1: Zero-parameter constructor
    Weapons() {
        this("Sword"); // Calls Constructor 2
        System.out.println("Weapons: Zero-parameter constructor invoked.");
    }

    // Constructor 2: One parameter
    Weapons(String name) {
        this("Sword", "Melee"); // Calls Constructor 3
        this.name = name;
        System.out.println("Weapons: Constructor with 1 parameter invoked.");
    }

    // Constructor 3: Two parameters
    Weapons(String name, String type) {
        this("Sword", "Melee", "Steel"); // Calls Constructor 4
        this.name = name;
        this.type = type;
        System.out.println("Weapons: Constructor with 2 parameters invoked.");
    }

    // Constructor 4: Three parameters
    Weapons(String name, String type, String material) {
        this(50); // Calls Constructor 5
        this.name = name;
        this.type = type;
        this.material = material;
        System.out.println("Weapons: Constructor with 3 parameters invoked.");
    }

    // Constructor 5: Four parameters
    Weapons(int range) {
        this(1500.0); // Calls Constructor 6
        this.range = range;
        System.out.println("Weapons: Constructor with 4 parameters invoked.");
    }

    // Constructor 6: Five parameters
    Weapons(double price) {
        this(true); // Calls Constructor 7
        this.price = price;
        System.out.println("Weapons: Constructor with 5 parameters invoked.");
    }

    // Constructor 7: Six parameters
    Weapons(boolean isOperational) {
        this.isOperational = isOperational;
        System.out.println("Weapons: Constructor with all parameters invoked.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nWeapons Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Material: " + this.material);
        System.out.println("Sharp Range: " + this.range + " BESS");//(Brubacher Edge Sharpness Scale) tester
        System.out.println("Price: " + this.price + " USD");
        System.out.println("Operational: " + this.isOperational);
    }
}

