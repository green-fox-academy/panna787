import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        for (int i = 0; i <= WIDTH; i+=20) {
            int x1 = i;
            int y1 = 0;
            lineDraw(x1, y1, graphics);
            int x2 = 0;
            int y2 = i;
            lineDraw(x2, y2, graphics);
            int x3 = WIDTH;
            int y3 = i;
            lineDraw(x3, y3, graphics);
            int x4 = i;
            int y4 = WIDTH;
            lineDraw(x4, y4, graphics);
        }



    }

    public static void lineDraw(int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, WIDTH/2, HEIGHT/2);
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