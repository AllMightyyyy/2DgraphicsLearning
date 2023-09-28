import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JPanel;

import java.awt.*;
import java.swing.*;

public class MyPanel extends JPanel {
    Image image;
    
    MyPanel() {
        image = new ImageIcon("C:\\Users\\zakar\\eclipse-workspace\\newWorkSpace\\2DgraphicsLearning\\src\\sky.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }
    
    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, 0, 0, null);


        g2D.setPaint(Color.BLUE);
        g2D.setStroke(new BasicStroke(10));//thickness of line
        //g2D.drawLine(0, 0, 500, 500);
        //g2D.setPaint(Color.PINK);
        //g2D.drawRect(0, 0, 100, 100);
        //g2D.fill3DRect(0, 0, 100, 100, getFocusTraversalKeysEnabled());
        //g2D.setPaint(Color.ORANGE);
        //g2D.drawOval(0, 0, 100, 100 );
        //g2D.fillOval(0, 0, 100, 100 );
        g2D.setPaint(Color.red);
        //g2D.drawArc(0, 0, 100, 100, 0, 180);
        g2D.fillArc(0, 0, 100, 100, 0, 180);
        //g2d.setPaint(Color.WHITE);
        //g2D.fillArc(0, 0, 100, 100, 180, 180)
       // int[] xPoints = {150, 250, 350};
        //int[] yPoints = {300, 150, 300};
       //g2D.setPaint(Color.yellow);
        //g2D.drawPolygon(xPoints, yPoints, 3);
        //g2D.fillPolygon(xPoints, yPoints, 3);
        //g2D.setPaint(Color.magenta);
        //g2D.setFont(new Font("Ink free", Font.BOLD, 20));
        //g2D.drawString("U R A WINNER", 50, 50);//string is hidden with X:0 and Y:0 (it's OFF SCREEN)

       // g2D.drawImage(image, 0, 0, null);


    }
}
