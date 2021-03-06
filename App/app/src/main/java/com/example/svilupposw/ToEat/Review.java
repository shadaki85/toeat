package com.example.svilupposw.ToEat;

public class Review {

    protected String id;
    protected String comment;
    protected float rating;
    protected String userId;
    protected String userName;
    protected String localId;

    public Review() {
    }

    public Review (String id) {
        this.id = id;
    }

    public Review(String id, String comment, float rating, String userId, String localId, String userName) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
        this.userId = userId;
        this.localId = localId;
        this.userName = userName;
    }

    public Review(String comment, float rating, String userId, String localId, String userName) {
        this.comment = comment;
        this.rating = rating;
        this.userId = userId;
        this.localId = localId;
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
