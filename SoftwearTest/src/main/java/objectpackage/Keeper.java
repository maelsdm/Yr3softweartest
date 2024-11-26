package objectpackage;

import java.awt.*;


public class Keeper implements Things{
    private String name;
    private int number;
    private Point position;




    public Keeper(int number, String name, Point position) {
        this.position = position;
        this.name = name;
        this.number = number;



    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public Point getPosition() {
        return position;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(this.position.x, this.position.y, 20, 20);
        g.drawString(this.name + this.number, this.position.x, this.position.y);
    }


}
