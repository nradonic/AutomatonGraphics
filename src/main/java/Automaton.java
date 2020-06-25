import javax.swing.*;

public class Automaton extends JFrame {


    public static void main(String[] args) {
        Automaton automaton = new Automaton();
        ConfigureJFrame.configure(automaton);
        DotLine dotLine = new DotLine(100);

        Lines lines = new Lines();
        lines.add(dotLine);

        DrawLines(this, lines);

    }



}
