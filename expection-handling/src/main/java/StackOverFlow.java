public class StackOverFlow {
    public static void main(String[] args) {
        System.out.println("main Started");
        method();
        System.out.println("main ended");
    }

    private static void method() {
        System.out.println("main Started");
        try{
            method();
        }
        catch (StackOverflowError e){
            System.out.println("the same method can't invoke inside the same Method");
        }
        System.out.println("main ended");
    }
}
