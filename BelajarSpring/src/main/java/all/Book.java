package all;


import com.sun.javafx.beans.IDProperty;

import javax.annotation.Generated;

@Entity
@Table(name = "TB_BUKU")

public class Book {

    @Id
    @Column (name = "ID_BUKU")
    @Generated(strategy = Generationtype.IDENTITY)
    private int id;

    @Column (Name = "NAMA_PENGARANG", length = 255)
    private String namaPengarang;

    @Column (Name = "JUDUL", length = 255)
    private String judul;

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
}
