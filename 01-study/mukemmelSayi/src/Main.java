public class Main {
    public static void main(String[] args) throws Exception {
        int number = 5;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("mükemmel sayidir");
        } else {
            System.out.println("mükemmel sayi değildir");
        }
    }
}
