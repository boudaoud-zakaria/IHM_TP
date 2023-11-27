package tp1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JMenu;

public class Fenetre5 extends JFrame{
    Fenetre5(){
        this.setTitle("tp3");
        this.setSize(323 , 380);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("file");
        JMenu menu2 = new JMenu("file 2");
        JMenu menu3 = new JMenu("file 3");
        
        menu.add(new JMenuItem("new file 1"));
        menu.add(new JMenuItem("open file 1"));
        menu.add(new JMenuItem("close file 1"));

        menu2.add(new JMenuItem("new file 2"));
        menu2.add(new JMenuItem("open file2"));
        menu2.add(new JMenuItem("close file2"));

        menu3.add(new JMenuItem("new file 3"));
        menu3.add(new JMenuItem("open file3"));
        menu3.add(new JMenuItem("close file3"));

        bar.add(menu);
        bar.add(menu2);
        bar.add(menu3);
        this.setJMenuBar(bar);

        JLabel text = new JLabel("50 +");
        text.setBounds(0, 0, 300, 30);
        text.setFont(new Font("Monospaced", Font.BOLD, 20));
        text.setHorizontalAlignment(JTextField.RIGHT);
        text.setForeground(Color.BLUE);
        this.add(text);

        JTextField input = new JTextField("25");
        input.setBounds(10, 30, 292, 40);
        input.setEditable(false);
        input.setHorizontalAlignment(JTextField.RIGHT);
        input.setFont(new Font("Monospaced", Font.BOLD, 20));
        input.setBackground(Color.LIGHT_GRAY);
        this.add(input);

        // this.setBackground(Color.black);
        JButton button7 = new JButton("7");
        button7.setFont(new Font("Monospaced", Font.BOLD, 17));
        button7.setBackground(Color.gray);
        button7.setForeground(Color.white);
        JButton button8 = new JButton("8");
        button8.setFont(new Font("Monospaced", Font.BOLD, 17));
        button8.setBackground(Color.gray);
        button8.setForeground(Color.white);
        JButton button9 = new JButton("9");
        button9.setFont(new Font("Monospaced", Font.BOLD, 17));
        button9.setBackground(Color.gray);
        button9.setForeground(Color.white);
        JButton buttonplus = new JButton("+");
        buttonplus.setFont(new Font("Monospaced", Font.BOLD, 17));
        buttonplus.setBackground(Color.black);
        buttonplus.setForeground(Color.white);
        JButton buttonC = new JButton("c");
        buttonC.setFont(new Font("Monospaced", Font.BOLD, 17));
        buttonC.setBackground(Color.red);
        buttonC.setForeground(Color.white);
        button7.setBounds(10 , 80 , 50 , 50);
        button8.setBounds(70, 80, 50, 50);
        button9.setBounds(130, 80, 50, 50);
        buttonplus.setBounds(190, 80, 50, 50);
        buttonC.setBounds(250, 80, 50, 50);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(buttonplus);
        this.add(buttonC);
        
        JButton button4 = new JButton("4");
        button4.setFont(new Font("Monospaced", Font.BOLD, 17));
        button4.setBackground(Color.gray);
        button4.setForeground(Color.white);
        JButton button5 = new JButton("5");
        button5.setFont(new Font("Monospaced", Font.BOLD, 17));
        button5.setBackground(Color.gray);
        button5.setForeground(Color.white);
        JButton button6 = new JButton("6");
        button6.setFont(new Font("Monospaced", Font.BOLD, 17));
        button6.setBackground(Color.gray);
        button6.setForeground(Color.white);
        JButton buttonM = new JButton("-");
        buttonM.setFont(new Font("Monospaced", Font.BOLD, 17));
        buttonM.setBackground(Color.black);
        buttonM.setForeground(Color.white);
        JButton buttonF = new JButton("<-");
        buttonF.setFont(new Font("Monospaced", Font.BOLD, 13));
        buttonF.setBackground(Color.orange);
        buttonF.setForeground(Color.white);
        button4.setBounds(10 , 140 , 50 , 50);
        button5.setBounds(70, 140, 50, 50);
        button6.setBounds(130, 140, 50, 50);
        buttonM.setBounds(190, 140, 50, 50);
        buttonF.setBounds(250, 140, 50, 50);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(buttonM);
        this.add(buttonF);

        JButton button1 = new JButton("1");
        button1.setFont(new Font("Monospaced", Font.BOLD, 17));
        button1.setBackground(Color.gray);
        button1.setForeground(Color.white);
        JButton button2 = new JButton("2");
        button2.setFont(new Font("Monospaced", Font.BOLD, 17));
        button2.setBackground(Color.gray);
        button2.setForeground(Color.white);
        JButton button3 = new JButton("3");
        button3.setFont(new Font("Monospaced", Font.BOLD, 17));
        button3.setBackground(Color.gray);
        button3.setForeground(Color.white);
        JButton buttonMul = new JButton("*");
        buttonMul.setFont(new Font("Monospaced", Font.BOLD, 17));
        buttonMul.setBackground(Color.black);
        buttonMul.setForeground(Color.white);
        JButton buttonE = new JButton("=");
        buttonE.setFont(new Font("Monospaced", Font.BOLD, 17));
        buttonE.setBackground(Color.black);
        buttonE.setForeground(Color.white);
        button1.setBounds(10 , 200 , 50 , 50);
        button2.setBounds(70, 200, 50, 50);
        button3.setBounds(130, 200, 50, 50);
        buttonMul.setBounds(190, 200, 50, 50);
        buttonE.setBounds(250, 200, 50, 110);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(buttonMul);
        this.add(buttonE);
        
        JButton button0 = new JButton("0");
        button0.setFont(new Font("Monospaced", Font.BOLD, 17));
        button0.setBackground(Color.gray);
        button0.setForeground(Color.white);
        JButton buttonP = new JButton(".");
        buttonP.setFont(new Font("Monospaced", Font.BOLD, 17));
        buttonP.setBackground(Color.gray);
        buttonP.setForeground(Color.white);
        JButton buttonD = new JButton("/");
        buttonD.setFont(new Font("Monospaced", Font.BOLD, 17));
        buttonD.setBackground(Color.black);
        buttonD.setForeground(Color.white);
        button0.setBounds(10 , 260 , 110 , 50);
        buttonP.setBounds(130, 260, 50, 50);
        buttonD.setBounds(190, 260, 50, 50);
        this.add(button0);
        this.add(buttonP);
        this.add(buttonD);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
