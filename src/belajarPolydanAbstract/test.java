package belajarPolydanAbstract;

public class test {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Hewan kucingAnggora = new Kucing();
        ayam jago = new ayam();

        Hewan[] kandang = {hewan, kucingAnggora, jago};

        kandang[0].makeSound();
        kandang[1].makeSound();
        kandang[2].makeSound();
        jago.methodAyam();

        kalkulator Kalkulator = new kalkulator();

        System.out.println(Kalkulator.tambah(1 , 2));
        System.out.println(Kalkulator.tambah(2.5, 2.5));

        System.out.println(Kalkulator.kali(2.5, 2.5));

    }
}
