package tp1;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;

public class Fenetre2 extends JFrame{
    Fenetre2(){
        GridLayout gl = new GridLayout(3 , 2);
        // this.setLayout(gl);
        this.setSize(500,500); // 500px * 500px
        this.setTitle("MY GridLayout page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gl.setHgap(5); // 5px
        gl.setVgap(5); // 5px
        this.getContentPane().add(new JButton("1"));
        this.getContentPane().add(new JButton("2"));
        this.getContentPane().add(new JButton("3"));
        this.getContentPane().add(new JButton("4"));
        this.getContentPane().add(new JButton("5"));
        this.setVisible(true);
    }
}
