package dramaRating.View;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.TreeMap;

//import statements
//Check if window closes automatically. Otherwise add suitable code
class Display2 extends JFrame {


    //TreeMap<String, Double> displayTreemap = new TreeMap<>();

    public static void main(String args[]) {
        //new Display2();
    }
    Display2(Object object) {
        JLabel jlbHelloWorld = new JLabel(object.toString());
        add(jlbHelloWorld);
        this.setSize(275, 120);
        // pack();
        setVisible(true);

        JFrame jfrm = new JFrame("Display : simple swing app");

        // Give the frame an initial size.
        jfrm.setSize(275, 100);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label.
        JLabel jlab1 = new JLabel("Drama ranking");
    }

}