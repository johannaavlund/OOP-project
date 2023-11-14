package com;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel {
    private GameController controller;
    private static final int CELL_SIZE = 40;

    private static final Color BACKGROUND_COLOR = new Color(254, 70, 165);
    //private static final String FONT_PATH = "/font/8bit_wonder/8-BIT WONDER.TTF";

    private JLabel header = new JLabel("Pacman Game");
    private JButton startButton = new JButton("Press button to start");
    private Font font, headerFont, buttonFont;

    public StartPanel() {
        this.initUI();
        this.addComponents();
        this.addEventListeners();
    }

    private void initUI() {
        setLayout(null);
        setDoubleBuffered(true);
        setPreferredSize(new Dimension(600,600));
        setBackground(BACKGROUND_COLOR);

        //loadFonts();
        setupHeader();
        setupButton();
    }

    /*private void loadFonts() {
        try {
            InputStream is = getClass().getResourceAsStream(FONT_PATH);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }*/

    private void setupHeader() {
        header.setBounds(70, 155, 600, 100);
       // headerFont = font.deriveFont(40F);
       // header.setFont(headerFont);
    }

    private void setupButton() {
        startButton.setPreferredSize(new Dimension(100, 50));
        startButton.setBounds(150, 310, 300, 50);
        //buttonFont = font.deriveFont(10F);
        //startButton.setFont(buttonFont);
    }

    private void addComponents() {
        add(header);
        add(startButton);
    }

    private void addEventListeners() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
                openGamePanel();
            }
        });
    }

    public void setController(GameController controller) {
        this.controller = controller;
    }

    private void openGamePanel() {
        if (controller != null) {
            controller.openGamePanel();
        }
    }

    /*public static void main(String[] args) {
        JFrame test = new JFrame("Pacman Game");
        test.setSize(600,600);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StartPanel start = new StartPanel();
        test.add(start);
        test.setResizable(false);
        test.setVisible(true);
    }*/

}