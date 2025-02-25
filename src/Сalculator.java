import java.util.Scanner;
public class Сalculator {
    public void input() {
        Scanner scanner = new Scanner(System.in);
        String expression = "";
        while (expression != " ") {
            System.out.println("Введите выражение: ");
            expression = scanner.nextLine();

            try {
                String[] parts = expression.split(" ");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[2]);
                String operator = parts[1];
                int result = 0;
                result = calculator(num1, num2, operator, result);

            }catch (NumberFormatException e){
                System.out.println("Неверный аргумент числа " + e);
                break;
            }
        }
    }

    public int calculator(int num1, int num2, String operator, int result) {
        try {
            switch (operator) {
                case "+":
                    result = plus(num1, num2);
                    break;
                case "-":
                    result = minus(num1, num2);
                    break;
                case "*":
                    result = multiplication(num1, num2);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = division(num1, num2);
                    } else {
                        System.out.println("Ошибка: деление на ноль!");
                        break;
                    }
                    break;

            }
            System.out.println("Результат: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Неверный аргумент числа" + e);
        }
        return result;
    }
    public int plus(int num1,int num2){
        return num1 + num2;
    }
    public int minus(int num1,int num2){
        return num1 - num2;
    }
    public int multiplication(int num1,int num2){
        return num1 * num2;
    }
    public int division(int num1,int num2){
        return num1 / num2;
    }
}
