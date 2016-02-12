import java.util.LinkedList;

public class Calculator4 extends Calculator3 implements WorkWithMemory{
    Calculator4(LinkedList<Object> rpn) {
        super(rpn);
    }

    private float memory = 0;

    @Override
    public void clearMemory() {
        memory = 0;
        System.out.println("Memory was cleaned!");
    }

    @Override
    public void putInMemory(Float number) {
        memory = number;
    }

    @Override
    public void addToMemory(Float number) {
        memory += number;
    }

    @Override
    public void subtractFromMemory(Float number) {
        memory -= number;
    }

    @Override
    public Float getFromMemory() {
        return memory;
    }
}
