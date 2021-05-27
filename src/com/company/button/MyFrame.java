package com.company.button;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
 {
    JButton button;
    JLabel label;

    MyFrame(){

        ImageIcon icon = new ImageIcon("thumbup.png");
        ImageIcon icon2 = new ImageIcon("face.jpg");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this::actionPerformed);

     //   button.addActionListener(e -> System.out.println("button cliked"));
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comics Sans", Font.BOLD, 20));
        button.setIconTextGap(-15);
        button.setForeground(Color.ORANGE);
        button.setBackground(Color.cyan);
        button.setBorder(BorderFactory.createLineBorder(Color.blue));



       // button.setBackground(Color.BLUE);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==button) {
            System.out.println("button clicked");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
