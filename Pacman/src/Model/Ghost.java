
package Model;

public abstract class Ghost implements Movable, Positionable {
    private double pos_x;
    private double pos_y;
    //bild
    private double speed_x;
    private double speed_y;
    private String name;
    private int number_of_ghost;
    //state ??

    public Ghost(double pos_x, double pos_y, double speed_x, double speed_y, String name, int number_of_ghost){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.speed_x = speed_x;
        this.speed_y = speed_y;
        this.name = name;
        this.number_of_ghost = number_of_ghost;
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
    public void setName(double name){
        this.name = name;
    }

    @Override
    public void move(){
        int random;
        int current_pos;
        int count;
        for (int i = 0; i < number_of_ghost; i++ ){
            if (pos_x[i] % BLOCK_SIZE == 0 && pos_y[i] % BLOCK_SIZE == 0) {
                pos = pos_x[i] / BLOCK_SIZE + N_BLOCKS * (int) (pos_y[i] / BLOCK_SIZE);

                count = 0;
        }

    }
}
