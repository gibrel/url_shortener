/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.shortener.dto;

/**
 *
 * @author gibre
 */
public class CreateShortenerDto {

    private String _originalUrl;

    public void SetUrl(String url) {
        this._originalUrl = url;
    }

    public String GetUrl() {
        return this._originalUrl;
    }

}
