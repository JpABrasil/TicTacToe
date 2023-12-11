import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Window Configuration
        JFrame myWindow = new JFrame("TicTacToe Game");
        myWindow.setSize(800,800);

        //Creating Buttons
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton();
        JButton btn4 = new JButton();
        JButton btn5 = new JButton();
        JButton btn6 = new JButton();
        JButton btn7 = new JButton();
        JButton btn8 = new JButton();
        JButton btn9 = new JButton();
        //BackGround Color for Buttons
        btn1.setBackground(Color.WHITE);
        btn2.setBackground(Color.WHITE);
        btn3.setBackground(Color.WHITE);
        btn4.setBackground(Color.WHITE);
        btn5.setBackground(Color.WHITE);
        btn6.setBackground(Color.WHITE);
        btn7.setBackground(Color.WHITE);
        btn8.setBackground(Color.WHITE);
        btn9.setBackground(Color.WHITE);

        //GridLayout configuration
        GridLayout myGridLayout =  new GridLayout(3,3);
        myWindow.setLayout(myGridLayout);
        myWindow.setVisible(true);


        //Appending Buttons in the Grid Layout
        myWindow.add(btn1);myWindow.add(btn2);myWindow.add(btn3);myWindow.add(btn4);myWindow.add(btn5);
        myWindow.add(btn6);myWindow.add(btn7);myWindow.add(btn8);myWindow.add(btn9);

        //Close when close the window
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Showing the content
        myWindow.setVisible(true);
    }
}