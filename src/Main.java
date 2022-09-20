import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer placeHolderUserInput = 0;
        boolean correctAnswer;
        boolean continueTranslating = true;
        List<Integer> numberList = new ArrayList<>();

        //filling the numberlist
        for (Integer i = 0; i < 10; i++) {
            numberList.add(i);
        }

        //filling the alfabeticlist
        String[] alfabeticNumber = {"nul", "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};

        Translator translator = new Translator(numberList, alfabeticNumber);

        while (continueTranslating) {

            do {
                System.out.println("Hallo meneer de peer, welk getal tussen de 0 en 10 wilt u geschreven zien staan? ");
                try {
                    placeHolderUserInput = userInput.nextInt();

                    //checking if input is between 0 and 10
                    if (0 <= (int) placeHolderUserInput && 10 > placeHolderUserInput) {
                        correctAnswer = true;
                    } else {
                        System.out.println("U heeft geen getal tussen de 0 en 10 ingevuld. Probeer het opnieuw");
                        correctAnswer = false;
                    }
                } catch (NoSuchElementException e) {
                    System.out.println("U heeft geen getal tussen de 0 en 10 ingevuld. Probeer het opnieuw");
                    correctAnswer = false;
                    userInput.nextLine();//workaround to reset the scanner
                }
            }
            while (!correctAnswer);

            System.out.println(placeHolderUserInput + " kan je uitschrijven en dat ziet het er zo uit: " + translator.translate(placeHolderUserInput));

            //asking if user want to do it again
            System.out.println("\n\nWilt u nog een keer een getal tussen de 0 en de 10 laten uitschrijven?\n1.Ja 2.Nee");
            do {
                try {
                    placeHolderUserInput = userInput.nextInt();

                    switch (placeHolderUserInput) {
                        case 1:
                            correctAnswer = true;
                            continueTranslating = true;
                            break;
                        case 2:
                            correctAnswer = true;
                            continueTranslating = false;
                            break;
                        default:
                            correctAnswer = false;
                            System.out.println("Type een 1 voor ja of 2 voor nee in");
                    }
                } catch (NoSuchElementException e) {
                    System.out.println("Type een 1 voor ja of 2 voor nee in");
                    correctAnswer = false;
                    userInput.nextLine();//workaround to reset the scanner
                }
            }
            while (!correctAnswer);


        }
    }
}