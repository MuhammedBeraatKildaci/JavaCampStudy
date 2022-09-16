public class Main {
    public static void main(String[] args) throws Exception {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";
        // ogrenciler[4] = "Ali";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("------------------------------------------------");

        for (var ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
