//FSUID: rah18b
//Class: CGS3416

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Circles {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rachel Hester: Circles");
        CirclePanel panel = new CirclePanel();
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    static class CirclePanel extends JPanel {
        public CirclePanel() {
            super();
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            for(int i = 0; i < 8; i++) {
                g2d.drawOval((100 - ((i + 1) * 10)), (100 - ((i + 1) * 10)),(i + 3) * 20,(i + 3) * 20);
            }
        }
    }
}

