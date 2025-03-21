class AjioRunner{
 public static void main(String output[]){
  long phoneNumber = 5436789021l;
  String password = "sai87";
  String email = "baba76543@mail.com";
  String loginEmail=Ajio.signUp(email,password);
  System.out.println(loginEmail);
  String loginPhoneNumber=Ajio.signUp(phoneNumber,password);
  System.out.println(loginPhoneNumber);
 }
}