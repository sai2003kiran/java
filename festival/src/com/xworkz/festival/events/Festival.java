package com.xworkz.festival.events;

public class Festival {
    private String festivalName;
    private String festivalType;
    private String festivalDate;
    private String festivalLocation;
    private boolean isPublicHoliday;
    private String festivalTheme;
    private String festivalOrigin;

    public void setFestivalName(String festivalName) {
        this.festivalName = festivalName;
    }

    public String getFestivalName() {
        return festivalName;
    }

    public void setFestivalType(String festivalType) {
        this.festivalType = festivalType;
    }

    public String getFestivalType() {
        return festivalType;
    }

    public void setFestivalDate(String festivalDate) {
        this.festivalDate = festivalDate;
    }

    public String getFestivalDate() {
        return festivalDate;
    }

    public void setFestivalLocation(String festivalLocation) {
        this.festivalLocation = festivalLocation;
    }

    public String getFestivalLocation() {
        return festivalLocation;
    }

    public void setPublicHoliday(boolean isPublicHoliday) {
        this.isPublicHoliday = isPublicHoliday;
    }

    public boolean getPublicHoliday() {
        return isPublicHoliday;
    }

    public void setFestivalTheme(String festivalTheme) {
        this.festivalTheme = festivalTheme;
    }

    public String getFestivalTheme() {
        return festivalTheme;
    }

    public void setFestivalOrigin(String festivalOrigin) {
        this.festivalOrigin = festivalOrigin;
    }

    public String getFestivalOrigin() {
        return festivalOrigin;
    }
}