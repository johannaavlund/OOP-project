package com;
import javax.swing.*;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PacManModel {

    private char[][] maze;
    private int redDotX;
    private int redDotY;
    private List<Point> pinkDots;  // List to store the positions of pink dots

    public PacManModel(String mazeFilePath, int initialRedDotX, int initialRedDotY) {
        
        try {
            this.maze = loadMazeFromFile("src/main/java/com/Maze.txt");
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (e.g., show an error message)
        }

        this.redDotX = initialRedDotX;
        this.redDotY = initialRedDotY;
        initializePinkDots();


        // Initialize and start the timer for moving the pink dots
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movePinkDots(); // Move the pink dots automatically
            }
        });
        timer.start();
    }

    private char[][] loadMazeFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.lines()
                    .map(String::toCharArray)
                    .toArray(char[][]::new);
        }
    }

    public char[][] getMaze() {
        return maze;
    }

    public int getRedDotX() {
        return redDotX;
    }

    public int getRedDotY() {
        return redDotY;
    }

    private void initializePinkDots() {
        pinkDots = new ArrayList<>();
        // Add initial positions for pink dots
        pinkDots.add(new Point(7, 8));
        pinkDots.add(new Point(11, 8));
        // Add more pink dots or change initial positions as needed
    }

    public List<Point> getPinkDots() {
        return pinkDots;
    }

    public void movePinkDots() {
        Random random = new Random();
    
        for (Point pinkDot : pinkDots) {
            int direction = random.nextInt(4); // 0: up, 1: down, 2: left, 3: right
    
            double newX = pinkDot.getX();
            double newY = pinkDot.getY();
    
            switch (direction) {
                case 0:
                    newY = Math.max(0, newY - 1);
                    break;
                case 1:
                    newY = Math.min(maze.length - 1, newY + 1);
                    break;
                case 2:
                    newX = Math.max(0, newX - 1);
                    break;
                case 3:
                    newX = Math.min(maze[0].length - 1, newX + 1);
                    break;
            }
    
            pinkDot.setLocation(newX, newY);
        }
    }


    public void moveRedDot(int dx, int dy) {
        // Check if the new position is within the bounds of the maze and not a wall
        int newX = redDotX + dx;
        int newY = redDotY + dy;
    
        if (newX >= 0 && newX < maze[0].length && newY >= 0 && newY < maze.length) {
            // Check the content of the new position
            char cellContent = maze[newY][newX];
    
            // Check if the new position is not a wall ('w')
            if (cellContent != 'w') {
                // Move the red dot to the new position
                redDotX = newX;
                redDotY = newY;
    
                // Check if the red dot encounters any pink dots
                for (Point pinkDot : pinkDots) {
                    if (redDotX == pinkDot.x && redDotY == pinkDot.y) {
                        // Handle logic for encountering pink dot (e.g., remove the pink dot)
                        pinkDots.remove(pinkDot);
                        break;
                    }
                }
            }
        }
    }
    
}
