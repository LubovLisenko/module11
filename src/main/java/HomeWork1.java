import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


// Завдання 1​
//
//Метод приймає на вхід список імен. Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими
// іменами, що стоять під непарним індексом (1, 3 тощо)

public class HomeWork1 {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Petro", "Fedir", "Andriy", "Bogdan");
        String result1 = IntStream.range(0, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
        System.out.println("result1 = " + result1);
    }
}
