package ru.bondarev.homeworks.HW8;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingHW8 extends JFrame {

    private static final int WINDOW_WIDTH = 400;
    private static  final  int WINDOW_HEIGHT = 350;

    private  static final int MIN_WIN_LENGTH = 3;
    private  static final int MIN_FIELD_SIZE = 3;
    private  static final int MAX_FIELD_SIZE = 10;
    private  static final String FIELD_SIZE_PREFIX = "Filde size is: ";
    private  static final String WIN_LENGTH_PREFIX = "Win length is: ";

    private MainWindowHW8 mainWindow;

    private JRadioButton humVsAI;
    private JRadioButton humVsHum;
    private JSlider sliderWinLen;
    private JSlider sliderFieldSize;



    SettingHW8(MainWindowHW8 mainWindow) {
        this.mainWindow = mainWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Rectangle gameWindowBounds = mainWindow.getBounds();
        int posX = (int) gameWindowBounds.getCenterX() - WINDOW_WIDTH/2;
        int posY = (int) gameWindowBounds.getCenterY() - WINDOW_HEIGHT/2;
        setLocation(posX, posY);
        setResizable(false);
        setTitle("Settings new game");
        setLayout(new GridLayout(10, 1));

        addGameModeSetup();
        addFieldMapControl();

        JButton btnPlay = new JButton("Play new game!");
        btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPlayGameClick();
            }
        });


        add(btnPlay);
        setVisible(false);




    }

    private void addGameModeSetup() {
        add(new JLabel(" Choose game mode: "));
        humVsAI = new JRadioButton("Human vs. AI", true);
        humVsHum = new JRadioButton("Human vs. Human");
        ButtonGroup gameMode = new ButtonGroup();
        gameMode.add(humVsAI);
        gameMode.add(humVsHum);

        add(humVsAI);
        add(humVsHum);

    }

    private void addFieldMapControl() {

        JLabel lbFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
        JLabel lbWinLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH);

        sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = sliderFieldSize.getValue();
                lbFieldSize.setText(FIELD_SIZE_PREFIX + currentValue);
                sliderWinLen.setMaximum(currentValue);
            }
        });

        sliderWinLen = new JSlider(MIN_WIN_LENGTH, MIN_FIELD_SIZE);
        sliderWinLen.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbWinLength.setText(WIN_LENGTH_PREFIX + sliderWinLen.getValue());
            }
        });

        add(new JLabel("Choose field size"));
        add(lbFieldSize);
        add(sliderFieldSize);
        add(new JLabel("Choose win length"));
        add(lbWinLength);
        add(sliderWinLen);

    }

    private void btnPlayGameClick() {

        int gameMode;

        if (humVsAI.isSelected()) {
            gameMode = GameMapHW8.MODE_HVA;
        } else if (humVsHum.isSelected()) {
            gameMode = GameMapHW8.MODE_HVH;
        }else {
            throw new RuntimeException("Unexpected game mode");
        }

        int fieldSize = sliderFieldSize.getValue();
        int winLength = sliderWinLen.getValue();



        mainWindow.startNewGame(gameMode, fieldSize, fieldSize, winLength);

        setVisible(false);

    }


}
