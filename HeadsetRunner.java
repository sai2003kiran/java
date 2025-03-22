class HeadsetRunner{
 public static void main(String connect[]){
 System.out.println("main Started");
 boolean isfinalvalue = Headset.powerOn();
 System.out.println("the headset Status is :"+isfinalvalue);
  boolean isOutputvalue = Headset.powerOff();
   System.out.println("the headset Status is :"+isOutputvalue);
 System.out.println("main ended");
 }
}