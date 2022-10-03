// Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, min = 1, max = 1;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        for(int i = 1; i<=n; i++){

            System.out.print(i+". sayıyı giriniz: ");
            sayi = input.nextInt();

            if (i==1){
                min = sayi;
                max = sayi;
            }

            if (sayi > max){
                max = sayi;
            }

            if (sayi < min){
                min = sayi;
            }

        }

        System.out.println("en küçük sayı:"+ min);
        System.out.println("en büyük sayı:"+ max);

    }
}