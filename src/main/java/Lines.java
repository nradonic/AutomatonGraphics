import java.util.ArrayList;

public class Lines extends ArrayList<DotLine> {

    public DotLine lastLine() {
        return this.get(this.size() - 1);
    }
}
