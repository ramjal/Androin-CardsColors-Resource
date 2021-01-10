package com.example.cardscolors;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Data model for each row of the RecyclerView.
 */
class Sport implements Parcelable {

    //Member variables representing the title and information about the sport
    private String title;
    private String info;
    private String news;
    private final int imageResource;

    // Constructor for the com.example.cardscolors.Sport data model
    Sport(String title, String info, String news, int imageResource) {
        this.title = title;
        this.info = info;
        this.news = news;
        this.imageResource = imageResource;
    }

    String getTitle() {
        return title;
    }
    String getInfo() {
        return info;
    }
    String getNews() { return news; }
    public int getImageResource() {
        return imageResource;
    }

    // All Parcelable implementation code
    public static final Parcelable.Creator<Sport> CREATOR = new Parcelable.Creator<Sport>() {
        public Sport createFromParcel(Parcel in) {
            return new Sport(in);
        }

        public Sport[] newArray(int size) {
            return new Sport[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.info);
        dest.writeString(this.news);
        dest.writeInt(this.imageResource);
    }

    private Sport(Parcel in) {
        this.title = in.readString();
        this.info = in.readString();
        this.news = in.readString();
        this.imageResource = in.readInt();
    }
}
