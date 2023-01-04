public class keliling {
    private double nilaiR;
    private double nilaiPhi;
    private double luasLingkaran;

    public void hitungLuasDanKeliling() {
        this.luasLingkaran = nilaiPhi * nilaiR * nilaiR;
        this.kelilingLingkaran = 2 * nilaiPhi * nilaiR;

        System.out.println("Luas Lingkaran : " + luasLingkaran);
        System.out.println("keliling Lingkaran : " + kelilingLingkaran);

    }

    class main {

    public static void main(String[] args) throws Eception {
        keliling keliling = new keliling();
        keliling.setNilaiR(nilaiR: 40.0);
        System.out.println(keliling.getNilaiR());
        keliling.hitungLuasDanKeliling();
    }
}
