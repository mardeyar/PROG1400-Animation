import javax.swing.*;

public class MainFrame extends JFrame {

    private DrawingPanel drawingPanel;
    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 1000, 700);
        drawingPanel = new DrawingPanel();
        add(drawingPanel);
        setVisible(true);
    }
}
