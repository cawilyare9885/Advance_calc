/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javafx.scene.shape.Ellipse;
import javax.swing.JPanel;

/**
 *
 * @author Awil
 */
public class customPanel extends JPanel {

    int Progress = 0;

    public void UpdateProgress(int progress_value) {
        Progress = progress_value;

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.translate(this.getWidth() / 2, this.getHeight() / 2);
        g2.rotate(Math.toRadians(270));
        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        Ellipse2D Circle = new Ellipse2D.Float(0, 0, 110, 110);
        arc.setFrameFromCenter(new Point(0, 0), new Point(120, 120));
        Circle.setFrameFromCenter(new Point(0, 0), new Point(110, 110));
        arc.setAngleStart(1);
        arc.setAngleExtent(-Progress * 3.6);//360/100=3.6
        g2.setColor(Color.red);
        g2.draw(arc);
        g2.fill(arc);
        g2.setColor(Color.WHITE);
        g2.draw(Circle);
        g2.fill(Circle);
        g2.setColor(Color.red);
        g2.rotate(Math.toRadians(90));
        g.setFont(new Font("Verdana", Font.PLAIN, 50));
        FontMetrics fm=g2.getFontMetrics();
        Rectangle2D r=fm.getStringBounds(Progress+"%", g);
        int x=(0-(int)r.getWidth())/2;
        int y=(0-(int)r.getHeight())/2+fm.getAscent();
        
        g2.drawString(Progress+"%", x,y);
        

    }

}
