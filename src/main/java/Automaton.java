import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Automaton extends JFrame {

    static Lines lines = new Lines();
    static int generation = 1;
    static final int rule = 30;

    public static void main(String[] args) throws InterruptedException {
        initLines();

        Automaton automaton = new Automaton();
        ConfigureJFrame.configure(automaton, rule);

        for(int i=0;i<256;i++) {
            calculateANewLine(automaton,i);
            TimeUnit.MILLISECONDS.sleep(100);
            initLines();
            TimeUnit.MILLISECONDS.sleep(100);

        }
    }

    private static void initLines() {
        DotLine dotLine = new DotLine(100);
        dotLine.set(49, new Square(Square.black));

        lines.add(dotLine);
    }

    private static void calculateANewLine(Automaton automaton, int rule) throws InterruptedException {

        ProcessRule processRule = new ProcessRule(rule);
        automaton.setTitle("Automaton " + rule);


        for (int i = 1; i < lines.get(0).size; i++) {
//            TimeUnit.MILLISECONDS.sleep(500);

            DotLine nextLine = processRule.next(lines.lastLine());
            lines.add(nextLine);
            automaton.repaint();
        }
    }

    public void paint(Graphics g) {
        DrawLines.paint(g, lines);
    }
}
