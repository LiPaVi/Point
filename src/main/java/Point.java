import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private int x = 0;
    private int y = 0;

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double distance(Point p){
        return sqrt(pow(getX() - x, 2) + pow(getY() - y, 2));
    }
}
