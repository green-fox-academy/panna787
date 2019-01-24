import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int step = 15;
        int width = WIDTH;
        int height = 280;

        drawParallelLines(width, height, step, graphics);



    }

    /*public static void drawTriangles(int x, int y, int size, Graphics graphics) {
        graphics.drawLine(x, y, x+size, y);

    }*/

    public static void drawParallelLines(int width, int height, int step, Graphics graphics) {
        for (int i = 0; i < height; i+=step) {
            graphics.drawLine(i/2, height-i, width-i/2, height-i);
        }

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