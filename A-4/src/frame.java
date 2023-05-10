import javax.swing.JFrame;
import java.awt.*;

public class frame extends JFrame {

        frame() {
                // adds frame, its values and objects
                GameLabel backgroundOne = new GameLabel();
                Balloon1 label1 = new Balloon1();
                Balloon2 label2 = new Balloon2();
                Balloon3 label3 = new Balloon3();
                sign sign1 = new sign();

                this.setSize(1280, 1024);
                this.setResizable(false);
                this.add(label1);
                this.add(label2);
                this.add(label3);
                this.add(Game.pointLabel);
                this.add(sign1);
                // add backgrounds last so everything is above it
                this.add(backgroundOne);

                this.setTitle("Balloon pop");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                this.setVisible(true);
                // corsshair image import
                Image crosshairpng = Toolkit.getDefaultToolkit().getImage("crosshair.png");
                // set crosshair
                Point p = new Point(0, 0);
                Cursor crosshair = Toolkit.getDefaultToolkit().createCustomCursor(crosshairpng, p, "crosshair");
                backgroundOne.setCursor(crosshair);
                label1.setCursor(crosshair);
                label2.setCursor(crosshair);
                label3.setCursor(crosshair);
                sign1.setCursor(crosshair);

        }

}
