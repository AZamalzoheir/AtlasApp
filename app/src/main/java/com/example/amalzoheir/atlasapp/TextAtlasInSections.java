package com.example.amalzoheir.atlasapp;

public class TextAtlasInSections {
    private static final int NO_IMAGE_PROVIDED=-1;
    private String dataAboutSection;
    private int imageSourceNumber=NO_IMAGE_PROVIDED;
    private int position;
    public TextAtlasInSections(String dataAboutSection){
        this.dataAboutSection=dataAboutSection;
    }

    public TextAtlasInSections(String dataAboutSection, int imageSourceNumber, int position) {
        this.dataAboutSection=dataAboutSection;
        this.imageSourceNumber=imageSourceNumber;
        this.position = position;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean hasImage() {
        return imageSourceNumber != NO_IMAGE_PROVIDED;
    }
}
