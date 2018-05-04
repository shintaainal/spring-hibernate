package all;

import javax.annotation.Generated;

@Entity
@Table(name = "TB_PEMINJAM")

public class Peminjam {

    @Id
    @Column (name = "ID_PEMINJAM")
    @Generated(strategy = Generationtype.IDENTITY)

    @Column (name = "NAMA_PEMINJAM")
    private String namaPeminjam;

    @Column (name = "ALAMAT_PEMINJAM")
    private String alamatPeminjam;

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getAlamatPeminjam() {
        return alamatPeminjam;
    }

    public void setAlamatPeminjam(String alamatPeminjam) {
        this.alamatPeminjam = alamatPeminjam;
    }
}
