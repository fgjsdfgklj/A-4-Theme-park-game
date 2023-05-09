import javax.swing.JFrame;
import java.awt.*;

public class frame extends JFrame{

    frame() {
        // adds frame and its values
        GameLabel backgroundOne = new GameLabel();
Balloon1 label1 = new Balloon1();
        Balloon2 label2 = new Balloon2();
        Balloon3 label3 = new Balloon3();
            Balloon4 label4 = new Balloon4();
PointsLabel points = new PointsLabel();

        this.setSize(1280,1024);
        this.setResizable(false);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(points);
        //add backgrounds last
        this.add(backgroundOne);




this.setTitle("Aimlabs");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        this.setVisible(true);
        // corsshair image import
        Image crosshairpng = Toolkit.getDefaultToolkit().getImage("crosshair.png");
        //set crosshair
        Point p = new Point(0, 0);
        Cursor crosshair = Toolkit.getDefaultToolkit().createCustomCursor(crosshairpng, p, "crosshair");
        backgroundOne.setCursor(crosshair);
        label1.setCursor(crosshair);
        label2.setCursor(crosshair);
        label3.setCursor(crosshair);
            label4.setCursor(crosshair);

    }


}
