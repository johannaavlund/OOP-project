import java.util.Random;

public class Kendal extends Ghost { //Blinky

    private final int COUNTDOWN = 8;
	private int cageTimer = 0;
	private boolean directionUP = true;
	private final static int SPEED = 6;
	private int mod = 7;
	private int deathTimer = 40;
	private int pacLives = 5;

    public Kendal(int pos_x, int pos_y, int speed_x, int speed_y, String name) {
        super(pos_x, pos_y, speed_x, speed_y, name);
    }
    protected Direction getMove(){
        int curX = this.pos_x();
        int curY = this.pos_y();
        GameState state = GameState.getInstance();
        int curLives = state.getLives();
        if(curLives != pacLives){
            pacLives = curLives;
            cageTimer = COUNTDOWN;
            isAttacking = false;
        }
    }
}
