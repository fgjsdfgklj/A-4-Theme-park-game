import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

public class Balloon4 extends JLabel {
    private int balloonLocationX;
    private int balloonLocationY;
    private ImageIcon imageIcon;
    private Image image;
    Balloon4() {
        // sizes and sets up image for Balloon Label
        imageIcon = new ImageIcon("crosshair.png");
        image = imageIcon.getImage();
        imageIcon = new ImageIcon(image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
        //setting Balloon label
        this.setIcon(imageIcon);
        this.setLocation(balloonLocationX, balloonLocationY);
        this.setSize(100, 100);
        //checking if clicked
        this.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                PointsLabel.points -= 2;
                System.out.println(PointsLabel.points);


            }


            public void mousePressed(MouseEvent e) {

            }


            public void mouseReleased(MouseEvent e) {

            }


            public void mouseEntered(MouseEvent e) {

            }


            public void mouseExited(MouseEvent e) {

            }
        });
        start();
    }

    public void start() {
        //adds the balloon only after certain amount of time

        addBalloon();
    }



    public void addBalloon() {
        //random x and y coordinates for next spawn point between those min and max values
        balloonLocationX = (int) (Math.random() * ((900-250) +1) + 250);
        balloonLocationY = (int) (Math.random() * ((800-100) +1) + 100);
        this.setLocation(balloonLocationX, balloonLocationY);
        //timer to spawn this in every 10 seconds
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);

    }
}


