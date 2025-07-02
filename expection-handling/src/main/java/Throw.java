public class Throw {
    public static void main(String[] args) {
        System.out.println("main started");
        try{
            method1();
        } catch (NullPointerException npe){
            npe.printStackTrace();
        }
        System.out.println("main ended");
    }

    private static void method1() throws NullPointerException {
        System.out.println("method1 Started");
        try{
            method2();
        } catch (NullPointerException npe){
            npe.printStackTrace();
        }
        System.out.println("method1 ended");
    }

    private static void method2() throws NullPointerException {
        System.out.println("method2 Started");
        try{
            method3();
        } catch (NullPointerException npe){
            npe.printStackTrace();
        }
        System.out.println("method2 ended");
    }

    private static void method3() throws NullPointerException {
        System.out.println("method3 Started");

        try{
            String a = null;
            System.out.println(a.length());
        } catch (NullPointerException npe){
            npe.printStackTrace();
        }
        System.out.println("method3 ended");
    }
}
