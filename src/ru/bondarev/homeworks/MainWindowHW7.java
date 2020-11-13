package ru.bondarev.homeworks.HW7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowHW7 extends JFrame {

    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 500;
    private static final int WINDOW_POS_X = 650;
    private static final int WINDOW_POS_Y = 270;

    public static void main(String[] args) {
        new MainWindowHW7();
        System.out.println("method main is end");
    }

    MainWindowHW7() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setTitle("Самостоятельное создание окна");

        JButton btnStart = new JButton("Create new game");
        JButton btnClose = new JButton("Close");
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new GridLayout(1, 2));
        panelBottom.add(btnStart);
        panelBottom.add(btnClose);

        add(panelBottom, BorderLayout.SOUTH);



        setResizable(false);
        setVisible(true);
    }







}
