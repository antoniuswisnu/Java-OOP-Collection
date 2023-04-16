import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.Color.*;
import java.io.IOException;
import java.lang.*;
import java.util.*;

public class Test extends JFrame {
    private Box boxHolder;
    private JPanel scrollPaneContainer;

    Test(int i) {
        super("Test Frame");
        this.setLayout(new BorderLayout());
        this.getContentPane().add(initScrollPane(),BorderLayout.CENTER);
        this.getContentPane().add(initButtonAdd(),BorderLayout.SOUTH);

        for(int j = 0; j < i; j++) {
            boxHolder.add(createPanel());
        }

        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    private Component initButtonAdd() {
        JButton button = new JButton("Recolour");
        button.setBackground(Color.green);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Component comp : boxHolder.getComponents())
                {
                    if (comp instanceof JPanel)
                    {
                        ((JPanel) comp).setOpaque(true);
                        comp.setBackground(Color.gray);
                    }
                }
            }
        });
        return button;
    }

    private Component initScrollPane() {
        scrollPaneContainer = new JPanel( new BorderLayout() );
        boxHolder = Box.createVerticalBox();
        scrollPaneContainer.add(boxHolder, BorderLayout.PAGE_START);
        JScrollPane jSP = new JScrollPane(scrollPaneContainer);
        jSP.getVerticalScrollBar().setUnitIncrement(16);
        return jSP;
    }

    private Component createPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(randomColor());
        panel.setPreferredSize(new Dimension(100,50));
        panel.add(new JLabel("a colored Panel"));
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int indexPosition  = boxHolder.getComponentZOrder(panel);
                try
                {
                    boxHolder.remove(indexPosition);
                }
                catch(Exception ex){}
                try //Will only add here if you have a component in index position 1
                {
                    boxHolder.add(createPanel(),indexPosition);
                }
                catch(Exception ex){}
                scrollPaneContainer.revalidate();
            }
            @Override public void mousePressed(MouseEvent e) {}
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
        });
        return panel;
    }

    private Color randomColor() {
        Random rand = new Random();
        float r = rand.nextFloat() / 2f ;
        float g = rand.nextFloat() / 2f;
        float b = rand.nextFloat() / 2f;
        Color randomColor = new Color(r, g, b);
        return randomColor;
    }

    public static void main(String[] args) {
        new Test(6);
    }
}