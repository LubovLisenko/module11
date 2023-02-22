import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

//Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
// Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
public class HomeWork2 {
    public static void main(String[] args) {
        List <String> names = List.of("Ivan", "Petro", "Fedir", "Andriy", "Bogdan");
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("result = " + result);

  }
}