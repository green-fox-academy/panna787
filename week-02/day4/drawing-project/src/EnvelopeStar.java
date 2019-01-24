import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        int step = 10;
        int b = WIDTH/2;
        int nrOfLines = b/step;


        graphics.setColor(Color.GREEN);

        for (int i = 0; i < nrOfLines; i++) {
            int a = i * step;
            graphics.drawLine(b-a, b, b, a);  //1
            graphics.drawLine(b+a, b, b, a);  //2
        }
        for (int i = 0; i < nrOfLines; i++) {
            int a = i * step;
            graphics.drawLine(b, 2*b-a, b-a, b);  //3
            graphics.drawLine(b, 2*b-a, a+b, b );  //4
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