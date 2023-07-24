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


}

