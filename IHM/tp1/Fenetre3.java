package tp1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

import javax.swing.BoxLayout;

public class Fenetre3 extends JFrame{
    Fenetre3(){
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.LINE_AXIS));
        p1.add(new JButton("Button 1"));
        //! --------------------
        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.LINE_AXIS));
        p2.add(new JButton("Button 2"));
        p2.add(new JButton("Button 3"));
        //! --------------------
        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.LINE_AXIS));
        p3.add(new JButton("Button 4"));
        p3.add(new JButton("Button 5"));
        p3.add(new JButton("Button 6"));
        //! --------------------
        JPanel p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4, BoxLayout.LINE_AXIS));
        //! --------------------
        p4.add(p1);
        p4.add(p2);
        p4.add(p3);
        //! --------------------
        this.getContentPane().add(p4);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
