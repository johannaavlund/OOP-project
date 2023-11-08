package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import Window;
import View.DrawWorld;

import java.awt.*;


public class PacmanApp {

    private static DrawWorld world;
 

    public static void main(String[] args){
        world = new DrawWorld(800,800);
        Window window = new Window("first world", world);
    }

}
