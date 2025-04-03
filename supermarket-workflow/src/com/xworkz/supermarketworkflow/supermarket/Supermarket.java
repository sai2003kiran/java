package com.xworkz.supermarketworkflow.supermarket;
import com.xworkz.supermarketworkflow.section.Section;
public class Supermarket {
    public int supermarketId;
    public String SupermarketName;
    public String location;
    public Section Sections[];

    public void getSupermarketdetails(){
        System.out.println("\nstart of getSupermarketdetails");
        System.out.println("The super market ID is : "+this.supermarketId);
        System.out.println("The super market Name is : "+this.SupermarketName);
        System.out.println("The super market location is : "+this.location);
        for(Section indivisualSection:Sections){
             indivisualSection.getSectionDetails();
        }
        System.out.println("ended of getSupermarketdetails");
    }

}
