import java.util.Scanner;

public class Main {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("+------------------------------------------------------+");
        System.out.println("|-----------------------  MENU ------------------------|");
        System.out.println("|------------------------------------------------------|");
        System.out.println("| 1. Daftar Kendaraan                                  |");
        System.out.println("| 2. Bayar Pajak                                       |");
        System.out.println("| 3. Tampilkan Seluruh Transaksi                       |");
        System.out.println("| 4. Urutkan Transaksi Berdasarkan Nama Pemilik        |");
        System.out.println("| 5. Keluar                                            |");
        System.out.println("+------------------------------------------------------+");
        System.out.print("Pilih(1-5): ");
        int menu = sc.nextInt();
        return menu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DLL dll = new DLL();
        
        dll.add(new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
        dll.add(new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3));
        dll.add(new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2));
        dll.add(new Kendaraan("B 1234 AG", "Sia", "Motor", 150, 2020, 1));
        
        while (true) {
            int menu = menu();
            switch (menu) {
                case 1:
                dll.print();
                break;

                case 2:
                    System.out.println("Bayar Pajak");
                break;

                case 3:
                    System.out.println("Tampilkan Seluruh Transaksi");
                break;

                case 4:
                    System.out.println("Urutkan Transaksi Berdasarkan Nama Pemilik");
                break;

                case 5:
                    System.exit(0);
                break;
            }
        }
    }
}
