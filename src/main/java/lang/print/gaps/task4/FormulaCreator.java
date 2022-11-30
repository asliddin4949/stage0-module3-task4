package lang.print.gaps.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,formula;
        System.out.print("a = ");
        a=scanner.nextInt();
        System.out.print("b = ");
        b=scanner.nextInt();
        formula = (9*a*a-5*b+2+a-7)*((a+b-4*a*b)/2);
        System.out.println("formula = " +formula);
    }
}
