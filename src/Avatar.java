import java.awt.image.BufferedImage;
import java.nio.Buffer;

public abstract class Avatar implements IMovable, IPositionable{
    
    private String avatarName;
    private int x;
    private int y;
    private double currentSpeed;
    private BufferedImage image;

    public Avatar(String avatarName, double currentSpeed, int x, int y, BufferedImage image){
        this.avatarName = avatarName;
        this.currentSpeed = currentSpeed;
        this.x = x;
        this.y = y;
        this.image = image;
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void goLeft() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void goRight() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void goUp() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void goDown() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getX() {
        // TODO Auto-generated method stub
        return this.x;
    }

    @Override
    public int getY() {
        // TODO Auto-generated method stub
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public String getName(){
        return this.avatarName;
    }

    public void setImage (BufferedImage image){
        this.image = image;
    }

    public BufferedImage getImage(){
        return this.image;
    }


}
