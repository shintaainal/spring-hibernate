package all;


import com.sun.javafx.beans.IDProperty;

import javax.annotation.Generated;
import javax.naming.Name;

@Entity
@Table(name = "TB_BUKU")

public class Book {

    @Id
    @Column (name = "ID_BUKU")
    @Generated(strategy = Generationtype.IDENTITY)
    private int id;

    @Column (name = "NAMA_PENGARANG", length = 255)
    private String namaPengarang;

    @Column (name = "JUDUL", length = 255)
    private String judul;

    @Column (name = "IS_PINJAM")
    private boolean is_Pinjam;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public boolean isIs_Pinjam() {
        return is_Pinjam;
    }

    public void setIs_Pinjam(boolean is_Pinjam) {
        this.is_Pinjam = is_Pinjam;
    }
}

