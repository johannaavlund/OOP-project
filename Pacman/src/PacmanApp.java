
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Timer;

import Controller.GameController;

import java.awt.*;


public class PacmanApp {
    static GameController gc;
    ProgramFrame programFrame;

    public static void main(String[] args){
        

        gc = new GameController();

        ProgramFrame frame = new ProgramFrame("test");
        frame.getContentPane().add(gc);
    
        //ProgramFrame startpage = new ProgramFrame("start page", null, null);
        //ProgramFrame gamepage = new ProgramFrame("game page", null, null);
    }

}
