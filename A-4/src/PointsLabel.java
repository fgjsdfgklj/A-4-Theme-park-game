import javax.swing.*;

public class PointsLabel extends JLabel {
    public static int points = 0;
    private String i = Integer.toString(points);

    PointsLabel() {
        // sets pointsLabel to points
        this.setText(i);
        this.setLocation(1100, 210);
        this.setSize(100, 100);

    }

    public void updateText() {
        this.setText("Test");

    }
    

}
