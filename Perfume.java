class Perfume{
    String perfumeName;
    String perfumeFragrance;
    int perfumeLongevity; // in hours

    // Constructor without arguments
    Perfume() {
       System.out.println("perfume zero constructor is invoked");
    }
   // Constructor with arguments
    Perfume(String perfumeName, String perfumeFragrance, int perfumeLongevity) {
        System.out.println("perfume para constructor is invoked");
        this.perfumeName = perfumeName;
        this.perfumeFragrance = perfumeFragrance;
        this.perfumeLongevity = perfumeLongevity;
    }
}

