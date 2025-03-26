class Factory {
    // Six instance variables
    int area;
    double height;
    String Ownername;
    String type;
    String material;
    boolean isProcessing;

    // Constructor 1: Zero-parameter constructor
    Factory() {
        this("Devender Singh Choohan"); // Calls Constructor 2
        System.out.println("Factory: Zero-parameter constructor invoked.");
    }

    // Constructor 2: One parameter
    Factory(String Ownername) {
        this("Devender Singh Choohan", "Manufacturing"); // Calls Constructor 3
        this.Ownername = Ownername;
        System.out.println("Factory: Constructor with 1 parameter invoked.");
    }

    // Constructor 3: Two parameters
    Factory(String Ownername, String type) {
        this("Devender Singh Choohan", "Manufacturing", "Concrete"); // Calls Constructor 4
        this.Ownername = Ownername;
        this.type = type;
        System.out.println("Factory: Constructor with 2 parameters invoked.");
    }

    // Constructor 4: Three parameters
    Factory(String Ownername, String type, String material) {
        this(3000); // Calls Constructor 5
        this.Ownername = Ownername;
        this.type = type;
        this.material = material;
        System.out.println("Factory: Constructor with 3 parameters invoked.");
    }

    // Constructor 5: Four parameters
    Factory(int area) {
        this(12.5); // Calls Constructor 6
        this.area = area;
        System.out.println("Factory: Constructor with 4 parameters invoked.");
    }

    // Constructor 6: Five parameters
    Factory(double height) {
        this(true); // Calls Constructor 7
        this.height = height;
        System.out.println("Factory: Constructor with 5 parameters invoked.");
    }

    // Constructor 7: Six parameters
    Factory(boolean isProcessing) {
        this.isProcessing = isProcessing;
        System.out.println("Factory: Constructor with all parameters invoked.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nFactory Details:");
        System.out.println("Ownername: " + this.Ownername);
        System.out.println("Type: " + this.type);
        System.out.println("Material: " + this.material);
        System.out.println("Area: " + this.area + " square meters");
        System.out.println("Height: " + this.height + " meters");
        System.out.println("processing: " + this.isProcessing);
    }
}

