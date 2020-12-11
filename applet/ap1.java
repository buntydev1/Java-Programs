import java.io.*;
import java.awt.*;
import java.applet.*;

/*<applet code="ap1.class" height="500" width="500">
</applet>
*/
public class ap1 extends Applet {
    public void paint(Graphics p) {
        p.drawLine(0, 0, 500, 0);
        p.drawLine(0, 0, 0, 500);
        p.drawLine(500, 0, 500, 500);
        p.drawLine(0, 500, 500, 500);
        p.drawLine(250, 0, 250, 500);
        p.drawLine(0, 250, 500, 250);
        p.drawLine(500, 0, 0, 500);
        p.drawLine(250, 0, 500, 250);
        p.drawLine(0, 250, 250, 500);
        p.drawLine(50, 50, 200, 50);
        p.drawLine(50, 50, 50, 200);
        p.drawLine(50, 200, 200, 200);
        p.drawLine(200, 200, 200, 50);
        p.drawLine(300, 300, 450, 300);
        p.drawLine(450, 300, 450, 450);
        p.drawLine(450, 450, 300, 450);
        p.drawLine(300, 450, 300, 300);
    }
}
