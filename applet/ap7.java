import java.awt.*;
import java.applet.*;

/*<applet code="ap7.class" height="500" width="500">
</applet>
*/
public class ap7 extends Applet {
    public void paint(Graphics p) {
        p.setColor(Color.red);
        p.fillArc(100, 100, 400, 400, 0, 270);
        p.setColor(Color.red);
        p.fillArc(120, 120, 400, 400, 0, -90);
    }
}