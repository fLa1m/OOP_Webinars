package Webinar3.task003;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws SecurityException, IOException {
        Scanner scanner = new Scanner(System.in, "cp866");
        Logger log = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("D:\\OOP_web\\Webinar3\\task003\\log.txt", true);
        fh.setEncoding("UTF-8");
        log.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        log.setUseParentHandlers(false);
        HashMap<Integer, String> gameMode = new HashMap<>();
        gameMode.put(1, "Числа");
        gameMode.put(2, "Русский алфавит");
        gameMode.put(3, "Английский алфавит");
        gameMode.put(4, "Лог игр");
        System.out.println("Выберите режим игры:");
        System.out.println(gameMode);
        System.out.print(">>> ");
        int select = scanner.nextInt();
        if (select == 4) {
            String inputFileName = "D:\\OOP_web\\Webinar3\\task003\\log.txt";
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(inputFileName), "UTF-8"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line + "\n");
                }
            }

        } else {
            System.out.println("Укажите длину слова:");
            System.out.print(">>> ");
            Integer sizeWord = scanner.nextInt();
            System.out.println("Укажите количество попыток:");
            System.out.print(">>> ");
            Integer maxTry = scanner.nextInt();

            switch (select) {
                case 1:
                    NumberGame numberGame = new NumberGame();
                    log.info("-----------");
                    numberGame.start(sizeWord, maxTry);
                    log.info("Загаданное слово: " + numberGame.computerWord);
                    scanner.nextLine();
                    System.out.println("Угадайте слово!");
                    while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
                        System.out.print("Попытка №" + (numberGame.currentTry + 1) + ": ");
                        String value = scanner.nextLine();
                        Answer answer = numberGame.inputValue(value);
                        log.info("Попытка №" + numberGame.currentTry + ": " + "\n" + "Введенное значание: " + value
                                + "\n" + "Быки: " + answer.bull + ", коровы: "
                                + answer.cow);
                        if (answer != null) {
                            System.out.println("answer = " + answer);
                        }
                    }
                    break;
                case 2:
                    RuGame ruGame = new RuGame();
                    log.info("-----------");
                    ruGame.start(sizeWord, maxTry);
                    log.info("Загаданное слово: " + ruGame.computerWord);
                    scanner.nextLine();
                    System.out.println("Угадайте слово!");
                    while (!ruGame.getGameStatus().equals(GameStatus.FINISH)) {
                        System.out.print("Попытка №" + (ruGame.currentTry + 1) + ": ");
                        String value = scanner.nextLine();
                        Answer answer = ruGame.inputValue(value);
                        log.info("Попытка №" + ruGame.currentTry + ": " + "\n" + "Введенное значание: " + value
                                + "\n" + "Быки: " + answer.bull + ", коровы: "
                                + answer.cow);
                        if (answer != null) {

                            System.out.println("answer = " + answer);
                        }
                    }
                    break;
                case 3:
                    EnGame enGame = new EnGame();
                    log.info("-----------");
                    enGame.start(sizeWord, maxTry);
                    log.info("Загаданное слово: " + enGame.computerWord);
                    scanner.nextLine();
                    System.out.println("Угадайте слово!");
                    while (!enGame.getGameStatus().equals(GameStatus.FINISH)) {
                        System.out.print("Попытка №" + (enGame.currentTry + 1) + ": ");
                        String value = scanner.nextLine();
                        Answer answer = enGame.inputValue(value);
                        log.info("Попытка №" + enGame.currentTry + ": " + "\n" + "Введенное значание: " + value
                                + "\n" + "Быки: " + answer.bull + ", коровы: "
                                + answer.cow);
                        if (answer != null) {
                            System.out.println("answer = " + answer);
                        }
                    }
                    break;

                default:
                    System.out.println("Неправильный ввод.");
                    break;
            }
        }
        scanner.close();
    }
}
