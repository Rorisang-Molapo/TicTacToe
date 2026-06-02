import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class TIcTacToe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player2_turn;


    TIcTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.getContentPane().setBackground(new Color(20,20,20));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(239, 223, 223));
        textfield.setForeground(new Color(69, 81, 67));
        textfield.setFont(new Font("int free",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Molapo's TicTacToe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,1000,100);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(243, 236, 236));



        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void turn(){

    }

    public void checkwinner(){

    }
    public void xWins(int a, int b, int c){

    }
    public void oWins(int a, int b, int c){

    }
}
