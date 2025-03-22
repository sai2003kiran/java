
class ZooRunner{
public static void main(String output[]){
Zoo lion= new Zoo();
lion.id=1;
lion.gender="female";
lion.zooName="mysoreZoo";
lion.visitingTime=10.30;
lion.endingTime=17.00;
System.out.println("the lion Zoo id is "+lion.id);
System.out.println("the lion Zoo gender is "+lion.gender);
System.out.println("the lion Zoo zooName is "+lion.zooName);
System.out.println("the lion Zoo visitingTime is "+lion.visitingTime+" am");
System.out.println("the lion Zoo endingTime is "+lion.endingTime+" pm");
Zoo tiger= new Zoo();
tiger.id=2;
tiger.gender="male";
tiger.zooName="NationalZoo";
tiger.visitingTime=14.30;
tiger.endingTime=16.00;
System.out.println("the tiger Zoo id is "+tiger.id);
System.out.println("the tiger Zoo gender is "+tiger.gender);
System.out.println("the tiger Zoo zooName is "+tiger.zooName);
System.out.println("the tiger Zoo visitingTime is "+tiger.visitingTime+" pm");
System.out.println("the tiger Zoo endingTime is "+tiger.endingTime+" pm");
Zoo monkey= new Zoo();
monkey.id=3;
monkey.gender="female";
monkey.zooName="Columbus Zoo";
monkey.visitingTime=13.30;
monkey.endingTime=17.45;
System.out.println("the monkey Zoo id is "+monkey.id);
System.out.println("the monkey Zoo gender is "+monkey.gender);
System.out.println("the monkey Zoo zooName is "+monkey.zooName);
System.out.println("the monkey Zoo visitingTime is "+monkey.visitingTime+" pm");
System.out.println("the monkey Zoo endingTime is "+monkey.endingTime+" pm");

}
}