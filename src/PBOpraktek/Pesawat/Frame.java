package PBOpraktek.Pesawat;

import gamepesawat.background;

import java.awt.Component;
import javax.swing.JFrame;
public class Frame extends JFrame {
    public Frame() {
        Component add;
        add = add(new background());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setTitle("Battle Planes");
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}