import java.util.HashMap;

public class ProcessRule {

    static HashMap<Integer, Integer> ruleMap = new HashMap<>();

    public DotLine next(DotLine lastLine) {

        DotLine result = new DotLine(lastLine.size);

        if (lastLine.size < 3) {
            return lastLine;
        }

        for (int i = 1; i < lastLine.size - 3; i++) {
            int total = lastLine.get(i - 1).value * 4 +
                    lastLine.get(i).value * 2 +
                    lastLine.get(i + 1).value;

            result.set(i, new Square(ruleMap.get(total)));
        }
        result.set(lastLine.size - 1, new Square(Square.white));

        return result;
    }

    ProcessRule(int rule) {
        ruleMap.put(0, (rule & 1));
        ruleMap.put(1, (rule & 2) >> 1);
        ruleMap.put(2, (rule & 4) >> 2);
        ruleMap.put(3, (rule & 8) >> 3);
        ruleMap.put(4, (rule & 16) >> 4);
        ruleMap.put(5, (rule & 32) >> 5);
        ruleMap.put(6, (rule & 64) >> 6);
        ruleMap.put(7, (rule & 128) >> 7);
    }
}
