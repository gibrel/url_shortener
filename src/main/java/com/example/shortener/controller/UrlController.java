/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.shortener.controller;

import com.example.shortener.service;
import com.example.shortener.dto;

/**
 *
 * @author gibre
 */
@RestController
@RequestMapping("/api/shortener")
public class UrlController {
    
    private UrlService urlService;
    
    @ApiOperations()
    public void ConvertShortUrl(@RequestBody CreateShortenerDto request) {
        urlService.ConvertToShortUrl(request.GetUrl());
    }
    
    @ApiOperations()
    public LookupUrlResponseDto LookupUrl(@RequestBody LookupUrlRequestDto request) {
        return urlService.ShortenerLooup(request.GetShortUrl());
    }
    
    
}
