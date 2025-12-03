import java.util.Scanner;

public class nilaimahasiswa13 {
        public static void angray(int[] nilai) {
        Scanner jvk = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + " = ");
            nilai[i] = jvk.nextInt();
        }
    }

    public static void nampilin(int[] nilai) {
        System.out.println("\ndaftar nilai mahasiswa =");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("mahasiswa " + (i + 1) + " = " + nilai[i]);
        }
    }

    public static int totallz(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa = ");
        int N = jvk.nextInt();

        int[] nilai = new int[N];

        angray(nilai);
        nampilin(nilai);
        
        int totalNilai = totallz(nilai);
        System.out.println("\ntotal nilai mahasiswa = " + totalNilai);
    }
}

