package com.shah.voyager.DestinationPackage;

/**
 * Created by lenovo on 20-12-2017.
 */

public class Destination {

    private int mImageResourceId;
    private int mDestinationName;
    private int mSeason;

    public Destination(int imageResourceId, int destinationName, int season){
        mImageResourceId = imageResourceId;
        mDestinationName = destinationName;
        mSeason = season;
    }

    public Destination(int imageResourceId, int destinationName){
        mImageResourceId = imageResourceId;
        mDestinationName = destinationName;
    }

    public int getImageResourceID(){
        return mImageResourceId;
    }

    public int getDestinationName(){
        return mDestinationName;
    }

    public int getSeason(){
        return mSeason;
    }


}
