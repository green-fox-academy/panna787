import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int triangleWidth = 20;
        int triangleHeight = 18;
        int countBaseLineTriangles = 5;

        drawTriangles(triangleWidth, triangleHeight, countBaseLineTriangles, graphics);
    }

    public static void drawTriangles(int width, int height, int countBaseLineTriangles, Graphics graphics) {
        int x = 0;
        int y = HEIGHT;

        for (int i = 0; i < countBaseLineTriangles; i++) {
            x = 0;
            x += i * width/2;
            for (int j = 0; j < countBaseLineTriangles-i; j++) {

                graphics.drawLine(x, y, x+width, y);
                graphics.drawLine(x+width, y, x+width/2, y-height);
                graphics.drawLine(x+width/2, y-height, x, y);

                x += width;
            }
            y -= height;


        }


    }

    /*public static void drawParallelLines(int width, int height, int step, Graphics graphics) {
        for (int i = 0; i < height; i+=step) {
            graphics.drawLine(i/2, height-i, width-i/2, height-i);
        }

    }*/

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