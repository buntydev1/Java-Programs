import java.awt.*;
import java.applet.*;

/*<applet code="ap10.class" height="1000" width="1000">
</applet>
*/
public class ap10 extends Applet {
    public void paint(Graphics p) {
        p.drawRect(100, 50, 700, 700);
        p.drawRect(150, 300, 200, 250);
        p.drawRect(150, 550, 450, 35);
        p.drawRect(150, 585, 550, 35);
        p.drawRect(150, 620, 625, 35);
        p.drawLine(250, 150, 150, 300);
        p.drawLine(250, 150, 350, 300);
        p.drawLine(250, 150, 250, 75);
        p.drawLine(250, 75, 350, 100);
        p.drawLine(350, 100, 250, 125);
        p.drawRect(200, 375, 100, 175);
    }
}
