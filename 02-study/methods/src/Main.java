public class Main {
    public static void main(String[] args) throws Exception {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
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
            mesajVer("sayi mevcuttur: " + aranacak);
        } else {
            mesajVer("sayi mevcut değildir: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
