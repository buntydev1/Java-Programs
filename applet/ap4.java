import java.io.*;
import java.awt.*;
import java.applet.*;

/*<applet code="ap4.class" height="500" width="500">
</applet>
*/
public class ap4 extends Applet {
    public void paint(Graphics p) {
        p.setColor(Color.red);
        p.fillRect(100, 100, 500, 500);
        p.setColor(Color.orange);
        p.fillRect(150, 150, 400, 400);
        p.setColor(Color.yellow);
        p.fillRect(200, 200, 300, 300);
        p.setColor(Color.green);
        p.fillRect(250, 250, 200, 200);
        p.setColor(Color.pink);
        p.fillRect(300, 300, 100, 100);
        p.setColor(Color.blue);
        p.fillRect(325, 325, 50, 50);
    }
}
