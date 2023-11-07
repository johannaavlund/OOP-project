import java.awt.*;
import javax.swing.*;

public class Window extends JFrame{
    private static final int x = 800;
    private static final int y = 800;
    
    public Window(String framename, JPanel panelOne){
        initComponents(framename, panelOne);
    }

    private void initComponents(String titel, JPanel panelOne){
        setTitle(titel);
        setPreferredSize(new Dimension(x,y));
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        add(panelOne);
        pack();

        Dimension dimens = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation(dimens.width/2-this.getSize().width/2, dimens.height/2-this.getSize().height/2);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }

    Dimension dimens = Toolkit.getDefaultToolkit().getScreenSize();
}
