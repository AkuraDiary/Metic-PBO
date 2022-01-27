package belajarPolydanAbstract;

public class kalkulator extends perhitungan implements operasi, operasiKompleks{
    @Override
    public int tambah(int a, int b) {
        return a + b;
    }

    @Override
    public double tambah(double a, double b) {
        return a + b;
    }

    public int kali(int a, int b){
        return a * b;
    }
    public double kali(double a, double b){
        return a*b;
    }

    @Override
    public void doSomeMath() {
        System.out.println("DO SOME MATH");
    }

    @Override
    void hitung() {
        System.out.println("Ini method hitung");
    }
}
