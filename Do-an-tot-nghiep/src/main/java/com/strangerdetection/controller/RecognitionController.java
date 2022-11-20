//package com.strangerdetection.controller;
//
//import com.google.gson.Gson;
//import com.strangerdetection.dto.NotiDto;
//import org.apache.commons.io.FileUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.io.File;
//import java.nio.charset.Charset;
//import java.nio.file.Files;
//import java.sql.Timestamp;
//
//@Controller
//public class RecognitionController {
//
//    private static final Logger logger = LoggerFactory.getLogger(RecognitionController.class);
//
//    @PostMapping("/warning")
//    public void notiFace(@RequestBody String reqBody) {
//        Gson gson = new Gson();
//        NotiDto noti = gson.fromJson(reqBody, NotiDto.class);
//        File destination = new File("file.txt");
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        String imgDataTxt = timestamp.getTime() + ":" + noti.getImgData() + ";";
//
//        try {
//            FileUtils.writeStringToFile(destination, imgDataTxt);
//
//        } catch (Exception e) {
//
//        }
//
//
//    }
//
//}
