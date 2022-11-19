package com.strangerdetection;

import com.strangerdetection.example.WebcamViewerExample;
import com.strangerdetection.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.swing.*;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class StrangerDetectionMain {

	public static void main(String[] args) {
		SpringApplication.run(StrangerDetectionMain.class, args);
	}
}
