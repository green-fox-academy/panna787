import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        Color indigo = new Color(63, 0, 255);
        Color violet = new Color(127, 0, 255);

        Color[] colorList = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, indigo, violet, Color.ORANGE, Color.PINK};

        int size = WIDTH;

        for (int i = 0; i < colorList.length; i++) {
            fillSquare(size, colorList[i], graphics);
            size -= WIDTH/colorList.length;
        }
    }

    public static void fillSquare(int size, Color color, Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(WIDTH/2 - size/2, HEIGHT/2 - size/2, size, size);
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