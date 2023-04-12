import java.awt.*;

public class Ball {

    // Attributes for a ball
    private int size;
    private int xPos;
    private int yPos;
    private int xSpeed = 20;
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
        g.fillOval(xPos, yPos, size, size);
    }

    public void moveBall() {
        xPos += xSpeed;
    }

    // Getters & Setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
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

    public void setBallColor(Color ballColor) {
        this.ballColor = ballColor;
    }
}
