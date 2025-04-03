package com.xworkz.supermarketworkflow;
import com.xworkz.supermarketworkflow.supermarket.Supermarket;
import com.xworkz.supermarketworkflow.section.Section;

public class SuperMarketRunner {
    public static void main(String[] args) {
        System.out.println("\nMain started");

        String[] flour={"ragiPowder","ricePower","wheatPower"};
        String[] oil={"SunflowerOil","MustedOil","CoconutOil"};
        Section[] products = new Section[2];

        //section class details
        Section fristProduct=new Section();
        fristProduct.SectionId="oil1234";
        fristProduct.SectionName="CookingOilS;";
        fristProduct.productType= oil;
        fristProduct.getSectionDetails();

        Section SecondProduct=new Section();
        SecondProduct.SectionId="flour1234";
        SecondProduct.SectionName="Atta's";
        SecondProduct.productType= flour;
        SecondProduct.getSectionDetails();


        products[0]=fristProduct;
        products[1]=SecondProduct;

        //Supermarket Class detail
        Supermarket fristSupermarket = new Supermarket();
        fristSupermarket.supermarketId=1;
        fristSupermarket.SupermarketName="MSmart";
        fristSupermarket.location="bangalore";
        fristSupermarket.Sections= products;
        fristSupermarket.getSupermarketdetails();
        System.out.println("main ended");
    }
}
