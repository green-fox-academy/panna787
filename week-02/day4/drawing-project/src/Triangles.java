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

    public static void drawTriangles(int triangleWidth, int triangleHeight, int countBaseLineTriangles, Graphics graphics) {
        int x = 0;
        int y = HEIGHT;

        for (int i = 0; i < countBaseLineTriangles; i++) {
            x = 0;
            x += i * triangleWidth/2;
            for (int j = 0; j < countBaseLineTriangles-i; j++) {

                graphics.drawLine(x, y, x+triangleWidth, y);
                graphics.drawLine(x+triangleWidth, y, x+triangleWidth/2, y-triangleHeight);
                graphics.drawLine(x+triangleWidth/2, y-triangleHeight, x, y);

                x += triangleWidth;
            }
            y -= triangleHeight;


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