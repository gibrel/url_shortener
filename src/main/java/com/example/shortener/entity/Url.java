package com.example.shortener.entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gibre
 */
public class Url {

    private long _id;

    private String _originalUrl;

    private String _shortnerdUrl;

    private String _urlTitle;
    
    private int _freq;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this._id = id;
    }

    public String getUrl() {
        return this._originalUrl;
    }

    public void setUrl(String url) {
        this._originalUrl = url;
    }

    public String getShortUrl() {
        return this._shortnerdUrl;
    }

    public void setShortUrl(String url) {
        this._shortnerdUrl = url;
    }

    public String getTitle() {
        return this._urlTitle;
    }

    public void setTitle(String title) {
        this._urlTitle = title;
    }

}
