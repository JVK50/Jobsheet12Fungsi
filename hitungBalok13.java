import java.util.Scanner;
public class hitungBalok13 {
    static int hitungLuas(int pjg, int lbr) {
        int luas = pjg * lbr;
        return luas;
    }
    static int hitungVolume(int a, int b, int tgi) {
        int volume = hitungLuas(a, b) * tgi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang balok: ");
        p = jvk.nextInt();
        System.out.print("Masukkan lebar balok: ");
        l = jvk.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        t = jvk.nextInt();

        L = hitungLuas(p, l);
        vol = hitungVolume(p, l, t);
        
        System.out.println("Luas permukaan balok: " + L);
        System.out.println("Volume balok: " + vol);

        jvk.close();
    }
}
