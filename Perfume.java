class Perfume{
    String perfumeName;
    String perfumeFragrance;
    int perfumeLongevity; // in hours

    // Constructor without arguments
    public Perfume() {
				System.out.println("perfume zero constructor is invoked");
    }

    // Constructor with arguments
    public Perfume(String name, String fragrance, int longevity) {
						System.out.println("perfume para constructor is invoked");
        this.perfumeName = perfumeName;
        this.perfumeFragrance = perfumeFragrance;
        this.perfumeLongevity = perfumeLongevity;
    }
}

