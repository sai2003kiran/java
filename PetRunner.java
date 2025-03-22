class PetRunner{
	
public static void main(String output[]){
	System.out.println("main started");
     //objrefTYPE    refrenceName  =  new(keyWord)  constructor;
	    Pet             fristpet   =     new            Pet();
		fristpet.id=1;
		fristpet.age=3;
		fristpet.breed="laboratary";
		fristpet.gender="female";
		System.out.println("the 1st pet id is "+fristpet.id);
		System.out.println("the 1st pet age is "+fristpet.age+" years");
		System.out.println("the 1st pet breed name is "+fristpet.breed+" dog");
		System.out.println("the 1st pet gender is "+fristpet.gender);
		
	    Pet             secondpet   =     new            Pet();
		secondpet.id=2;
		secondpet.age=6;
		secondpet.breed="pigbull";
		secondpet.gender="female";
		System.out.println("the 2nd pet id is "+secondpet.id);
		System.out.println("the 2nd pet age is "+secondpet.age+" years");
		System.out.println("the 2nd pet breed name is "+secondpet.breed+" dog");
		System.out.println("the 2nd pet gender is "+secondpet.gender);
		
        Pet             thirdpet   =     new            Pet();
		thirdpet.id=3;
		thirdpet.age=1;
		thirdpet.breed="rotvilar";
		thirdpet.gender="male";
		System.out.println("the 3rd pet id is "+thirdpet.id);
		System.out.println("the 3rd pet age is "+thirdpet.age+" years");
		System.out.println("the 3rd pet breed name is "+thirdpet.breed+" dog");
		System.out.println("the 3rd pet gender is "+thirdpet.gender);
		
	    Pet             fourthpet   =     new            Pet();
		fourthpet.id=4;
		fourthpet.age=7;
		fourthpet.breed="GermanShpead";
		fourthpet.gender="female";
		System.out.println("the 4th pet id is "+fourthpet.id);
		System.out.println("the 4th pet age is "+fourthpet.age+" years");
		System.out.println("the 4th pet breed name is "+fourthpet.breed+" dog");
		System.out.println("the 4th pet gender is "+fourthpet.gender);
		
	    Pet             fifthpet   =     new            Pet();
		fifthpet.id=5;
		fifthpet.age=5;
		fifthpet.breed="chow chow";
		fifthpet.gender="female";
		System.out.println("the 5th pet id is "+fifthpet.id);
		System.out.println("the 5th pet age is "+fifthpet.age+" years");
		System.out.println("the 5th pet breed name is "+fifthpet.breed+" dog");
		System.out.println("the 5th pet gender is "+fifthpet.gender);
		
	System.out.println("main ended");
}
}