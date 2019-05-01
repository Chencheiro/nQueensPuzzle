import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){
        this.setPreferredSize(new Dimension(800, 800));
    }

    public void paint(Graphics g){
        int n = 6;
        int size = 800/n;
        for (int i = 0; i < n; i++) {
            g.setColor(Color.red);
            g.fillRect(size*i, size*i, size, size);
        }
    }

}
