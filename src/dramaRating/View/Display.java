package dramaRating.View;

import javax.swing.*;

public class Display {

   public Display() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("Display : simple swing app");

        // Give the frame an initial size.
        jfrm.setSize(275, 100);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label.
        JLabel jlab1 = new JLabel("Drama ranking");

       //JLabel jlab2 = new JLabel("Drama ranking");

        // Add the label to the content pane.
        jfrm.add(jlab1);

        // Display the frame.
        jfrm.setVisible(true);


    }


    public void showSwingComponent(){
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Display();

            }
        });

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new EventDemo();
            }
        });
    }
}