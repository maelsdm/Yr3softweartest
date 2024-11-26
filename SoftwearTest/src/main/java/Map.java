import objectpackage.Drone;
import objectpackage.Keeper;
import objectpackage.Lion;
import objectpackage.Things;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Map extends Canvas {
    private ArrayList<objectpackage.Things> things;
    private ArrayList<Integer>numbers;
    private ArrayList<Integer>Freq;
    private LocationSystem ls = new LocationSystem();
    private Keeper keeper1;
    private Lion lion1;
    private Drone drone1;
    private int Distance;

    public Map() throws IOException {
        things = new ArrayList<>();
        numbers = new ArrayList<>();
        Freq = new ArrayList<>();
        keeper1 = new Keeper(4392, "Geoff", ls.getCoords(80));
        lion1 = new Lion(4392, "Geoff", ls.getCoords(30));
        drone1 = new Drone(128, "Monitor1", ls.getCoords(124));


        things.add(keeper1);
        things.add(lion1);
        things.add(drone1);

        numbers.add(keeper1.getNumber());
        Freq.add(drone1.getFrequency());

        Point P1 = keeper1.getPosition();
        Point P2 = lion1.getPosition();
        Distance = (int) Math.hypot(P1.getX() - P2.getX(),P1.getY() - P2.getY());

    }


    public int getDistance() {
        return Distance;
    }


    @Override
    public void paint(Graphics g) {
        // Iterate over each shape in the ArrayList and draw it
        for (Things things : things) {
            things.draw(g);

            // Calls the specific draw method for each shape type
        }
    }

    @Override
    public void repaint() {
        super.repaint();

    }


}
