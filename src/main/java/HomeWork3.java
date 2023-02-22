import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Є масив:
//
//["1, 2, 0", "4, 5"]
//
//Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:
//
//"0, 1, 2, 4, 5"
public class HomeWork3 {
    public static void main(String[] args) {
//        List <String> list = List.of("A, F, B", "D, C");
//        List<String> rest = list.stream().map(str -> List.of(str.split(", ")))
//                .flatMap(Collection::stream)
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println("rest = " + rest);

     String [] array = new String[] {"1, 2, 0", "4, 5"};
     String result = Stream.of(array)
                     .map(str -> List.of(str.split(", ")))
                     .flatMap(Collection::stream)
                     .sorted()
                     .collect(Collectors.joining(", "));
        System.out.println("result = " + result);


    }
}
