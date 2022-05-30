package maluevArtem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 *  В программе использованы следующие черты функционального программирования:
 *  - нет использования состояния: final String originalStr;
 *  - чистая функция: splitStr();
 *  - монады: sortWord(), outputList().
 */

public class Main {

    public static void main(String[] args) {

        final String originalStr = "Привет, привет, чужеземец, добро пожаловать на наш остров! Да, на наш остров.";

        String[] modifiedArrStr = splitStr(originalStr);
        List<String> wordList = sortWord(modifiedArrStr);
        outputList(wordList);
    }

    public static String[] splitStr(String str) {
        return str.replaceAll("[.,!]", "").split(" ");
    }

    public static List<String> sortWord(String[] arr) {
        return Arrays.stream(arr).map(s -> s.toLowerCase(Locale.ROOT))
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public static void outputList(List<String> list) {
        list.forEach(System.out::println);
    }
}
