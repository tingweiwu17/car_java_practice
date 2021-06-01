package com.car;

import javax.swing.*;

public class CarDemo {
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;

    public static void main ( String[] args ) {
        JFrame frame = new JFrame ();
        frame.setContentPane (new CarDemo ().panel1);
        frame.setSize (600,400);
        frame.setDefaultCloseOperation (WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible (true);
    }
}
