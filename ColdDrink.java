class ColdDrink {
    int drinkSize;
    String drinkPackaging;
    String drinkFlavor;

    // Constructor without arguments
    public ColdDrink() {
		System.out.println("ColdDrink zero constructor is invoked");
    }

    // Constructor with arguments
    public ColdDrink(int size, String packaging, String flavor) {
      System.out.println("perfume para constructor is invoked");
		this.drinkSize = drinkSize;
        this.drinkPackaging = drinkPackaging;
        this.drinkFlavor = drinkFlavor;
    }
}

