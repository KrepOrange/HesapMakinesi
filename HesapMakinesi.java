import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        //variable
        int number1, number2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();
        System.out.print("Toplama için '1'\nÇıkarma için '2'\nÇarpma için '3'\nBölme için '4'\nİşleminiz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama işleminizin sonucu = " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma işleminizin sonucu = " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma işleminizin sonucu = " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0)
                    System.out.println("Bölme işleminizin sonucu = " + ((double) number1 / number2));
                else
                    System.out.println("Sayılar 0'a bölünemez!");
                break;
            default:
                System.out.println("Yanlış tuşlama yaptınız. Tekrar deneyiniz!");
        }
    }
}
