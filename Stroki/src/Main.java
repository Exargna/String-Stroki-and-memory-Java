import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Стек(Stack) это краткосрочная память в java, которая хранит в себе примитивы и вызовы методов.
        //Стек работает по правилу LIFO - Last in first out(Последний вошел, первый вышел)
        //Это значит, что последний введеный элемент будет выводиться первым, а первый элемент последним
        //Преимущества стека, в том, что с помощью него можно получить быстрый доступ к примитивам и вызову методов
        //Куча(Heap) в ней хранятся обьекты.
        String input = new Scanner(System.in).nextLine();
        String s = "123";
        Integer i = 123;
        Human human = new Human("Мирас", 17);
        //Как сделать из строки число:
        Integer test = Integer.parseInt(s);
        System.out.println(test + 1);
        //Как сделать из числа строку:
        String test1 = String.valueOf(i);
        System.out.println(test1 + 1);
        //Как вычислить последний символ и вывести его в консоль
        int lastNum = Integer.parseInt(String.valueOf(input.charAt(input.length()-1)));
        System.out.println(lastNum);

    }
}