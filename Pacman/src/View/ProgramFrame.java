import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JFrame.*;
import javax.swing.JPanel.*;
import java.awt.*;

public class ProgramFrame extends JFrame {
    

    public ProgramFrame(String title, JPanel view, JPanel controller){
        initComponents(title, view, controller);
    }

    private void initComponents(String title, JPanel view, JPanel controller){
        setPreferredSize(new Dimension(view.getWidth(),view.getHeight()));
        setTitle(title);
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        add(controller);
        add(view);
        setVisible(true); //kanske sätta till false i början? och den som är startpage till true i main?
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Dimension dimens = Toolkit.getDefaultToolkit().getScreenSize(); //kollar dimensionerna på skärmen
        setLocation(dimens.width/2-this.getSize().width/2, dimens.height/2-this.getSize().height/2); //placerar window på mitten av ens skärm
    }
   
}
