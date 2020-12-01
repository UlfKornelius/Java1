package ru.bondarev.homeworks.HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowHW8 extends JFrame {

    public static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_POSX = 650;
    private static final int WINDOW_POSY = 270;

    private SettingHW8 settingWindow;
    private GameMapHW8 gameMap;

    MainWindowHW8() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setTitle("Игра: крестики - нолики");

        settingWindow = new SettingHW8(this);
        gameMap = new GameMapHW8();

        JButton btnStart = new JButton("Create new game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingWindow.setVisible(true);
            }
        });

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


        add(gameMap);
        setResizable(false);
        setVisible(true);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {

        gameMap.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);

    }


}
