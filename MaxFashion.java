class MaxFashion{
 
 public static String signup(String fristName,String lastName,String dob,String email,String gender,String phoneNumber){
  String details = null;
  boolean validation = verificationOfDetails(fristName,lastName,dob,gender,email,phoneNumber);
  if(validation==true){
    details= "the signup is Successful";
  }else{
    details= "the signup is UnSuccessful...please try again";
  }
  return details;
 }
 
 public static boolean verificationOfDetails(String fristName,String lastName,String dob,String email,String gender,String phoneNumber){
  boolean isUservalid = false;
  boolean isFristName = false;
  boolean isLastName = false;
  boolean isPhoneNumber = false;
  boolean isEmail = false; 
  boolean isDob = false;
  boolean isGender = false; 

  if(fristName!=null && fristName.length()>=3){
  isFristName=true;
  }else{
  isFristName=false;
  System.out.println("invalid fristName..Please try again");
  }
  
  if(lastName!=null && lastName.length()>=1){
  isLastName=true;
  }else{
  isLastName=false;
  System.out.println("invalid lastName..Please try again");
  }  
  
  if(phoneNumber.length()>0 && phoneNumber.length()== 10){
  isPhoneNumber=true;
  }else{
  isPhoneNumber=false;
  System.out.println("invalid phoneNumber..Please try again");
  }
  
  if(dob!=null){
  isDob=true;
  }else{
  isDob=false;  
  System.out.println("invalid Dob..Please try again");
  }
  
  if(gender!=null){
  isGender=true;
  }else{
  isGender=false;
  System.out.println("invalid Gender..Please try again");
  }
  
  if(email!=null){
  isEmail=true;
  }else{
  isEmail=false;
  System.out.println("invalid Email..Please try again");
  }
  
  if(isFristName==true && isLastName==true && isPhoneNumber==true && isDob==true && isGender ==true && isEmail== true){
   isUservalid=true;
  }
  return isUservalid;
 }
}