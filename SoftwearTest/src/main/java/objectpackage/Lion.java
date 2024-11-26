package objectpackage;

import java.awt.*;

public class Lion implements Things{
    private String name;
    private int age;
    private Point position;


    public Lion(int age, String name, Point position){

        this.position = position;
        this.name = name;


        this.age = age;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(this.position.x, this.position.y, 30, 30);
        g.drawString(this.name + this.age, this.position.x, this.position.y);
    }
    public Point getPosition() {
        return position;
    }
}
