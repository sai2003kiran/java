public class NullPointer extends Throwable {
    public static void main(String[] args) {
        System.out.println("main Started");
        try{
            String name=null;
            System.out.println(name.length());
        }
        catch (NullPointerException e){
            System.out.println("there is no data to get its length");
        }
        System.out.println("main ended");
    }
}
