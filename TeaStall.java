class TeaStall{
 static String name = "Baba's tea stall";
 public static void main(String tea[]){
 System.out.println("the name before re-initialization :"+name);
 // while using re-init we use samevariable = "refrences";
 name = "Babu's tea stall";
 System.out.println("the name after re-initialization :"+name);
 }
}