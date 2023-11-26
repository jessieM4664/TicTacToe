import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {
    
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfeild = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfeild.setBackground(new Color(25,25,25));
        textfeild.setForeground(new Color(25,255,0));
        textfeild.setFont(new Font("Ink Free", Font.BOLD,75));
        textfeild.setHorizontalAlignment(JLabel.CENTER);
        textfeild.setText("Tic-Tac-Toe");
        textfeild.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);
        frame.add(textfeild);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void firstTurn() {

    }

    public void check() {

    }

    public void xWins(int a, int b, int c) {

    }
    
    public void oWins(int a, int b, int c) {

    }


}
