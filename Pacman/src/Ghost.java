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

    //bild
    //state

    public Ghost(double pos_x, double pos_y, double speed_x, double speed_y, String name){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.speed_x = speed_x;
        this.speed_y = speed_y;
        this.name = name;
    }


    public double getPosX(){
        return this.pos_x;
    }

    public double getPosY(){
        return this.pos_y;
    }

    public double getSpeedX(){
        return this.speed_x;
    }

    public double getSpeedY(){
        return this.speed_y;
    }

    public String getGhostName(){
        return this.name;
    }

    public void setPosX(double x){
        this.pos_x = x;
    }
    public void setPosY(double y){
        this.pos_y = y;
    }
    public void setSpeedX(double speedX){
        this.speed_x = speedX;
    }
    public void setSpeedY(double speedY){
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
            curX = newPosX;
        }
        if(curDirection == Direction.RIGHT){
            double newPosX = curX + speed_x;
            curX = newPosX;
        }
        if(curDirection == Direction.UP){
            double newPosY = curY + speed_y;
            curY = newPosY;
        }
        if(curDirection == Direction.DOWN){
            double newPosY = curY -speed_y;
            curY = newPosY;
        }

        pos_x = curX;
        pos_y = curY;
    
    }

    public boolean collidesWithWalls(int newPosX, int newPosY) {
        if(newPosX==0 && newPosY==0){
            return true;
        }
        else{
            return false;
        }

    }
}
