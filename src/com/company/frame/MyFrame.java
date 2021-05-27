package com.company.frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("JFrame Epic App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon image = new ImageIcon("face.jpg");
        this.setIconImage(image.getImage());
        this.setVisible(true);
        this.setSize(420,690);
        this.getContentPane().setBackground(Color.black);

    }
}
