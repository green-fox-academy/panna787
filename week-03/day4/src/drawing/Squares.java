package drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

    public static void mainDraw(Graphics graphics){

        int n = 3;
        drawSquares(n, graphics);
    }

    public static void drawSquares(int numberOfSquaresInARow, Graphics graphics){
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0,0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);

        int size = WIDTH/numberOfSquaresInARow;
        for (int i = 0; i < numberOfSquaresInARow; i++) {
            for (int j = 0; j < numberOfSquaresInARow; j++) {
                graphics.drawRect(j*size, i*size, size, size);

            }

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