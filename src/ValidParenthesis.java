import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParenthesis {

    public boolean validParenthesis(String s){
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Deque<Character> stack = new ArrayDeque<>(){
        };
        for (char ch : s.toCharArray()) {

            if (map.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || map.get(stack.pop()) != ch) {
                    return (false);

                }
            }
        }

        return (stack.isEmpty());



    }
}
