
package com.xworkz.festival;

import com.xworkz.festival.events.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Festival festival1 = new Festival();
        festival1.setFestivalName("Diwali");
        festival1.setFestivalType("Religious");
        festival1.setFestivalDate("November 12");
        festival1.setFestivalLocation("India");
        festival1.setPublicHoliday(true);
        festival1.setFestivalTheme("Lights & Prosperity");
        festival1.setFestivalOrigin("Hindu mythology, victory of light over darkness");

        String name1 = festival1.getFestivalName();
        String type1 = festival1.getFestivalType();
        String date1 = festival1.getFestivalDate();
        String location1 = festival1.getFestivalLocation();
        boolean holiday1 = festival1.getPublicHoliday();
        String theme1 = festival1.getFestivalTheme();
        String origin1 = festival1.getFestivalOrigin();

        System.out.println("Festival Name: " + name1);
        System.out.println("Festival Type: " + type1);
        System.out.println("Festival Date: " + date1);
        System.out.println("Festival Location: " + location1);
        System.out.println("Is Public Holiday: " + holiday1);
        System.out.println("Festival Theme: " + theme1);
        System.out.println("Festival Origin: " + origin1);
        System.out.println("*******Complete*********");

        Festival festival2 = new Festival();
        festival2.setFestivalName("Christmas");
        festival2.setFestivalType("Religious");
        festival2.setFestivalDate("December 25");
        festival2.setFestivalLocation("Worldwide");
        festival2.setPublicHoliday(true);
        festival2.setFestivalTheme("Joy & Celebration");
        festival2.setFestivalOrigin("Celebration of Jesus Christ's birth");

        String name2 = festival2.getFestivalName();
        String type2 = festival2.getFestivalType();
        String date2 = festival2.getFestivalDate();
        String location2 = festival2.getFestivalLocation();
        boolean holiday2 = festival2.getPublicHoliday();
        String theme2 = festival2.getFestivalTheme();
        String origin2 = festival2.getFestivalOrigin();

        System.out.println("Festival Name: " + name2);
        System.out.println("Festival Type: " + type2);
        System.out.println("Festival Date: " + date2);
        System.out.println("Festival Location: " + location2);
        System.out.println("Is Public Holiday: " + holiday2);
        System.out.println("Festival Theme: " + theme2);
        System.out.println("Festival Origin: " + origin2);
        System.out.println("*******Complete*********");

        Festival festival3 = new Festival();
        festival3.setFestivalName("Holi");
        festival3.setFestivalType("Cultural");
        festival3.setFestivalDate("March 8");
        festival3.setFestivalLocation("India");
        festival3.setPublicHoliday(true);
        festival3.setFestivalTheme("Colors & Unity");
        festival3.setFestivalOrigin("Hindu legend of Prahlad and Holika");

        String name3 = festival3.getFestivalName();
        String type3= festival3.getFestivalType();
        String date3 = festival3.getFestivalDate();
        String location3 = festival3.getFestivalLocation();
        boolean holiday3 = festival3.getPublicHoliday();
        String theme3 = festival3.getFestivalTheme();
        String origin3 = festival3.getFestivalOrigin();

        System.out.println("Festival Name: " + name3);
        System.out.println("Festival Type: " + type3);
        System.out.println("Festival Date: " + date3);
        System.out.println("Festival Location: " + location3);
        System.out.println("Is Public Holiday: " + holiday3);
        System.out.println("Festival Theme: " + theme3);
        System.out.println("Festival Origin: " + origin3);
        System.out.println("*******Complete*********");

        Festival festival4 = new Festival();
        festival4.setFestivalName("Thanksgiving");
        festival4.setFestivalType("Cultural");
        festival4.setFestivalDate("November 28");
        festival4.setFestivalLocation("USA, Canada");
        festival4.setPublicHoliday(true);
        festival4.setFestivalTheme("Gratitude & Feasting");
        festival4.setFestivalOrigin("Early settlers and Native Americans sharing harvest");

        String name4 = festival4.getFestivalName();
        String type4 = festival4.getFestivalType();
        String date4 = festival4.getFestivalDate();
        String location4 = festival4.getFestivalLocation();
        boolean holiday4 = festival4.getPublicHoliday();
        String theme4 = festival4.getFestivalTheme();
        String origin4 = festival4.getFestivalOrigin();

        System.out.println("Festival Name: " + name4);
        System.out.println("Festival Type: " + type4);
        System.out.println("Festival Date: " + date4);
        System.out.println("Festival Location: " + location4);
        System.out.println("Is Public Holiday: " + holiday4);
        System.out.println("Festival Theme: " + theme4);
        System.out.println("Festival Origin: " + origin4);
        System.out.println("*******Complete*********");

        Festival festival5 = new Festival();
        festival5.setFestivalName("Eid");
        festival5.setFestivalType("Religious");
        festival5.setFestivalDate("March 25");
        festival5.setFestivalLocation("India");
        festival5.setPublicHoliday(true);
        festival5.setFestivalTheme("Faith & Togetherness");
        festival5.setFestivalOrigin("Islamic celebration marking the end of fasting");

        String name5 = festival5.getFestivalName();
        String type5= festival5.getFestivalType();
        String date5 = festival5.getFestivalDate();
        String location5 = festival5.getFestivalLocation();
        boolean holiday5 = festival5.getPublicHoliday();
        String theme5 = festival5.getFestivalTheme();
        String origin5 = festival5.getFestivalOrigin();

        System.out.println("Festival Name: " + name5);
        System.out.println("Festival Type: " + type5);
        System.out.println("Festival Date: " + date5);
        System.out.println("Festival Location: " + location5);
        System.out.println("Is Public Holiday: " + holiday5);
        System.out.println("Festival Theme: " + theme5);
        System.out.println("Festival Origin: " + origin5);
        System.out.println("*******Complete*********");

        // Additional festivals following the same explicit getter pattern...

        System.out.println("Main Ended");
    }
}