package com.xworkz.supermarketworkflow.section;

public class Section {
    public String SectionId;
    public String SectionName;
    public String productType[];

    public void getSectionDetails(){
        System.out.println("\nstart of getSectionDetails");
        System.out.println("The section Id is : "+this.SectionId);
        System.out.println("The Section name is : "+this.SectionName);
        for (String itemName:productType) {
            System.out.println("The Section product's Type name is : "+itemName);
        }
        System.out.println("end of getSectionDetails");
    }

}
