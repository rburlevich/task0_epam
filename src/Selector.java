import java.util.LinkedList;

public class Selector {

    LinkedList<String> initialData;
    int typeOfCalc;

    Selector(String fileName){
        Reader reader = new Reader();
        initialData = reader.read(fileName);
        getCalcType();
        printingOfInitialData();
        System.out.println("Solving:");
        System.out.println("Calculator # " + typeOfCalc);
        printExample();
        calcSelector();
    }

    private void printingOfInitialData(){
        System.out.println("Initial data:");
        System.out.println(typeOfCalc);
        for (String str : initialData){
            System.out.println(str);
        }
    }

    private void getCalcType() {
        typeOfCalc = Integer.parseInt(initialData.remove(0));
    }

    private void printExample(){
        for (String str : initialData){
            System.out.print(str);
        }
        System.out.print("=");
    }

    private void calcSelector(){
        LinkedList<Object> list = RPN.convert(initialData);
        if (typeOfCalc == 1){
            Calculator1 calc1 = new Calculator1(list);
            System.out.print(calc1.getResult());
        } else
        if (typeOfCalc == 2){
            Calculator1 calc2 = new Calculator2(list);
            System.out.print(calc2.getResult());
        } else
        if (typeOfCalc == 3){
            Calculator1 calc3 = new Calculator3(list);
            System.out.print(calc3.getResult());
        } else
        if (typeOfCalc == 4){
            Calculator1 calc4 = new Calculator4(list);
            System.out.print(calc4.getResult());
        } else System.out.println("\nCalculator # " + typeOfCalc + " doesn't exist. It's possible to select 1, 2, 3 or 4 type of calculator. Please select one of them.");

    }





}
