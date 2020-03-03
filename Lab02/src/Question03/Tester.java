package Question03;

public class Tester {

    public static void main(String[] args) {
        int b = 7;
        System.out.println("Array Implementation");
        System.out.println("Player 1 draws " + b + " times");
        ArrayUno<String> a = new ArrayUno<>(b);
        a.draw();
        System.out.println(a.toString());
        System.out.println("Array Implementation");
        System.out.println("Player 2 draws " + b + "times");
        ArrayUno<String> c = new ArrayUno<>(b);
        c.draw();
        System.out.println(c.toString());
        System.out.println("Linked List Implementation");
        System.out.println("Player 1 draws " + b + " times");
        LinkedListUno<String> d = new LinkedListUno<>(b);
        d.draw();
        System.out.println(d.toString());
        System.out.println("Linked List Implementation");
        System.out.println("Player 2 draws " + b + " times");
        LinkedListUno<String> e = new LinkedListUno<>(b);
        e.draw();
        System.out.println(e.toString());
    }
}
