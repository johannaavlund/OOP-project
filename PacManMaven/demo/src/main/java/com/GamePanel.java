package com;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JFrame implements KeyListener{

    private static final int CELL_SIZE = 40;

    private PacManModel model;
    private DrawingPanel drawingPanel;

    public GamePanel(PacManModel model) {
        this.model = model;
        setTitle("Pac-Man Maze");
        setSize(CELL_SIZE * model.getMaze()[0].length, CELL_SIZE * model.getMaze().length);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addKeyListener(this);
        drawingPanel = new DrawingPanel();
        add(drawingPanel);
    }

    private class DrawingPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawMaze(g);
            drawRedDot(g);
            drawPinkDots(g);
        }

        private void drawMaze(Graphics g) {
            char[][] maze = model.getMaze();
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {
                    if (maze[i][j] == 'w') {
                        g.setColor(new Color(25,25,166));
                        g.fillRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                    } else if (maze[i][j] == 's') {
                        g.setColor(Color.BLACK);
                        int dotSize = CELL_SIZE / 4; // Smaller dots
                        int dotX = j * CELL_SIZE + CELL_SIZE / 2 - dotSize / 2;
                        int dotY = i * CELL_SIZE + CELL_SIZE / 2 - dotSize / 2;
                        g.fillOval(dotX, dotY, dotSize, dotSize);
                    }
                }
            }
        }

        private void drawRedDot(Graphics g) {
            // Draw the red dot based on the model
            g.setColor(Color.RED);
            int dotX = model.getRedDotX() * CELL_SIZE;
            int dotY = model.getRedDotY() * CELL_SIZE;
            g.fillOval(dotX, dotY, CELL_SIZE, CELL_SIZE);
        }

        private void drawPinkDots(Graphics g) {
            // Draw the pink dots based on the model
            g.setColor(Color.PINK);
            for (Point pinkDot : model.getPinkDots()) {
                int pinkDotX = pinkDot.x * CELL_SIZE;
                int pinkDotY = pinkDot.y * CELL_SIZE;
                g.fillOval(pinkDotX, pinkDotY, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}