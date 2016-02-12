import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Type name of file with example:");
        Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        in.close();
        Selector selector1 = new Selector(c);

/*
        Reader reader = new Reader(); //creates new File reader

        Calculator4 calc = new Calculator4(RPN.convert(reader.read("Calculator1.txt"))); //creates new exemplar of Calculator 4
        System.out.println("Result: "+calc.getResult());
        calc.addToMemory(calc.getResult());
        System.out.println("Data in memory: "+calc.getFromMemory());
        calc.addToMemory(calc.getResult());
        System.out.println("Data in memory: "+calc.getFromMemory());
        calc.subtractFromMemory((float)4);
        System.out.println("Data in memory: "+calc.getFromMemory());
        calc.clearMemory();
        System.out.println("Data in memory: "+calc.getFromMemory());
*/



    }
}
