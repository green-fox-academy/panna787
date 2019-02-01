package drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0,0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);

        int x = 0;
        int y = 0;
        int size = WIDTH;
        int steps = 5;

        drawSquares(x, y, size, steps, graphics);

    }

    public static void drawSquares(int baseX, int baseY, int size, int steps, Graphics graphics){
        int squareSize = size/3;

        graphics.drawLine(baseX+squareSize, baseY, baseX+squareSize, baseY+size);
        graphics.drawLine(baseX+squareSize*2, baseY, baseX+squareSize*2, baseY+size);
        graphics.drawLine(baseX, baseY+squareSize, baseX+size, baseY+squareSize);
        graphics.drawLine(baseX, baseY+squareSize*2, baseX+size, baseY+squareSize*2);

        if(steps > 0){
            drawSquares(baseX+squareSize, baseY, size/3, steps - 1, graphics);
            drawSquares(baseX, baseY+squareSize, size/3, steps - 1, graphics);
            drawSquares(baseX+squareSize*2, baseY+squareSize, size/3, steps - 1, graphics);
            drawSquares(baseX+squareSize, baseY+squareSize*2, size/3, steps - 1, graphics);
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