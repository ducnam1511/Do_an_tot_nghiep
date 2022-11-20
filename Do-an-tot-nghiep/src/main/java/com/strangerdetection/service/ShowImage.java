package com.strangerdetection.service;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

public class ShowImage extends JFrame {
    public static void main(String[] args) {

    }

    public static void displayImg(String imgData) {
        try {
            byte[] btDataFile = Base64.decodeBase64(imgData);
            BufferedImage image = ImageIO.read(new ByteArrayInputStream(btDataFile));
            JOptionPane.showMessageDialog(null, "", "Image",
                    JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(image));
        } catch (Exception e) {
        }
    }
}
