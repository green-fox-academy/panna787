package triangles;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        graphics.drawLine(0, 0, WIDTH, 0);
        graphics.drawLine(WIDTH, 0, WIDTH/2, HEIGHT);
        graphics.drawLine(WIDTH/2, HEIGHT, 0, 0);

        int x = 0;
        int y = 0;

        drawTriangle(x, y, WIDTH/2, graphics);




    }

    public static void drawTriangle(int baseX, int baseY, int size, Graphics graphics){
        graphics.drawLine(baseX+size/2, baseY+size, baseX+size+size/2, baseY+size);
        graphics.drawLine(baseX+size+size/2, baseY+size, baseX+size, baseY);
        graphics.drawLine(baseX+size, baseY, baseX+size/2, baseY+size);

        if (size > size/8) {
            drawTriangle(baseX, baseY, size/2, graphics);


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
