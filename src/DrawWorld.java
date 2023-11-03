
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class DrawWorld extends JPanel{

    private Avatarmodel model;
    
    public DrawWorld(int x, int y, Avatarmodel model){

        this.model = model;
        setBackground(Color.PINK);
        setPreferredSize(new Dimension(x,y));
        
        for (Avatar avatars : model.avatarList){

            try {
                BufferedImage barbiePic = ImageIO.read(DrawWorld.class.getResourceAsStream("pics/"+avatars.getName()+".png"));
                avatars.setImage(barbiePic);
            
            } catch (IOException e) {
            // TODO Auto-generated catch block
                e.printStackTrace();
             }

            
        }
        
        //Här ritar vi ut bilderna, bilderna läggs till i en lista ''avatars'
       
       
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Avatar avatars : model.avatarList){
            g.drawImage(avatars.getImage() , avatars.getX() , avatars.getY(), null);
        }
    }
    

}
