package com.company.label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon("guy.png");
        Border border = BorderFactory.createLineBorder(Color.ORANGE, 10);

        JLabel label= new JLabel();
        label.setText("jakis epicki tekst");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.blue);
        label.setIcon(imageIcon);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(50);
        label.setBackground(Color.blue);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
      //  label.setBounds(0,0,800,800);




        JFrame frame = new JFrame();
        frame.setTitle("Jframe Epic App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);


        frame.add(label);
        frame.pack();
    }
}
