import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(8);

        System.out.print(numbers);
        List<Integer> oddno = new ArrayList<>();
        for (Integer num : numbers){
            if ( num % 2 != 0){
                oddno.add(num);
            }
        }// normal way of finding odd num
        System.out.print("\n"+oddno);//
        //odd no. finder with streams
        //Stream<Integer> stream = numbers.stream();
        Predicate<Integer> oddp = n -> n % 2 != 0;
        oddno = numbers.stream().filter(oddp).collect(Collectors.toList());//stream are use on collections in fiter we provide predicate and then collect the resut in a list by using collect
        System.out.print("\n"+oddno);
        List<Integer> output = numbers.stream().map(input -> input * 3).collect(Collectors.toList());
        System.out.print("\noutput with map fuction : "+output);
        List<String> fruits = new ArrayList<>();
        fruits.add("peach");
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("pineapple");
        fruits.add("banana");
        System.out.println(fruits.stream().map(f -> f.length()).collect(Collectors.toList()));// print length of fruit
        System.out.println(fruits.stream().filter(f -> f.length() > 5).collect(Collectors.toList())); //filters fruit with length greater than 5
        System.out.println(fruits.stream().filter(f -> f.length() > 5).map(f -> f.length()).collect(Collectors.toList()));
        Long m = fruits.stream().filter(f -> f.length() > 5).count();
        System.out.println(m);
        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));//.distinct can use for distinct elements. it removes duplicate elements
        System.out.println(numbers.stream().sorted((e1,e2) -> (e2.compareTo(e1))).collect(Collectors.toList()));//custom descending sort
        List<String> alphanum = Arrays.asList("A21","a34","a53","g54");
        List<String> strlist = alphanum.stream().map(i->i.toLowerCase()).filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(strlist);
        alphanum.stream().filter(input ->{
            System.out.println(input);
            return input.startsWith("A");
        });//wont print because filter is a lazy method
        alphanum.stream().map(String :: toUpperCase).filter(e-> e.startsWith("A")).skip(1).collect(Collectors.toList()).forEach(System.out :: println);
        //skips the number of elements
        //peek helps in debugging it shows the data after particular opertion
        Integer min =numbers.stream().min((a,b)->{return a.compareTo(b);}).get();
        System.out.println(min);
        Integer max =numbers.stream().max((a,b)->{return a.compareTo(b);}).get();
        System.out.println(max);
        int[] a = {2,4,6,8,3,2};
        IntStream jf = Arrays.stream(a);
        Stream s1 = Stream.of(a);
        Stream s2 = Stream.of(1,23,6,56,52,15);
        Stream s3 = Stream.concat(s1,s2);
        //String buffer is thread safe and string builder is not
        //string buffer is less efficient and string builder is more efficient
        StringBuffer buffer=new StringBuffer("hello");
        buffer.append("java");
        StringBuilder builder=new StringBuilder("hello");
        buffer.append("java");
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        Locale locale1 = new Locale("ENGLISH", "US", "WIN");
        System.out.println("Locale1 name: " + locale1);
        System.out.println("String representation of Locale1: " + locale1.toString());





    }
}
