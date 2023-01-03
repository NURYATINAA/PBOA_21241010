class Mahasiswa{
    String nama;
    String NIM;
    String Prodi;
    String Fakultas;
    double IPK;

}

public class App {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa MHS = new Mahasiswa();

        MHS.nama = "Ningsih";
        MHS.NIM = "21241090";
        MHS.Prodi = "PTI";
        MHS.Fakultas = "FSTT";
        MHS.IPK = 3.67;

        System.out.println(MHS.nama);
        System.out.println(MHS.NIM);
        System.out.println(MHS.Prodi);
        System.out.println(MHS.Fakultas);
        System.out.println(MHS.IPK);
        
        
        Mahasiswa mhs2 = new Mahasiswa();

        mhs2.nama = "Tya";
        mhs2.NIM = "21241014";
        mhs2.Prodi = "Kesmas";
        mhs2.Fakultas = "FPOK";
        mhs2.IPK = 3.50;

        System.out.println(mhs2.nama);
        System.out.println(mhs2.NIM);
        System.out.println(mhs2.Prodi);
        System.out.println(mhs2.Fakultas);
        System.out.println(mhs2.IPK);

    }
}
