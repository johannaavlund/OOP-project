import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.*;


public class Pacman {

    private static DrawWorld world;
    private static Avatarmodel model;
 

    public static void main(String[] args){
        model = new Avatarmodel();
        model.add(new Player(){});
        world = new DrawWorld(800,800, model);
        Window window = new Window("first world", world);

    }

}
