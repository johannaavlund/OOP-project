import javax.swing.*;

import Controller.GameController;

import java.awt.*;

public class ProgramFrame extends JFrame {
    

    public ProgramFrame(String title){
        initComponents(title);
    }

    public void initComponents(String title){
        //setPreferredSize(new Dimension(view.getWidth(),view.getHeight()));
        setTitle(title);
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        setSize(800, 800);
        //getContentPane().add(panel);
        //getContentPane().add(tst);
        
        setVisible(true); //kanske sätta till false i början? och den som är startpage till true i main?
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Dimension dimens = Toolkit.getDefaultToolkit().getScreenSize(); //kollar dimensionerna på skärmen
        setLocation(dimens.width/2-this.getSize().width/2, dimens.height/2-this.getSize().height/2); //placerar window på mitten av ens skärm
    }
   
}
