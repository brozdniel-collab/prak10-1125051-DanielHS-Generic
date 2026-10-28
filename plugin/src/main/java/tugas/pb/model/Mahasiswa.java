package tugas.pb.model;

public class Mahasiswa implements Printable {

    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public String getPrintDetail() {
        return "NIM : " + nim +
               ", Nama : " + nama;
    }

    @Override
    public String toString() {
        return getPrintDetail();
    }
}
