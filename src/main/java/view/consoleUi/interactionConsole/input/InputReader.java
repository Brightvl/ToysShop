package view.consoleUi.interactionConsole.input;




import java.util.Scanner;

public class InputReader  {
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }



    /**
     * Проверяет веденные пользователем данные, являются ли они целыми числами
     *
     * @param line входная строка
     * @return boolean
     */
    public boolean checkLineOnNumbers(String line) {
        return line.matches("[0-9]+");
    }

    public String  nextLine() {
        return scanner.nextLine();
    }

    /**
     * Ввод для пользователя с сообщением
     * @param message
     * @return
     */
    public String inputLn(String message) {
        System.out.println(message);
        return nextLine();
    }

    public String input(String message) {
        System.out.print(message);
        return nextLine();
    }

}

