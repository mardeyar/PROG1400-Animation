import java.awt.*;

public class Ball {

    // Attributes for a ball
    private int size;
    private int xPos;
    private int yPos;
    private int xSpeed;
    private Color ballColor;

    // Constructor
    public Ball(int size, int xPos, int yPos, int xSpeed, Color ballColor) {
        this.size = size;
        this.xPos = xPos;
        this.yPos = yPos;
        this.xSpeed = xSpeed;
        this.ballColor = ballColor;
    }

    public void drawBall(Graphics g) {
        g.setColor(getBallColor());
        g.fillOval(xPos, yPos, size, size);
    }

    public void moveBall() {
        xPos += xSpeed;
    }

    // Getters & Setters
    public int getSize() {
        return size;
    }

    public int getxPos() {
        return xPos;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public Color getBallColor() {
        return ballColor;
    }
}
