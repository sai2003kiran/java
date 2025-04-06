package com.xworkz.constitution.laws;

public class Constitution {
    private String constitutionName;
    private int totalArticles;
    private String primaryDraftedBy;
    private String countryOfOrigin;
    private String enactmentDate;
    private String officialLanguages;
    private int amendmentsCount;

    public void setConstitutionName(String constitutionName) {
        this.constitutionName = constitutionName;
    }

    public String getConstitutionName() {
        return constitutionName;
    }

    public void setTotalArticles(int totalArticles) {
        this.totalArticles = totalArticles;
    }

    public int getTotalArticles() {
        return totalArticles;
    }

    public void setPrimaryDraftedBy(String primaryDraftedBy) {
        this.primaryDraftedBy = primaryDraftedBy;
    }

    public String getPrimaryDraftedBy() {
        return primaryDraftedBy;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setEnactmentDate(String enactmentDate) {
        this.enactmentDate = enactmentDate;
    }

    public String getEnactmentDate() {
        return enactmentDate;
    }

    public void setOfficialLanguages(String officialLanguages) {
        this.officialLanguages = officialLanguages;
    }

    public String getOfficialLanguages() {
        return officialLanguages;
    }

    public void setAmendmentsCount(int amendmentsCount) {
        this.amendmentsCount = amendmentsCount;
    }

    public int getAmendmentsCount() {
        return amendmentsCount;
    }
}
