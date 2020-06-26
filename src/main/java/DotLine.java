import java.util.ArrayList;

public class DotLine extends ArrayList<Square> {
    int size = 1;
    int center = 0;

    DotLine(int size) {
        this.size = size;
        if (size < 1) {
            return;
        }
        for (int i = 1; i <= size; i++) {
            this.add(new Square(Square.white));
        }
        center = size / 2;
    }

    public void setPoint(int x, int value) {
        if (x < 0 || x >= size) {
            return;
        }
        if (value == 0) {
            this.set(x, new Square(Square.black));
            return;
        }
        this.set(x,new Square(Square.white));
    }
}
