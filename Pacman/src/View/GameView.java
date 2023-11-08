package View;
import javax.swing.JPanel;
import java.awt.*;

public class GameView extends JPanel{
    
    //Blandad view och model måste dela upp, hur gör jag det på bästa SÄTT+
    private Dimension d;
    private final Font smallFont = new Font("vilken font vill vi ha??", Font.BOLD, 14);
    private boolean checkIfGameIsRunning = false;
    private boolean checkIfPacmanAlive = false;

    //Storlek på rutan 
    public final int BlockSize = 24 ; //storlek på block som är en position
    public final int NumOfBlocks = 20;  //lite osäker på hur vi ska lösa detta
    public final int ScreenSize = NumOfBlocks * BlockSize; // säg NumOfBlocks = 15, ger 225 möjliga positioner för pacman att röra sig på
    private int lives, score;
    private int NumOfGohst = 6;

    //lägga in bilder på pacman, hjärta, spöke, specialgrejer 
    private image 
    private image //pacman upp, ner, left, right

    // inte i view??
    private final int MaxNumOfKen = 12;
    private final int PackmanSpeed = 4;
    private int NumOfKen = 6;
    private int lives, score;
    private int [] gohstX, gohstY, gohstDX, gohstDY, gohstSpeed;

    private int pacman_x, pacman_y, pacman_dx, pacman_dy;
    private int req_dx, req_dy;

    private final int validSpeeds[] = {1,2,3,4,6,8};
    private final int maxSpeed = 6;
    private int currentSpeed = 3;
    private short [] screenData;
    private Timer timer = 1000;


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
        //setBackground(Color.PINK);
       // setPreferredSize(new Dimension(x,y));
    } 

    private void loadImages 
} 
    
