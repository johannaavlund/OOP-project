package Model;
public abstract class Ghost implements Movable, Positionable {
    private double pos_x;
    private double pos_y;
    //bild
    private double speed_x;
    private double speed_y;
    private String name;
    //state ??

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
    
}
