package objectpackage;

import java.awt.*;

public class Drone implements Things{
    private String name;
    private int frequency;
    private Point position;


    public Drone(int frequency, String name, Point position){

        this.position = position;
        this.name = name;


        this.frequency = frequency;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(this.position.x, this.position.y, 30, 30);
        g.drawString(this.name + this.frequency+"MHz", this.position.x, this.position.y);
    }
    public Point getPosition() {
        return position;
    }
    public int getFrequency() {
        return frequency;
    }
}
