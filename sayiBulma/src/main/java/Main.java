public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9};
        int aranacak = 10;
        boolean varMi = false;

        // aranacak olan sayım sayıların içerisind evar mı yok mu ?

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayı mevcuttur!");
        }else {
            System.out.println("Sayı mevcut değildir!");
        }


    }
}