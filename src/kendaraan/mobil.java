package kendaraan;

public class mobil extends vehicle{
    int pintu = 0;
    public mobil(int roda, int bahan_bakar, String merk, String nama_driver, String tipe) {
        super(roda, bahan_bakar, merk, nama_driver, tipe);
        this.pintu = 4;
    }

}
