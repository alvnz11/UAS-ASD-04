public class TransaksiPajak {
    int kode = 0; 
    int bulanBayar;
    long nominalBayar, denda;
    Kendaraan kendaraan;

    public TransaksiPajak(int kode, int bulanBayar, long nominalBayar, long denda, Kendaraan kendaraan) { 
        this.kode++;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }
}
