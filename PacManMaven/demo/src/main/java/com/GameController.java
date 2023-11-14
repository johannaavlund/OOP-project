package com;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.openqa.selenium.Point;

public class GameController {
    private StartPanel startPanel;

    public GameController(StartPanel startPanel) {
        this.startPanel = startPanel;
    }

    public void openGamePanel() {
        PacManModel model = new PacManModel("src/main/java/com/Maze.txt", 9, 10); // Replace with your PacManModel instantiation
        GamePanel gamePanel = new GamePanel(model);
        gamePanel.setSize(startPanel.getSize());
        gamePanel.setVisible(true);

        // Close the current JFrame (StartPanel)
        SwingUtilities.getWindowAncestor(startPanel).dispose();
    }


        public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StartPanel startPanel = new StartPanel();
            GameController controller = new GameController(startPanel);
            startPanel.setController(controller);

            JFrame frame = new JFrame("Pacman Game");
            frame.setSize(780  , 820);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(startPanel);
            frame.setResizable(false);
            frame.setVisible(true);
            
        });
    }
}