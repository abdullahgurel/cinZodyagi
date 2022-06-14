import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dTarihi;

        System.out.print("Doğum Tarihiniz: ");
        dTarihi = input.nextInt();


        if (dTarihi % 12 == 0) {
            System.out.println("Maymun");
        } else if (dTarihi % 12 == 1) {
            System.out.println("Horoz");
        }else if (dTarihi % 12 == 2) {
            System.out.println("Köpek");
        }else if (dTarihi % 12 == 3) {
            System.out.println("Domuz");
        }else if (dTarihi % 12 == 4) {
            System.out.println("Fare");
        }else if (dTarihi % 12 == 5) {
            System.out.println("Öküz");
        }else if (dTarihi % 12 == 6) {
            System.out.println("Kaplan");
        }else if (dTarihi % 12 == 7) {
            System.out.println("Tavşan");
        }else if (dTarihi % 12 == 8) {
            System.out.println("Ejderha");
        }else if (dTarihi % 12 == 9) {
            System.out.println("Yılan");
        }else if (dTarihi % 12 == 10) {
            System.out.println("At");
        }else if (dTarihi % 12 == 11) {
            System.out.println("Koyun");
        }else {
            System.out.println("Hatalı Giriş");
        }

    }
}
