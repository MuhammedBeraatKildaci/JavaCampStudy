public class Main {
    public static void main(String[] args) throws Exception {
        // for loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti.");

        // while loop
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while döngüsü bitti.");

        // do-While loop
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("do-While döngüsü bitti.");
    }
}
