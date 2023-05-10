import java.awt.Color;

import javax.swing.*;

public class PointsLabel extends JLabel {
    private int points = 0;
    // for the start of the game so the label is originally 0
    private String i = Integer.toString(points);

    PointsLabel() {
        // sets pointsLabel to points at start
        this.setText(i);
        this.setLocation(1100, 210);
        this.setSize(100, 100);
        this.setForeground(Color.GREEN);
    }

    // updates the text for the points label and adds the amount of points
    public void updatePoints(int p) {
        points += p;
        String i = Integer.toString(points);
        this.setText(i);

    }

}
