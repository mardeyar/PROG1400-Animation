import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingPanel extends JPanel {

    private Ball myBall;

    public DrawingPanel() {
        myBall = new Ball(50, 450, 30, 10, Color.BLUE);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                myBall.setxSpeed(-myBall.getxSpeed());
            }
        });

        Timer timer = new Timer(30, e -> moveBall());
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        myBall.drawBall(g);
    }

    public void moveBall() {
        myBall.moveBall();
        // Check if the ball has hit a wall
        if (myBall.getxPos() <= 0 || myBall.getxPos() + myBall.getSize() >= this.getWidth()) {
            // Display game over message and exit program
            JOptionPane.showMessageDialog(this, "GAME OVER");
            System.exit(0);
        }

        // Repaint the panel
        repaint();
    }
}
