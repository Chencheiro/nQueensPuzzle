import javax.swing.*;

public class Frame extends JFrame {
    public Frame(){
        super("'N' Queens puzzle");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        this.add(panel);

        this.pack();
        setLocationRelativeTo(null);
    }

    /*public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setResizable(false);
    }*/
}
