package tp1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;


public class Fenetre extends JFrame{
    Fenetre(){
        JPanel pan = new JPanel();
        pan.setBackground(Color.ORANGE);
        this.setContentPane(pan);
        this.setVisible(true);
        //! add title on my page 
        this.setTitle("MY Jpanel page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //! create new button 
        JButton bouton1 = new JButton("Click ME");

        bouton1.setBackground(Color.white);
        //! change text color 
        bouton1.setForeground(Color.orange);
        //! add the button on my page 
        pan.add(bouton1);
        //?*******************
        this.setLayout(new BorderLayout());
        this.getContentPane().add(bouton1 , BorderLayout.CENTER);
        this.getContentPane().add(new Button("nirth") , BorderLayout.NORTH);
        this.getContentPane().add(new Button("south")  , BorderLayout.SOUTH);
        this.getContentPane().add(new Button("west")  , BorderLayout.WEST);
        this.getContentPane().add(new Button("east")  , BorderLayout.EAST);
    }
}
