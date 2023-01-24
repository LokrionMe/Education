package Java.sem3;

import java.util.Scanner;

public class Checker {
    Scanner scanner = new Scanner(System.in);
    ConsoleView view = new ConsoleView();

    public int CheckNumber(int numb, int minValue, int maxValue) {
        while (true) {
            if (scanner.hasNextInt()) {
                numb = scanner.nextInt();
                if (numb < 0) {
                    view.ShowString("Number must be > 0");
                } else if ((numb >= minValue) && (numb <= maxValue)) {
                    return numb;
                } else {
                    view.ShowString("Number must be between " + minValue + " and " + maxValue);
                }
            } else {
                view.ShowString("It must be a number");
                scanner.next();
            }
        }
    }

    public String InputString(String str) {
        view.ShowString(str);
        return scanner.next();
    }

    public int InputInt(String str) {
        while (true) {
            view.ShowString(str);
            if (scanner.hasNextInt()) {
                int numb = scanner.nextInt();
                if (numb < 0) {
                    view.ShowString("Number must be > 0");
                } else {
                    return numb;
                }
            } else {
                System.out.println("It must be a number");
                scanner.next();
            }
        }
    }
}
