import java.io.*;
import java.awt.*;
import java.applet.*;

/*<applet code="ap6.class" height="500" width="500">
</applet>
*/
public class ap6 extends Applet {
    public void paint(Graphics p) {
        p.setColor(Color.green);
        p.fillOval(100, 100, 750, 600);
        p.setColor(Color.orange);
        p.fillOval(175, 175, 650, 475);
        p.setColor(Color.red);
        p.fillOval(275, 270, 510, 300);
        p.setColor(Color.blue);
        p.fillOval(540, 380, 225, 100);
        /*
         * p.setColor(Color.yellow); p.fillOval(250,250,450,400);
         */
    }
}
