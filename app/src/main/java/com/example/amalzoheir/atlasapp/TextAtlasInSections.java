package com.example.amalzoheir.atlasapp;

public class TextAtlasInSections {
    private static final int NO_IMAGE_PROVIDED=-1;
    private String dataAboutSection;
    private int imageSourceNumber=NO_IMAGE_PROVIDED;
    public TextAtlasInSections(String dataAboutSection){
        this.dataAboutSection=dataAboutSection;
    }
    public TextAtlasInSections(String dataAboutSection,int imageSourceNumber){
        this.dataAboutSection=dataAboutSection;
        this.imageSourceNumber=imageSourceNumber;
    }

    public String getDataAboutSection() {
        return dataAboutSection;
    }

    public void setDataAboutSection(String dataAboutSection) {
        this.dataAboutSection = dataAboutSection;
    }

    public int getImageSourceNumber() {
        return imageSourceNumber;
    }

    public void setImageSourceNumber(int imageSourceNumber) {
        this.imageSourceNumber = imageSourceNumber;
    }
    public boolean hasImage() {
        return imageSourceNumber != NO_IMAGE_PROVIDED;
    }
}
