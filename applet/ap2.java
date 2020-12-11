import java.io.*;
import java.awt.*;
import java.applet.*;

/*<applet code="ap2.class" height="500" width="500">
</applet>
*/
public class ap2 extends Applet {
    public void paint(Graphics p) {
        p.setColor(Color.yellow);
        p.fillOval(100, 100, 400, 400);
        p.setColor(Color.black);
        p.drawOval(170, 195, 70, 70);
        p.drawOval(360, 195, 70, 70);
        p.setColor(Color.black);
        p.fillOval(175, 220, 60, 47);
        p.fillOval(365, 220, 60, 47);
        p.drawLine(300, 230, 270, 345);
        p.drawLine(270, 345, 320, 345);
        p.drawLine(245, 370, 345, 370);
        p.setColor(Color.black);
        p.fillArc(220, 340, 150, 100, 0, -180);

    }
}