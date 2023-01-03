class Mahasiswa{
    String nama;
    String NIM;
    String prodi;
    String fakultas;
    double IPK;
}



public class App {
    public static void main(String[] args) throws Exception {
       Mahasiswa mhs = new Mahasiswa();

       mhs.nama = "nama";
       mhs.NIM = "21241067";
       mhs.prodi = "PTI";
       mhs.fakultas = "FSTT";
       mhs.IPK = 3.65;

       System.out.println(mhs.nama);
       System.out.println(mhs.NIM);
       System.out.println(mhs.prodi);
       System.out.println(mhs.fakultas);
       System.out.println(mhs.IPK);

       Mahasiswa Nurul = new Mahasiswa();
       Nurul.nama = "Nurul";
       Nurul.NIM = "21241067";
       Nurul.prodi = "PTI";
       Nurul.fakultas = "FSTT";
       Nurul.IPK = 3.65;

       System.out.println(Nurul.nama);
       System.out.println(Nurul.NIM);
       System.out.println(Nurul.prodi);
       System.out.println(Nurul.fakultas);
       System.out.println(Nurul.IPK);

       


    }
}
