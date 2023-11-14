import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Ghost extends GameState implements Movable, Positionable{
    private double pos_x;
    private double pos_y;
    public static final int frameRate = 5;
    private static final int CagePos = 250;
    private double speed_x;
    private double speed_y;
    private String name;
    protected GameState.Direction lastDirection = GameState.Direction.LEFT;
    protected GameState.Direction curDirection;

    protected final int ATTACK = 250;
	protected final int SCATTER = 120;
    protected boolean isAttacking = false;
    private int scoreValue;
	private boolean scatter;

    //bild
    //state

    public Ghost(int pos_x, int pos_y, int speed_x, int speed_y, String name){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.speed_x = speed_x;
        this.speed_y = speed_y;
        this.name = name;
    }



    public int getPosX(){
        return this.pos_x;
    }

    public int getPosY(){
        return this.pos_y;
    }

    public int getSpeedX(){
        return this.speed_x;
    }

    public int getSpeedY(){
        return this.speed_y;
    }

    public String getGhostName(){
        return this.name;
    }

    public void setPosX(int x){
        this.pos_x = x;
    }
    public void setPosY(int y){
        this.pos_y = y;
    }
    public void setSpeedX(initVariables speedX){
        this.speed_x = speedX;
    }
    public void setSpeedY(int speedY){
        this.speed_y = speedY;
    }
    public void setName(String name){
        this.name = name;
    }


    @Override
    public void move(){
        double curX = this.pos_x;
        double curY = this.pos_y;

        if(curDirection == Direction.LEFT){
            double newPosX = curX - speed_x;
            if (collidesWithWalls(newPosX, curY)== true){
                curX = newPosX;
            }
            else{}
        }
        if(curDirection == Direction.RIGHT){
            double newPosX = curX + speed_x;
            if (collidesWithWalls(newPosX, curY)== true){
                curX = newPosX;
            }
            else{}
        }
        if(curDirection == Direction.UP){
            double newPosY = curY + speed_y;
            if(collidesWithWalls(newPosY, curX)==true){
                curY = newPosY;
            }
            else{}
        }
        if(curDirection == Direction.DOWN){
            double newPosY = curY -speed_y;
            if(collidesWithWalls(newPosY, curX)==true){
                curY = newPosY;
            }
            else{}
        }

        pos_x = curX;
        pos_y = curY;
    
    }

    public boolean collidesWithWalls(double newPosX, double newPosY) {
        if(newPosX==0 && newPosY==0){ //här kommer det så andra villkor med Blocksize osv men har inte dom än
            return true;
        }
        else{
            return false;
        }

    }
    public boolean isScattered(){
        return scatter;
    }
    public int getValueOfScore() {
		return scoreValue;
	}
}
