package kendaraan;

public class vehicle {
    private int roda = 0;
    private int bahan_bakar = 0;
    public String merk = "";
    public String nama_driver = "";

    public vehicle(int roda, int bahan_bakar, String merk, String nama_driver){
        this.roda = roda;
        this.merk = merk;
        this.bahan_bakar = bahan_bakar;
        this.nama_driver = nama_driver;
    }

    public void gas(int value){
        for(int i = 0; i<=value; i++){
            System.out.println("ngeeng");
        }
    }
    public void rem(int value){
        for(int i = 0; i<=value; i++){
            System.out.println("ciiit");
        }
    }

    public void status() {
        System.out.println("Merk : " + this.merk);
        System.out.println("Driver : " + this.nama_driver);
        System.out.println("bbm : " + bahan_bakar);
        System.out.println("roda" + this.roda);
    }
}
