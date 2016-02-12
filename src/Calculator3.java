import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.LinkedList;

public class Calculator3 extends Calculator1{
    Calculator3(LinkedList<Object> rpn) {
        super(rpn);
    }

    @Override
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
            } else if (o.equals("sin")){
                sin(stack);
            } else if (o.equals("exp")) {
                exp(stack);
            } else if (o.equals("sqrt")) {
                sqrt(stack);
            }
        return stack.get(0);
    }

    protected void sin(LinkedList<Float> stack){
        Float a = stack.removeLast();
        stack.add((float) Math.sin(Math.toRadians(a)));
    }

    protected void exp(LinkedList<Float> stack){
        Float a = stack.removeLast();
        stack.add((float) Math.exp(a));
    }

    protected void sqrt(LinkedList<Float> stack){
        Float a = stack.removeLast();
        stack.add((float) Math.sqrt(a));
    }

}
