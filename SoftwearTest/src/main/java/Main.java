import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //create JFrame or map
        Map map = new Map();
        JFrame frame = new JFrame();
        AlertSystem alertSystem = new AlertSystem();
        frame.setTitle("MAP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        map.setSize(600, 600);
        frame.setVisible(true);

        frame.add(map);
        LocationSystem ls = new LocationSystem();
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
            Thread.sleep(1000);
            map.repaint();
            map.getDistance();
            if(map.getDistance()<60){
                alertSystem.alertAKeeper();
            }

        }

        System.out.println("aa");









    }
}
