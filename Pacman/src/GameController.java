package Controller;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.*;


public class GameController extends JPanel{
    //ta in allt som behövs
    //ta in modell också
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    JLabel testLabel;
    JFrame frame;

    //LABEL SKA VARA TYP BARBRIE DOCKAN I DETTA FALL
    


    public GameController(){
        
        JLabel testLabel = new JLabel();
        testLabel.setBackground(Color.RED);
        testLabel.setBounds(100, 100, 100, 100);
        testLabel.setOpaque(true);
        
        
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        testLabel.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        testLabel.getActionMap().put("upAction", upAction);

        JFrame frame = new JFrame();
        frame.add(testLabel);
        


    }
    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            testLabel.setLocation(testLabel.getX(), testLabel.getY() - 10);
        }
        
    }

    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
        
    }

    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
        
    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
        
    }



}
