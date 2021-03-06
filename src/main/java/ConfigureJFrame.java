import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class ConfigureJFrame {

    public static void configure(JFrame jFrame, int rule) {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Automaton " + rule);
        Border b = BorderFactory.createBevelBorder(BevelBorder.RAISED);

        JPanel jPanel1 = new JPanel();
        jPanel1.setBorder(b);
        jFrame.add(jPanel1);

        Dimension dimension = new Dimension(1000, 1000);
        jFrame.setMinimumSize(dimension);
        jFrame.getContentPane().add(jPanel1);
        jFrame.pack();

        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }


}
