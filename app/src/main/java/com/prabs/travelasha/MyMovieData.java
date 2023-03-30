package com.prabs.travelasha;

import android.text.SpannableString;

public class MyMovieData {

    private String destName;
    private SpannableString destDesc;
    private Integer img1;
    private Integer img2;

    public MyMovieData(String destName, SpannableString destDesc, Integer img1, Integer img2) {
        this.destName = destName;
        this.destDesc = destDesc;
        this.img1 = img1;
        this.img2 = img2;
    }

    public String getMovieName() {
        return destName;
    }

    public void setMovieName(String movieName) {
        this.destName = movieName;
    }

    public SpannableString getMovieDate() {
        return destDesc;
    }

    public void setMovieDate(SpannableString movieDate) {
        this.destDesc = movieDate;
    }

    public Integer getMovieImage() {
        return img1;
    }

    public void setMovieImage(Integer movieImage) {
        this.img1 = movieImage;
    }



    public Integer getMovieImage2() {
        return img2;
    }

    public void setMovieImag2(Integer movieImage) {
        this.img2 = movieImage;
    }


}
