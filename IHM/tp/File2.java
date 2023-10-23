package tp;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class File2 extends JFrame{
    File2(){
        JPanel p = new JPanel();
        this.setTitle("anfel");
        this.setSize(500,500 );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton Button1 =new JButton("click");
        this.getContentPane().add(Button1);
        Button1.setBackground(Color.BLACK);
        Button1.setForeground(Color.pink);
        this.setVisible(true);
    }
}
