import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {try { return (x / y);} catch (ArithmeticException e) {
        System.out.println("На ноль делить нельзя");};return 0;}; // b == 0, возникает арифметическая ошибка.

   /* Я не уверена, что правильно возвращать ноль. Но там ведь Integer. Не понимаю как правильно сделать.
    Если не Try/catch, то возможно просто тернарный оператор (x,y) -> (y==0)? null : x/y;
    Но так тоже ошибка.. Помогитееееееее*/

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    Consumer<Boolean> printlnB = System.out::println;


}
