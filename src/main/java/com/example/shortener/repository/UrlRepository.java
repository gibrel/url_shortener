/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.shortener.repository;

//mysql

/**
 *
 * @author gibre
 */
public class UrlRepository {
    
    //private
    
    public List<Url> ListTopUrls() {
        using() {
            /**
             * SELECT TOP 100
             *  id
             *  originalUrl
             *  shortenedUrl
             *  freq
             * from
             *  shrotenedurls
             * order by freq desc
             */
        }
    }
}
