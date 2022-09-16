public class Main {
    public static void main(String[] args) throws Exception {
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacak = 6;
        boolean varmi = false;
        for (var sayi : sayilar) {
            if (sayi == aranacak) {
                varmi = true;
                break;
            }
        }

        if (varmi) {
            System.out.println("sayi mevcuttur");
        } else {
            System.out.println("sayi mevcut değildir");
        }
    }
}
