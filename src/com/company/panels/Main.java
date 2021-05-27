package com.company.panels;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("guy.png");
        ImageIcon thumb = new ImageIcon("thumbup.png");


        JLabel label = new JLabel();
        label.setText("Czesc");
       label.setIcon(thumb);
       label.setVerticalAlignment(JLabel.TOP);
       label.setHorizontalAlignment(JLabel.RIGHT);
       label.setBounds(0,0,75,75);
       



        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);




        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        greenPanel.add(label);
        bluePanel.add(label);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
    }
}
