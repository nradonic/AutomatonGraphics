import java.awt.*;

public class DrawLines {

    public static void paint(
            Graphics g,
            Lines lines) {

        g.clearRect(0, 0, g.getClipBounds().width, g.getClipBounds().height);

        int width = g.getClipBounds().width;
        int stepW = width / lines.get(0).size;
        int count = lines.get(0).size;
        int buffer = (g.getClipBounds().width - count * stepW) / 2;

        g.clearRect(0, 0, g.getClipBounds().width, g.getClipBounds().height);
        g.setColor(Color.BLACK);

        int index = 0;
        int header = 30;

        for (DotLine line : lines) {
            paintLine(g, stepW, buffer, line, index * stepW + header);
            index += 1;
        }
    }

    private static void paintLine(
            Graphics g,
            int stepW,
            int buffer,
            DotLine line,
            int y) {

        for (int i = 0; i < line.size; i++) {
            int x = i * stepW + buffer;
            if (line.get(i).value == Square.black) {
                g.fillRect(x, y, stepW, stepW);
            }
        }
    }
}
