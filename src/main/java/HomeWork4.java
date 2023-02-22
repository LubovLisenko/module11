import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork4 {

    public static long a;
    public static long c;
    public static double m;


    public void lyamda(long a, int c, long m){
        Stream <Long>  stream = Stream.iterate(0L, x -> (a * x + c) % m);
                 stream
                .limit(5)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
    public static void main(String[] args) {
        HomeWork4 task4 = new HomeWork4();
        long a = 25214903917L;
        int c = 11;
        long m = (long)Math.pow(2, 48);
        System.out.println("m = " + m);
        task4.lyamda(a,c, m );

    }
}
