public class Home {
    public static void main(String[] args) {

        System.out.println("This was printed from home");

        int counter = 0;
        while (counter >= 0) {
            counter++;
        }
        System.out.println("final counter: " + counter);




        int a = 5;
        int b = 20;
        while (a < 20 && b > 0) {
            a++;
            b--;
            if (b > 5) {
                b /= 2;
            }
        }


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int x = 30;
        int y = 10;
        int z = 5;
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);

        while ((y != 0) && (x / y >= 0)) {
            x += 2;
            y -= 2;
            if (x % z != 0) {
                z--;
            }
            System.out.println("x: " + x + ", y: " + y + ", z: " + z);
        }

        WhileLoopFun fun = new WhileLoopFun();

        System.out.println("-- test printDigits --");
        fun.printDigits(5);
        System.out.println("---");
        fun.printDigits(361);
        System.out.println("---");
        fun.printDigits(98000);
        System.out.println("---");
        fun.printDigits(150856);

        System.out.println("-- test countLetter --");
        System.out.println(fun.countLetter("apple", "a"));
        System.out.println(fun.countLetter("apple", "z"));
        System.out.println(fun.countLetter("babababa", "a"));
        System.out.println(fun.countLetter("babababa", "b"));
        System.out.println(fun.countLetter("excellente", "e"));
        System.out.println(fun.countLetter("rawrrrrrr", "r"));

        System.out.println("-- test maxDoubles --");
        System.out.println(fun.maxDoubles(4, 20));
        System.out.println(fun.maxDoubles(2, 65));
        System.out.println(fun.maxDoubles(5, 500));
        System.out.println(fun.maxDoubles(2, 64));
        System.out.println(fun.maxDoubles(2, 63));
        System.out.println(fun.maxDoubles(8, 10));
        System.out.println(fun.maxDoubles(8, 5));
        System.out.println(fun.maxDoubles(10, 456000));

        System.out.println("-- test isPrime --");
        System.out.println(fun.isPrime(2));
        System.out.println(fun.isPrime(13));
        System.out.println(fun.isPrime(773));
        System.out.println(fun.isPrime(9857));
        System.out.println(fun.isPrime(101879));
        System.out.println(fun.isPrime(1));
        System.out.println(fun.isPrime(14));
        System.out.println(fun.isPrime(30));
        System.out.println(fun.isPrime(771));
        System.out.println(fun.isPrime(93243));




    }
}
