package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SourceDestination {
    @GetMapping("/flight")
    public String flight1(){
        String page= """
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta http-equiv="X-UA-Compatible" content="IE=edge">
                        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                        <link rel="stylesheet" href="TehranToMashhad.css">
                        <title>TehranToMashhad</title>
                        <link rel="icon" type="image/x-icon" href="favicon.ico"/>
                    </head>
                    <style>
                        body {
                        font-family: Tahoma, Geneva, sans-serif;
                        /* direction: rtl; */
                        font-size: 13px;
                        }
                        @font-face {
                            font-family: 'Vazir-Regular-FD';
                            src: url('http://example.com/fonts/Vazir-Regular-FD.eot');
                            src: local('Vazir-Regular-FD'),
                                 url('http://example.com/fonts/Vazir-Regular-FD.eot?#iefix') format('embedded-opentype'),
                                 url('http://example.com/fonts/Vazir-Regular-FD.woff2') format('woff2'),
                                 url('http://example.com/fonts/Vazir-Regular-FD.woff') format('woff'),
                                 url('http://example.com/fonts/Vazir-Regular-FD.ttf') format('truetype'),
                                 url('http://example.com/fonts/Vazir-Regular-FD.svg#Vazir-Regular-FD') format('svg');
                            font-style: normal;
                            font-weight: normal;
                            font-display: swap;
                        }
                    </style>
                    <body>
                        <div class="row1">   <!--should be inter from left to right-->
                            <div>
                                <div class="select">
                                    <p>
                                    قیمت: 729,500 تومان
                                    </p><br>
                                    <button>انتخاب پرواز</button><br>
                                    <p>
                                        ظرفیت خالی: 10+ صندلی
                                    </p><br>
                                </div>
                            </div>
                                        
                            <div class="box"></div>
                                        
                            <div class="inline">
                                <div>
                                    <p name="clock">8:15</p>
                                    <p name="source"> + source +</p>
                                </div>
                                <div>
                                    <========================
                                </div>
                                <div>
                                    <p name="clock">6:50</p>
                                    <p name="destination">+ destination +</p>
                                </div>
                            </div>
                           
                            <div class="photo">
                                <span> &nbsp; &nbsp; &nbsp; هما</span>
                                <img src="Iranair_logo.jpg" width="50" height="50"><br><br>
                            </div>  
                                        
                        </div>
                                        
                        <div class="spacer"></div>
                        <div class="row2">
                            <div>
                                <div class="select">
                                    <p>
                                    قیمت: 735,300 تومان
                                    </p><br>
                                    <button>انتخاب پرواز</button><br>
                                    <p>
                                        ظرفیت خالی: 9+ صندلی
                                    </p><br>
                                </div>
                            </div>
                                        
                            <div class="box"></div>
                                        
                            <div class="inline">
                                <div>
                                    17:00 <br>
                                    مشهد
                                </div>
                                <div>
                                    <=======================
                                </div>
                                <div>
                                    15:30 <br>
                                    تهران
                                </div>
                            </div>
                           
                            <div class="photo">
                                <span> سپهران</span>
                                <img src="images.png" width="50" height="50"><br><br>
                            </div> 
                        </div>
                                        
                        <div class="spacer"></div>
                        <div class="row3">
                            <div>
                                <div class="select">
                                    <p>
                                    قیمت: 751,500 تومان
                                    </p><br>
                                    <button>انتخاب پرواز</button><br>
                                    <p>
                                        ظرفیت خالی: 2+ صندلی
                                    </p><br>
                                </div>
                            </div>
                                        
                            <div class="box"></div>
                                        
                            <div class="inline">
                                <div>
                                    17:15 <br>
                                    مشهد
                                </div>
                                <div>
                                    <=======================
                                </div>
                                <div>
                                    16:00 <br>
                                    تهران
                                </div>
                            </div>
                           
                            <div class="photo">
                                <span>ماهان</span> &nbsp;
                                <img src="mahan.jpg" width="50" height="50"><br><br>
                            </div>
                            
                        </div>
                        <div class="spacer"></div>
                        <div class="spacer"></div>                 
                                        
                       
                    </body>
                    </html> """;
        return page;
    }
}

//        @RequestParam(value = "ori",defaultValue = "default") String S,
//        @RequestParam(value = "des",defaultValue = "default") String D
//
//            String source= " ";
//            String destination= " ";
//
//            if(S.equals("تهران") && D.equals("مشهد")) {
//                source = "تهران";
//                destination = "مشهد";
//            }
//            else if(S.equals("تهران") && D.equals("بیرجند")) {
//                source = "تهران";
//                destination = "بیرجند";
//            }
//            else if(S.equals("مشهد") && D.equals("تهران")) {
//                source = "مشهد";
//                destination = "تهران";
//            }
//            else if(S.equals("مشهد") && D.equals("بیرجند")) {
//                source = "مشهد";
//                destination = "بیرجند";
//            }
//            else if(S.equals("بیرجند") && D.equals("تهران")) {
//                source = "بیرجند";
//                destination = "تهران";
//            }
//            else {
//                source = "بیرجند";
//                destination = "مشهد";
//            }
//


