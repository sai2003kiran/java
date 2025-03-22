class Flipkart{
 public static String signup(String fullName, String surName, String phoneNumber, String email,String password){
  String details = null;
  boolean isvalidation=verify(fullName,surName,phoneNumber,email,password);
  if(isvalidation==true){
  details="user signup Successful";
  }else{
  details="user signup UnSuccessful";
  }
  return details;
 }
 
 public static boolean verify(String fullName, String surName, String phoneNumber, String email,String password){
  boolean isInfo = false;
  boolean isFullName = false;
  boolean isSurName =false;
  boolean isPhoneNumber = false;
  boolean isEmail = false;
  boolean isPassword = false;
  
  if(fullName!=null && fullName.length()>=3){
   isFullName=true;  
  }else{
   isFullName=false;
   System.out.println("incorrect fullName");
  }
  
  if(surName!=null && surName.length()>=1){
   isSurName=true;  
  }else{
   isSurName=false;
   System.out.println("incorrect SurName");
  }
  
  if(phoneNumber!=null && phoneNumber.length()==10){
   isPhoneNumber=true;  
  }else{
   isPhoneNumber=false;
   System.out.println("incorrect phoneNumber");
  }
  
  if(email!=null){
  isEmail=true;
  }else{
  isEmail=false;
   System.out.println("incorrect email");
  }
  
  if(password!=null && password.length()>=8){
  isPassword=true;
  }else{
  isPassword=false;
   System.out.println("incorrect password");
  }
  
  if(isFullName==true && isSurName==true && isPhoneNumber==true && isEmail==true && isPassword==true){
  isInfo=true;
  }else{
  isInfo=false;
  System.out.println("verify failed");
  }
  
  return isInfo;
 }
 
}