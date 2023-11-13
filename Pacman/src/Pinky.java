import javax.swing.ImageIcon;

public class Pinky extends Ghost {
    

    public Pinky(double pos_x, double pos_y, double speed_x, double speed_y, String name) {
        super(pos_x, pos_y, speed_x, speed_y, name);
    }
    ImageIcon emoKen = new ImageIcon("EmoKen.webp");

    @Override
    public void move() {
    }

    @Override
    public void goLeft() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'goLeft'");
    }

    @Override
    public void goRight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'goRight'");
    }

    @Override
    public void goUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'goUp'");
    }

    @Override
    public void goDown() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'goDown'");
    }

    @Override
    public double getX() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getX'");
    }

    @Override
    public double getY() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getY'");
    }
}
        