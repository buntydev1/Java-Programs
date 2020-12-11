
import java.io.*;
import java.awt.*;
import java.applet.*;

/*<applet code="ap5.class" height="500" width="500">
</applet>
*/
public class ap5 extends Applet {
    public void paint(Graphics p) {
        p.drawRect(100, 100, 400, 400);
        p.drawLine(300, 100, 300, 500);
        p.drawLine(100, 300, 500, 300);
        p.setColor(Color.blue);
        p.fillRect(300, 100, 200, 200);
        p.setColor(Color.red);
        p.fillRect(325, 125, 150, 140);
        p.setColor(Color.orange);
        p.fillRect(350, 150, 100, 90);
        p.setColor(Color.yellow);
        p.fillRect(375, 175, 50, 40);
        p.setColor(Color.red);
        p.fillRect(100, 300, 200, 200);
        p.setColor(Color.yellow);
        p.fillRect(125, 325, 150, 150);
        p.setColor(Color.green);
        p.fillOval(150, 350, 100, 100);
        p.setColor(Color.green);
        p.fillRect(100, 100, 200, 200);
        p.setColor(Color.black);
        p.drawLine(150, 100, 100, 150);
        p.drawLine(200, 100, 100, 200);
        p.drawLine(250, 100, 100, 250);
        p.drawLine(300, 100, 100, 300);
        p.drawLine(300, 150, 150, 300);
        p.drawLine(300, 200, 200, 300);
        p.drawLine(300, 250, 250, 300);
        p.setColor(Color.yellow);
        p.fillRect(300, 300, 200, 200);
        p.setColor(Color.red);
        p.fillOval(300, 300, 200, 200);
        p.setColor(Color.orange);
        p.fillOval(325, 325, 150, 150);
    }
}