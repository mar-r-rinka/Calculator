public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        boolean d = calc.isPositive.test(a);
        int e = calc.multiply.apply(a, b);
        int f = calc.pow.apply(e);

        calc.println.accept(c);
        calc.println.accept(a);
        calc.printlnB.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);

    }
}