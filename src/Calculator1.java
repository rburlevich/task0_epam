import java.util.LinkedList;

public class Calculator1 {
    LinkedList<Object> rpn;
    Calculator1(LinkedList<Object> rpn){
        this.rpn = rpn;
    }

    public float getResult(){
        LinkedList<Float> stack = new LinkedList<Float>();
        for (Object o : rpn)
            if (o instanceof Float) {
                stack.add((Float) o);
            } else if (o.equals("+")){
                addition(stack);
            } else if (o.equals("-")){
                subtraction(stack);
            } else if (o.equals("*")){
                multiplication(stack);
            } else if (o.equals("/")){
                division(stack);
            }
        return stack.get(0);
    }

    protected void addition(LinkedList<Float> stack){
        Float a = stack.removeLast();
        Float b = stack.removeLast();
        stack.add(a+b);
    }

    protected void subtraction(LinkedList<Float> stack){
        Float a = stack.removeLast();
        Float b = stack.removeLast();
        stack.add(b-a);
    }

    protected void multiplication(LinkedList<Float> stack){
        Float a = stack.removeLast();
        Float b = stack.removeLast();
        stack.add(a*b);
    }

    protected void division(LinkedList<Float> stack){
        Float a = stack.removeLast();
        Float b = stack.removeLast();
        stack.add(b/a);
    }


}
