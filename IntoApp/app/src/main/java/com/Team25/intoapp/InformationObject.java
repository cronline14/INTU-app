package com.Team25.intoapp;

import android.graphics.ImageFormat;
import android.media.Image;

public class InformationObject {
    private String name;
    private String summary;
    private String mapsCoords;
    private String picture;
    public InformationObject(String name, String summary, String mapsCoords,String picture) {
        this.name = name;
        this.summary = summary;
        this.mapsCoords = mapsCoords;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMapsCoords() {
        return mapsCoords;
    }

    public void setMapsCoords(String mapsCoords) {
        this.mapsCoords = mapsCoords;
    }

    public String getPicture() {
        return picture;
    }
}
