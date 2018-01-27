/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeusForms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.PrintStream;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestRedirect {

    public static void main(String[] args) {
        new TestRedirect();
    }

    public TestRedirect() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                CapturePane capturePane = new CapturePane();
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(capturePane);
                frame.setSize(200, 200);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                PrintStream ps = System.out;
                System.setOut(new PrintStream(new StreamCapturer("STDOUT", capturePane, ps)));

                System.out.println("Hello, this is a test");
                System.out.println("Wave if you can see me");
            }
        });
    }
}
