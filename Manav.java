import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        int ar,el,dm,mu,pa;
        double a = 2.14,e = 3.67,d = 1.11,m = 0.95,p =5.0,toplam;

        Scanner i = new Scanner(System.in);
        System.out.print("Armutun kilosu: ");
        ar = i.nextInt();

        System.out.print("Elmanın kilosu: ");
        el = i.nextInt();

        System.out.print("Domatesin kilosu: ");
        dm = i.nextInt();

        System.out.print("Muzun kilosu: ");
        mu = i.nextInt();

        System.out.print("Patlıcanın kilosu: ");
        pa = i.nextInt();

        toplam = (ar * a) + (el * e) + (dm * d) + (mu * m) + (pa * p);

        System.out.println("Toplam ücret: " + toplam);



    }
}
