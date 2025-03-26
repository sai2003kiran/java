class Metro {
    // Six instance variables
    String name;
    int capacity;
    double ticketPrice;
    String route;
    String operationHours;
    boolean isOperational;

    // Constructor 1: Zero-parameter constructor
    Metro() {
        this("namma Metro"); // Calls Constructor 2
        System.out.println("Metro: Zero-parameter constructor invoked.");
    }

    // Constructor 2: One parameter
    Metro(String name) {
        this("namma Metro","Majestic-Silkboard"); // Calls Constructor 3
		this.name = name;
        System.out.println("Metro: Constructor with 1 parameter invoked.");
    }

    // Constructor 3: Two parameters
    Metro(String name, String route ) {
        this("namma Metro","Majestic-Silkboard","6.00pm-9.00pm"); // Calls Constructor 4
	    this.name = name;
        this.route = route;
        System.out.println("Metro: Constructor with 2 parameters invoked.");
    }

    // Constructor 4: Three parameters
    Metro(String name, String route, String operationHours) {
        this(123); // Calls Constructor 5
		this.name = name;
        this.route = route;
		this.operationHours = operationHours;
        System.out.println("Metro: Constructor with 3 parameters invoked.");
    }

    // Constructor 5: Four parameters
    Metro(int capacity) {
        this(59.97); // Calls Constructor 6
		 this.capacity = capacity;
        System.out.println("Metro: Constructor with 4 parameters invoked.");
    }

    // Constructor 6: Five parameters
    Metro(double ticketPrice) {
        this(true); // Calls Constructor 7
		this.ticketPrice = ticketPrice;
        System.out.println("Metro: Constructor with 5 parameters invoked.");
    }

    // Constructor 7: Six parameters
    Metro(boolean isOperational) {
        this.isOperational = isOperational;
        System.out.println("Metro: Constructor with all parameters invoked.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nMetro Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Ticket Price: " + this.ticketPrice);
        System.out.println("Route: " + this.route);
        System.out.println("Operation Hours: " + this.operationHours);
        System.out.println("Operational: " +this.isOperational);
    }

   
    
}