package com.prady.leaflet.data;

import java.util.Date;

public class NewsItems {
    int id;
    String title, username, newsImg, userImg, content, bgColor, videoUrl;
    Date dateCreation;
    int viewType = 0; // 0=text, 1=img, 3=video
    boolean isFav = false;

    public NewsItems() {
    }

    public NewsItems(int id, String title, String username, String newsImg, String userImg, String content, String bgColor, String videoUrl, Date dateCreation, int viewType, boolean isFav) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.newsImg = newsImg;
        this.userImg = userImg;
        this.content = content;
        this.bgColor = bgColor;
        this.videoUrl = videoUrl;
        this.dateCreation = dateCreation;
        this.viewType = viewType;
        this.isFav = isFav;
    }

    public NewsItems(int id, String title, String username, String newsImg, String userImg, String content, String bgColor, Date dateCreation, int viewType) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.newsImg = newsImg;
        this.userImg = userImg;
        this.content = content;
        this.bgColor = bgColor;
        this.dateCreation = dateCreation;
        this.viewType = viewType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(String newsImg) {
        this.newsImg = newsImg;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }

    @Override
    public String toString() {
        return "NewsItems{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", newsImg='" + newsImg + '\'' +
                ", userImg='" + userImg + '\'' +
                ", content='" + content + '\'' +
                ", bgColor='" + bgColor + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", dateCreation=" + dateCreation +
                ", viewType=" + viewType +
                ", isFav=" + isFav +
                '}';
    }
}
