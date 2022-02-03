package kendaraan;

public class motor extends vehicle {

    public motor(int roda, int bahan_bakar, String merk, String nama_driver, String tipe) {
        super(roda, bahan_bakar, merk, nama_driver, tipe);
    }

    @Override
    public void rem(int value) {
        for(int i = 0; i<=value; i++){
            System.out.println("setttttt");
        }
    }
}
