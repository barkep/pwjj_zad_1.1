import javax.swing.*;

public class Window {

    JFrame jFrame;
    Window(){
        jFrame = new JFrame();
        String dane = JOptionPane.showInputDialog("Napisz coś: ");
        JOptionPane.showMessageDialog(jFrame,"Zamieniłem wszystkie litery na duże:\n"+dane.toUpperCase());
        System.exit(1);
    }
}
