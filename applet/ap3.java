
import java.io.*;
import java.awt.*;
import java.applet.*;

/*<applet code="ap3.class" height="500" width="500">
</applet>
*/
public class ap3 extends Applet {
    public void paint(Graphics p) {
        p.setColor(Color.red);
        p.fillRect(100, 100, 400, 400);
        p.setColor(Color.orange);
        p.fillRect(150, 150, 350, 350);
        p.setColor(Color.yellow);
        p.fillRect(200, 200, 300, 300);
        p.setColor(Color.green);
        p.fillRect(250, 250, 250, 250);
        p.setColor(Color.pink);
        p.fillRect(300, 300, 200, 200);
        p.setColor(Color.blue);
        p.fillRect(350, 350, 150, 150);
        p.setColor(Color.yellow);
        p.fillRect(400, 400, 100, 100);
    }
}