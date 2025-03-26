class Road {
    // Six instance variables
    int length;
    double width;
    String name;
    String type;
    String material;
    boolean isOperational;

    // Constructor 1: Zero-parameter constructor
    Road() {
        this("cottonpet  Street"); // Calls Constructor 2
        System.out.println("Road: Zero-parameter constructor invoked.");
    }

    // Constructor 2: One parameter
    Road(String name) {
        this("cottonpet  Street", "mainroad"); // Calls Constructor 3
        this.name = name;
        System.out.println("Road: Constructor with 1 parameter invoked.");
    }

    // Constructor 3: Two parameters
    Road(String name, String type) {
        this("cottonpet  Street", "mainroad", "Bitumen"); // Calls Constructor 4
        this.name = name;
        this.type = type;
        System.out.println("Road: Constructor with 2 parameters invoked.");
    }

    // Constructor 4: Three parameters
    Road(String name, String type, String material) {
        this(450); // Calls Constructor 5
        this.name = name;
        this.type = type;
        this.material = material;
        System.out.println("Road: Constructor with 3 parameters invoked.");
    }

    // Constructor 5: Four parameters
    Road(int length) {
        this(8.5); // Calls Constructor 6
        this.length = length;
        System.out.println("Road: Constructor with 4 parameters invoked.");
    }

    // Constructor 6: Five parameters
    Road(double width) {
        this(true); // Calls Constructor 7
        this.width = width;
        System.out.println("Road: Constructor with 5 parameters invoked.");
    }

    // Constructor 7: Six parameters
    Road(boolean isOperational) {
        this.isOperational = isOperational;
        System.out.println("Road: Constructor with all parameters invoked.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nRoad Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Material: " + this.material);
        System.out.println("Length: " + this.length + " meters");
        System.out.println("Width: " + this.width + " meters");
        System.out.println("Operational: " + this.isOperational);
    }
}

