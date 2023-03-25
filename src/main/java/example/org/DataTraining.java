package example.org;

public class DataTraining {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 7;
        System.out.println("Сумма чисел a+b=" + (a + b));
        System.out.println("Разница чисел а-b=" + (a - b));
        System.out.println("Результат деления a/b=" + (a / b));
        System.out.println("Результат умножения a*b=" + (a * b));
        System.out.println("Получение остатка от деления a/c=" + (a % c));


        boolean result = a == b;
        System.out.println("a==b = " + result);
        boolean newResult = a != b;
        System.out.println("a!=b = " + newResult);
        boolean comparisonResult = a < b;
        System.out.println("a<b = " + comparisonResult);
        boolean newComparisonResult = a > b;
        System.out.println("a>b = " + newComparisonResult);

        boolean d = (10 > 6) && (7 > 5);
        System.out.println("(10>6) && (7>5) = " + d);
        boolean h = (10 > 6) && (7 < 5);
        System.out.println("(10>6) && (7<5) = " + h);
        boolean f = (10 > 6) || (7 < 5);
        System.out.println("(10>6) || (7<5) = " + f);
        boolean i = (10 < 6) ^ (7 > 5);
        System.out.println("(10<6) ^ (7>5) = " + i);
        boolean k = (10 < 6) ^ (7 < 5);
        System.out.println("(10<6) ^ (7<5) = " + k);
        boolean l = (10 > 6);
        System.out.println("10>6 = " + !l);

        byte v = Byte.MAX_VALUE - 1;
        for (byte e = 0; e < 4; e++, v++) {
            System.out.println("Переполнение:" + v);
        }

        int r = 10;
        double w = 4.76;
        System.out.println("Результат умножения int и double = " + r * w);
        System.out.println("Результат деления int и double = " + r / w);
        System.out.println("Результат сложения int и double (значение будет double) = " + (r + w));
        System.out.println("Результат вычитания int и double (значение будет double) = " + (r-w));

    }
}
