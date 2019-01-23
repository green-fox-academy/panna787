import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics g) {
        // Draw a box that has different colored lines on each edge.
        g. setColor(Color.BLUE);
        g.drawLine(10, 10, 10, 80);

        g. setColor(Color.GREEN);
        g.drawLine(10, 80, 300, 80);

        g. setColor(Color.YELLOW);
        g.drawLine(300, 80, 300, 10);

        g. setColor(Color.ORANGE);
        g.drawLine(300, 10, 10,10);



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}