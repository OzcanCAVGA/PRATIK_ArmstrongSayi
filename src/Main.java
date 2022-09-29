import java.util.Scanner;

/*
Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
 */
public class Main {
    public static void main(String[] args) {
        Scanner yazici = new Scanner(System.in);
        int sayi, basamakSayisi = 1, deger, count = 1, armstrongBulucu = 0;
        System.out.println("Sayinizi girin: ");
        sayi = yazici.nextInt();
        int temp = sayi;
        //basamak sayisini bulma
        while (temp / 10 > 0) {

            basamakSayisi++;
            temp /= 10;
        }


        //basamak degerleri
        for (int i = 1; i <= basamakSayisi; i++) {
            count = count * 10;
            deger = (sayi % count) / (int) (Math.pow(10, i - 1));

            armstrongBulucu+= (int) Math.pow(deger, basamakSayisi);

        }
        if (sayi==armstrongBulucu)
            System.out.println("Sayiniz armstrong sayidir");
        else
            System.out.println("Maalesef sayiniz armstrong degildir");
    }
}
