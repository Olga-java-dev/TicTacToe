import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting game!");
        Thread.sleep(1000L);
        System.out.print("3..");
        Thread.sleep(1000L);
        System.out.print("2..");
        Thread.sleep(1000L);
        System.out.println("1..");
        JFrame window = new JFrame("TicTacToe");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        TicTacToe game = new TicTacToe();
        window.add(game);
        System.out.println("End!");
    }
}
