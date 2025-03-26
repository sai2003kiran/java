class House {
    // Six instance variables
    String name;
    int rooms;
    double price;
    String location;
    String availability;
    boolean isForSale;

    // Constructor 1: Zero-parameter constructor
    House() {
        this("LakshimiNivasam"); // Calls Constructor 2
        System.out.println("House: Zero-parameter constructor invoked.");
    }

    // Constructor 2: One parameter
    House(String name) {
        this("LakshimiNivasam", "Bangalore"); // Calls Constructor 3
        this.name = name;
        System.out.println("House: Constructor with 1 parameter invoked.");
    }

    // Constructor 3: Two parameters
    House(String name, String location) {
        this("LakshimiNivasam", "Bangalore", "RentedHouse"); // Calls Constructor 4
        this.name = name;
        this.location = location;
        System.out.println("House: Constructor with 2 parameters invoked.");
    }

    // Constructor 4: Three parameters
    House(String name, String location, String availability) {
        this(3); // Calls Constructor 5
        this.name = name;
        this.location = location;
        this.availability = availability;
        System.out.println("House: Constructor with 3 parameters invoked.");
    }

    // Constructor 5: Four parameters
    House(int rooms) {
        this(300000.00); // Calls Constructor 6
        this.rooms = rooms;
        System.out.println("House: Constructor with 4 parameters invoked.");
    }

    // Constructor 6: Five parameters
    House(double price) {
        this(true); // Calls Constructor 7
        this.price = price;
        System.out.println("House: Constructor with 5 parameters invoked.");
    }

    // Constructor 7: Six parameters
    House(boolean isForSale) {
        this.isForSale = isForSale;
        System.out.println("House: Constructor with all parameters invoked.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nHouse Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Price: " + this.price);
        System.out.println("Location: " + this.location);
        System.out.println("Availability: " + this.availability);
        System.out.println("For Sale: " + this.isForSale);
    }
}

