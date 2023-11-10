package View;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
    private int NumOfGohst = 6;

    //lägga in bilder på pacman, hjärta, spöke, specialgrejer 
   // private image 
    //private image //pacman upp, ner, left, right

    // inte i view??
    private final int MaxNumOfKen = 12;
    private final int PackmanSpeed = 4;
    private int NumOfKen = 6;
    private int lives, score;
    private int [] dx, dy;
    private int [] KenX, KenY, KenDX, KenDY, KenSpeed;

    private int pacman_x, pacman_y, pacman_dx, pacman_dy;
    private int req_dx, req_dy;

    private final int validSpeeds[] = {1,2,3,4,6,8};
    private final int maxSpeed = 6;
    private int currentSpeed = 3;
    private short [] screenData;
    private Timer timer = 1000;


    //många siffror som ska 
    private final short levelData[] = {  //controller, kalla i view, logik


    };

    // 0=blue, 1=left border, 2=top border, 4=right border, 8=bottom border, 16=vita pluppar
    // man plussar ihop siffrorna för att få pluppar med önskade egenskaper


    public GameView(int x, int y){  //kallar på alla metoder som ritar upp vyn, ska va i view
        loadImages();
        initVariables();
        addKeyListener(new TAdapter());
        setFocusable(true);
        initGame();
        //setBackground(Color.PINK);
       // setPreferredSize(new Dimension(x,y));
    } 

    private void loadImages(){   //view? eller är det logik att ladda in bilder??
        PacmanDown = new ImageIcon("path för bild");
        PacmanUp = new ImageIcon();
    //gör för alla bilder
    }

    private void initVariables(){
        screenData = new short[NumOfBlocks * NumOfBlocks];
        d = new Dimension(400,400);
        KenX = new int[MaxNumOfKen];
        KenDX = new int [MaxNumOfKen];
        KenDY = new int [MaxNumOfKen];
        dx = new int[4];
        dy = new int [4];

        timer = new Timer(40, this); // avgör hur många gånger som vyn uppdateras
        timer.restart();
    }

    private void initGame(){
        lives = 3;
        score = 0;
        initLevel();
        NumOfKen = 6;
        currentSpeed = 3;
    }

    //startar spelet, inte ligga i view

    public void playGame(Graphics2D g2D){   //view

    }

    private void initLevel(){  //View
        int i;
        for(i=0; i<NumOfBlocks*NumOfBlocks; i++){
            screenData[i] = levelData[i];
        }
        //ritar upp leveln
        
    }

    private void continueLevel(){   //Model, logik bakom uppritandet av banan
        int dy = 1;
        int random;
        for( int i = 0; i < NumOfKen; i++){
            KenY[i] = 4*BlockSize;
            KenX[i] = 4*BlockSize;
            KenDY[i] = 0;
            KenDX[i] = dx;
            dx = -dx;
            random = (int) (Math.random() * (currentSpeed +1));
            if (random > currentSpeed){
                random = currentSpeed;
            }
            KenSpeed[i]=validSpeeds[random];
        }
        pacman_x = 7 * BlockSize;
        pacman_y = 11 * BlockSize;
        pacman_dx = 0;
        pacman_dy = 0;
        req_dx = 0;
        checkIfPacmanAlive = false;
        
    }   //vet ej vad denna gör om jag ska vara ärlig, skapar den en ny level när man dör??
//kanke, för varje i skapas en ny level med nya dimensioner osv...

public void paintComponent(Graphics g){   //view
    super.paintComponent(g);
    Graphics2D g2D = (Graphics2D) g;
    g2D.setColor(Color.PINK);
    g2D.fillRect(0, 0, d.width, d. height);

    drawMaze(g2D);
    drawScore(g2D);

    if(checkIfGameIsRunning){
        playGame(g2D);
    }else{
        showIntroScreen(g2D);
    }
    Toolkit.getDefaultToolkit().sync();
}


    class TAdapter extends KeyAdapter{  //ska va en egen klass som gör sin grej, dålig jävla kod, kan ärva
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();
            if (checkIfGameIsRunning) {
                if (key == KeyEvent.VK_LEFT){
                    req_dx = -1;
                    req_dy = 0;
                }
                if (key == KeyEvent.VK_RIGHT){
                    req_dx = -1;
                    req_dy = 0;
                }
                if (key == KeyEvent.VK_UP){
                    req_dx = -1;
                    req_dy = 0;
                }
                if (key == KeyEvent.VK_DOWN){
                    req_dx = -1;
                    req_dy = 0;
                }
                if (key == KeyEvent.VK_ESCAPE && timer.isRunning()){
                    checkIfGameIsRunning = false;
                }
                
            } else {
                if (key == KeyEvent.VK_SPACE){
                    checkIfGameIsRunning = true;
                    initGame();
                }
            }
        }

        //Skapa en metod för event key som ärvs, detta är dåligt, ska finnas i Model dessutom 
        
    }
} 
    
