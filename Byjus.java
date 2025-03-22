class Byjus{
 public static String UserProfile(String fullName, String dob,String email,String conformEmail,String password, String conformPassword){
 String details = null;
 boolean validation = verification(fullName,dob,email,conformEmail,password,conformPassword);
 if(validation==true){
  details="UserProfile is Updated";
 }else{
 details="UserProfile is UnSuccessful";
 }
 return details;
 }
 
 public static boolean verification(String fristName,String dob,String email,String conformEmail,String password,String conformPassword){
 boolean isFristName = false;
 boolean isConformEmail = false;
 boolean isConformPassword = false;
 boolean isDob = false;
 boolean isEmail = false;
 boolean isPassword = false;
 boolean isCrossCheck = false;
 if (fristName!=null && fristName.length()>=3){
  isFristName=true;
 }else{
  isFristName=false;
  System.out.println("Incorrect fristName");
 }
  
 if(dob!=null && dob.length()>=8 && dob.length()<=10){
   isDob=true;
 }else{
  isDob=false;
  System.out.println("Incorrect Dob");
 }
  
 if(email!=null && email.length()>=13){
   isEmail=true;
 }else{
  isEmail=false;
  System.out.println("Incorrect email");
 }
 
 if (conformEmail==email){
  isConformEmail=true;
 }else{
  isConformEmail=false;
  System.out.println("Incorrect conformEmail");
 }

 
 if(password!=null &&password.length()>=8 && password.length()<=10){
  isPassword=true;
 }else{
  isPassword=false;
  System.out.println("Incorrect password");
 }

 if (conformPassword==password){
  isConformPassword=true;
 }else{
  isConformPassword=false;
  System.out.println("Incorrect conformPassword");
 }
 
 if(isFristName==true && isConformEmail==true && isConformPassword==true && isDob==true && isEmail==true && isPassword==true){
  isCrossCheck=true;
 }else{
 isCrossCheck=false;
 System.out.println("verification failed");
 }
 
 return isCrossCheck;
 }
 
}