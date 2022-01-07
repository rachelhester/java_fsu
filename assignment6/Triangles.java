//FSUID: rah18b
//Class: CGS3416

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rachel Hester: Triangles");
        TrianglePanel panel = new TrianglePanel();
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    static class TrianglePanel extends JPanel {
        public TrianglePanel() {
            super();
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            int maxHeight = getHeight();
            int maxWidth = getWidth();
            Random rand = new Random();
            
            for(int i = 0; i < 5; i++) {
                g2d.setPaint(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
                int[] xPoints = {rand.nextInt(maxWidth),rand.nextInt(maxWidth),rand.nextInt(maxWidth)};
                int[] yPoints = {rand.nextInt(maxHeight),rand.nextInt(maxHeight),rand.nextInt(maxHeight)};
                
                Polygon p = new Polygon(xPoints, yPoints, 3);
                g2d.draw(p);
                g2d.fill(p);
            }
        }
    }
}