import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        // Draw full canvas

        int step = 20;
        int nrOfLines = WIDTH/step;
        int maxSize = WIDTH;

        graphics.setColor(new Color(178, 0, 250));
        for (int i = 0; i < nrOfLines; i++) {
            int a = i * step;
            int b = 0;

            graphics.drawLine(a, b, maxSize, a);
        }

        graphics.setColor(Color.GREEN);
        for (int i = 0; i < nrOfLines; i++) {
            int a = 0;
            int b = i * step;

            graphics.drawLine(a, b, b, maxSize);
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
