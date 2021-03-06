package project;

import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Demo {
  int v = 0;

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameA one = new FrameA();
        FrameB two = new FrameB(one);

        one.setVisible(true);
        two.setVisible(true);

        System.out.println(new Demo().v);

      }
    });
  }
}

class FrameA extends JFrame {
  private static final long serialVersionUID = 1812279930292019387L;

  public FrameA() {
    super("Frame A");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    setLocationRelativeTo(null);

    setResizable(false);
  }
}

class FrameB extends JFrame {
  private static final long serialVersionUID = 5126089271972476434L;

  public FrameB(final JFrame otherFrame) {
    super("Frame B");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    setLayout(new GridBagLayout());
    setLocationRelativeTo(otherFrame);
    setVisible(false);

    JButton button = new JButton("Dispose Other");
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        dispose();
      }
    });

    add(button);

    setResizable(false);
  }
}