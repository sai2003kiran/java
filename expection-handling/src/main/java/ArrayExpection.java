public class ArrayExpection {
    public static void main(String[] args) {
        System.out.println("main Started");
        String name[] = {"sai","kiran"};
        try{
            System.out.println(name[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the provided index 7 is not in range");
        }
        System.out.println("main ended");
    }
}
