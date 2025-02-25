public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String expression = scanner.nextLine();

        String[] parts = expression.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        String operator = parts[1];
        int result = 0;

        try{
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Неверный оператор. Поддерживаются только +, -, *, /");
                return;

        }
        System.out.println("Результат: " + result);

    }catch(NumberFormatException e){
        System.out.println("Неверный аргумент числа" + e);
        return;
        }
*/
        Сalculator calc = new Сalculator();
        calc.input();
    }
}
