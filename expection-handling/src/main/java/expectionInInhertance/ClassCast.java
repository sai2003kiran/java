package expectionInInhertance;

public class ClassCast {
    public static void main(String[] args) {
        System.out.println("main started");
        Parent parent = new Child();
        try {
            SubChild child = (SubChild) parent;
        }catch (ClassCastException e){
            System.out.println("Change madooo");
        }


        System.out.println("main ended");
    }
}
