package Webinar3.task003;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;

    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.computerWord = generateWord();
        System.out.println("comp: " + computerWord);
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
    }

    @Override
    public Answer inputValue(String value) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                bull++;
                cow++;
            } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }
        currentTry++;
        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;
            System.out.println("Вы выйграли!");
            return new Answer(bull, cow, currentTry);
        }
        if (currentTry >= maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("Кончились попытки.");
            return null;
        }
        return new Answer(bull, cow, currentTry);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateCharList();

    private String generateWord() {
        List<String> charList = generateCharList();
        String result = "";
        Random random = new Random();
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            result += charList.get(randomIndex);
            charList.remove(randomIndex);
        }
        return result;
    }

    // public void logging(Answer answer) throws SecurityException, IOException {
    // FileHandler fh = new FileHandler("log.txt");
    // log.addHandler(fh);
    // SimpleFormatter sFormat = new SimpleFormatter();
    // fh.setFormatter(sFormat);
    // log.info(answer.toString());
    // }
}
