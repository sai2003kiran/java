class Amazon{
 public static String signUp(String email,String password){
  String details = null;
  if(email!=null && !email.isEmpty() && password.length()==5){
   details="email Login successful";
   }else{
   details="email Login Unsuccessful";
  }
    return details;
 }
  public static String signUp(long phoneNumber,String password){
  String details = null;
  if(phoneNumber==5436789021l && password.length()==5){
   details="password Login successful";
   }else{
   details="password Login Unsuccessful";
  }
    return details;
 }
 
 
}