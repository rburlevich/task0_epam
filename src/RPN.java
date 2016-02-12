import java.util.LinkedList;

// this class creates Reverse Polish notation
public class RPN {

    private static int priority(String str) {
        switch (str) {
            case "(":
            case ")":
                return 0;
            case "-":
            case "+":
                return 1;
            case "*":
            case "/":
                return 2;
            case "sin":
            case "exp":
            case "sqrt":
                return 3;
            default:
                return -1;
        }
    }

    private static String lastDataInStack(LinkedList<String> stack) {
        if (stack.isEmpty()) {
            return "Stack is empty";
        } else {
            return stack.getLast();
        }

    }

    public static LinkedList<Object> convert(LinkedList<String> startList) {
        LinkedList<String> stack = new LinkedList<String>();
        LinkedList<Object> queue = new LinkedList<Object>();
        for (String str : startList) {
            if ((str.equals("-") || str.equals("+") || str.equals("/") || str.equals("*") || str.equals("sin") ||
                    str.equals("exp") || str.equals("sqrt") || str.equals("(") || str.equals(")")) == false) {
                queue.add(Float.valueOf(str));
            } else if (priority(str) > priority(lastDataInStack(stack))) {
                stack.add(str);
            } else if(priority(str)<=priority(lastDataInStack(stack)) & str.equals(")") == false) {
                if (str.equals("(")){
                    stack.add(str);
                } else {
                    for (int i = stack.size() - 1; i >= 0; i--) {
                        if (priority(str) <= priority(lastDataInStack(stack))) {
                            queue.add(stack.removeLast());
                        }
                    }
                    stack.add(str);
                }
            } else if (str.equals(")")){
                while (lastDataInStack(stack).equals("(")!= true){
                    queue.add(stack.removeLast());
                }
                stack.removeLast();
            }
        }
        for (int i = stack.size() - 1; i >= 0; i--) {
            queue.add(stack.remove(i));
        }
        return queue;
    }
}
