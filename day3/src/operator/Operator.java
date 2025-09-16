
public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Operator Matematika
        System.out.println("=== Operator Matematika ===");
        System.out.println("a + b = " + (a + b)); // penjumlahan
        System.out.println("a - b = " + (a - b)); // pengurangan
        System.out.println("a * b = " + (a * b)); // perkalian
        System.out.println("a / b = " + (a / b)); // pembagian
        System.out.println("a % b = " + (a % b)); // modulus

        // Operator Assignment
        System.out.println("\n=== Operator Assignment ===");
        int c = a; // = assignment
        System.out.println("c = " + c);
        c += b; // c = c + b
        System.out.println("c += b → " + c);
        c -= a; // c = c - a
        System.out.println("c -= a → " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2 → " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2 → " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3 → " + c);

        // Operator Increment dan Decrement
        System.out.println("\n=== Operator Increment / Decrement ===");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("d++ = " + (d++)); // post-increment
        System.out.println("setelah d++ → d = " + d);
        System.out.println("++d = " + (++d)); // pre-increment
        System.out.println("d-- = " + (d--)); // post-decrement
        System.out.println("setelah d-- → d = " + d);
        System.out.println("--d = " + (--d)); // pre-decrement

        // Operator Pembanding
        System.out.println("\n=== Operator Pembanding ===");
        System.out.println("a == b → " + (a == b));
        System.out.println("a != b → " + (a != b));
        System.out.println("a > b  → " + (a > b));
        System.out.println("a < b  → " + (a < b));
        System.out.println("a >= b → " + (a >= b));
        System.out.println("a <= b → " + (a <= b));
    }
}
