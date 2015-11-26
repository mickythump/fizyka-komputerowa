
public class Particle {
    private int x, y;

    public Particle(int size) {
        x = (int)(size * Math.random());
        y = (int)(size * Math.random());
    }

    public Particle(int xx, int yy) {
        x = xx;
        y = yy;
    }

    int get_x() {return x;}
    int get_y() {return y;}
    public void set_x(int xx) {x = xx;}
    public void set_y(int yy) {y = yy;}
}
