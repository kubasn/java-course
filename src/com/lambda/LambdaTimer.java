package com.lambda;

import javax.swing.*;
import java.util.Date;

public class LambdaTimer extends JFrame {
    public static void main(String [] args){
        LambdaTimer lambdaTimer = new LambdaTimer();
        lambdaTimer.setTitle("timer");
        lambdaTimer.setSize(300,300);
        lambdaTimer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        lambdaTimer.add(label);
        lambdaTimer.setVisible(true);

        Timer timer = new Timer(1000,event->{
            Date date = new Date();
            System.out.println(date.toString());
            label.setText(date.toString());
        });

        timer.start();
    }
}
