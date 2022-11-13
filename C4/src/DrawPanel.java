
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();


        g.drawLine(0, 0, width, height);
        g.drawLine(10, 0, width, height);
        g.drawLine(20, 0, width, height);
        g.drawLine(30, 0, width, height);
        g.drawLine(0, height, width, 0);
        g.drawLine(0, height, width, 10);
        g.drawLine(0, height, width, 20);
        g.drawLine(0, height, width, 30);

    }
}
