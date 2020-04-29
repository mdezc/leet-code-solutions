package GenerateParenthesis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesis {

    public static void main(String[] args) {
        List<String> result = generateParenthesis(4);
        assert result.size() == 14;
    }

    private static List<String> generateParenthesis(int n) {
        return new ArrayList<>(backtrack(n, 0, 0, ""));
    }

    private static List<String> backtrack(int parenthesisNum, int left, int right, String currentString) {
        if (parenthesisNum * 2 == currentString.length()) {
            return Collections.singletonList(currentString);
        }
        Set<String> temp = new HashSet<>();
        if (left < parenthesisNum) {
            temp.addAll(backtrack(parenthesisNum, left + 1, right, currentString + "("));
        }
        if (left > right) {
            temp.addAll(backtrack(parenthesisNum, left, right + 1, currentString + ")"));
        }
        return new ArrayList<>(temp);
    }
}
