package belajarPolydanAbstract;

public class test {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Hewan kucingAnggora = new Kucing();

        hewan.makeSound();
        kucingAnggora.makeSound();

        kalkulator Kalkulator = new kalkulator();

        System.out.println(Kalkulator.tambah(1 , 2));
        System.out.println(Kalkulator.tambah(2.5, 2.5));

        System.out.println(Kalkulator.kali(2.5, 2.5));

    }
}
