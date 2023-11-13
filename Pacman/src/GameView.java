
import javax.swing.JPanel;
import java.awt.*;

public class GameView extends JPanel{
    private final Font smallFont = new Font("vilken font vill vi ha??", Font.BOLD, 14);
    private boolean checkIfGameIsRunning = false;
    private boolean checkIfPacmanAlive = false;

    //Storlek på rutan 
    public final int BlockSize = 16 ;
    public final int NumOfBlocks = 32;  //lite osäker på hur vi ska lösa detta
    public final int ScreenSize = NumOfBlocks * BlockSize; // säg NumOfBlocks = 15, ger 225 möjliga positioner för pacman att röra sig på
    private int lives, score;
    private int NumOfGohst = 6;

    //lägga in bilder på pacman, hjärta, spöke, specialgrejer 
    private image  

    // inte i view??
    private final int MaxNumOfKen = 12;
    private final int PackmanSpeed = 4;
    private int [] gohstX, gohstY, gohstDX, gohstDY, gohstSpeed;


    //många siffror som ska 
    private final short levelData[] = {



    };

    // 0=blue, 1=left border, 2=top border, 4=right border, 8=bottom border, 16=vita pluppar
    // man plussar ihop siffrorna för att få pluppar med önskade egenskaper


    public GameView(int x, int y){
        loadImages();
        initVariables();
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.PINK);
        setPreferredSize(new Dimension(x,y));
    } 

    private void loadImages 
} 
    
