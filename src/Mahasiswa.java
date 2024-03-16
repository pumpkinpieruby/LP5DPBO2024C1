public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String nomorTelp;
    private String fakultas;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String nomorTelp, String fakultas) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nomorTelp = nomorTelp;
        this.fakultas = fakultas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
    }
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    public String getNomorTelp() {
        return this.nomorTelp;
    }
    public String getFakultas(){
        return this.fakultas;
    }
}
