package all;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainPerpustakaan {
    Scanner input = new Scanner(System.in);
    Perpustakaan perpus = new Perpustakaan();

    Map<String, Book> daftarBuku = new LinkedHashMap<String, Book>();
    Map<String, Peminjam> daftarPinjam = new LinkedHashMap<String, Peminjam>();
    Map<String, Book> bukuDipinjam = new LinkedHashMap<String, Book>();


    Peminjam pinjam2 = new Peminjam();
    Book book = new Book();

    public void isiDataBuku() {

        System.out.println("WELCOME, tambah data? y/t");
        String isTambah = input.next();

        //Tambah data
        if (isTambah.equals("y")) {
            while (isTambah.equals("y")) {
                System.out.println(" ====================== TAMBAH DATA BUKU ======================");
                System.out.println(" Tambah Data Book ! ");
                System.out.print(" Judul Book : ");

                Book book = new Book();
                book.setTitle(input.next());

                System.out.print(" Pengarang : ");
                book.setAuthor(input.next());

                System.out.print(" No ISBN : ");
                daftarBuku.put(input.next(), book);

                System.out.print(" Tambah data baru kembali ?(jawab dengan y/t : ");
                isTambah = input.next();

            }
            System.out.println(" ====================== DAFTAR BUKU ======================");
            for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                System.out.println(entry.getKey());
                Book buku = entry.getValue();
                System.out.println(" Judul  Book : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
            }

        } else {
            System.out.println("THANK YOU");
        }
    }

    public void hapusDataBuku() {
        String Hapus;

        System.out.println(" ====================== HAPUS BUKU ======================");
        System.out.println("Hapus buku? ");

        Hapus = input.next();

        if (Hapus.equals("y")) {
            System.out.println("Masukan ISBN: ");
            daftarBuku.remove(input.next());

            for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                System.out.println(entry.getKey());
                Book buku = entry.getValue();
                System.out.println(" Judul  Book : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
            }
        } else {
            System.out.println("Ok terimaKasih");
        }
    }

    public void updateDataBuku() {

        System.out.println(" ====================== UPDATE DATA BUKU ======================");
        System.out.println("Update Data? y/t");
        String upd = input.next();

        while (upd.equals("y")) {

            //Print data sebelumnya
            System.out.println("Data Sebelumnya: ");
            for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                System.out.println(entry.getKey());
                Book buku = entry.getValue();
                System.out.println(" Judul  Book : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
            }
            System.out.println("");
            System.out.println(" ====================== UPDATE DATA : ======================");
            System.out.println("");

            //Update data
            System.out.println("Pilih ISBN data update : ");
            daftarBuku.put(input.next(), book);

            System.out.print(" Judul Book : ");
            book.setTitle(input.next());

            System.out.print(" Pengarang : ");
            book.setAuthor(input.next());

            System.out.print(" Update lagi?(jawab dengan y/t : ");
            upd = input.next();

            System.out.println(" ====================== DATA TELAH DIPERBAHARUI ======================");
            System.out.println("Data Baru ");
            for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                System.out.println(entry.getKey());
                Book buku = entry.getValue();
                System.out.println(" Judul  Book : " + buku.getTitle() + "  pengarang " + buku.getAuthor());

            }

        }
    }

    public void tambahDataPeminjam() {
        //tambah data peminjam
        System.out.println(" ====================== TAMBAH DATA PEMINJAM ======================");
        System.out.println(" Welcome ! Tambah data peminjam? y/t");
        String isi = input.next();

        if (isi.equals("y")) {

            while (isi.equals("y")) {
                System.out.println(" ====================== MASUKAN DATA ======================");
                System.out.println(" Tambah Data Peminjam ! ");

                Peminjam pinjam = new Peminjam();

                System.out.print(" Nama Peminjam : ");
                pinjam.setNamaPeminjam(input.next());

                System.out.print(" Alamat : ");
                pinjam.setAlamatPeminjam(input.next());

                System.out.print(" ID Peminjam : ");
                daftarPinjam.put(input.next(), pinjam);

                System.out.print(" Tambah data baru kembali ?(jawab dengan y/t : ");
                isi = input.next();
            }
            for (Map.Entry<String, Peminjam> entry : daftarPinjam.entrySet()) {
                System.out.println(entry.getKey());
                Peminjam pinjam = entry.getValue();
                System.out.println(" Nama  : " + pinjam.getNamaPeminjam() + "  Alamat :" + pinjam.getAlamatPeminjam());
            }

        } else {
            System.out.println("Thank you!");
        }
    }

    public void pinjamBuku() {
        System.out.println(" ====================== PINJAM BUKU ======================");
        System.out.println("Apakah ada yang mau pinjam buku? y/t");
        String isi = input.next();

        System.out.println("");
        System.out.println(" ====================== MASUKAN DATA ======================");


        //Peminjam pinjam2 = new Peminjam();

        if (isi.equals("y")) {
            while (isi.equals("y")) {
                System.out.println("Masukan ID Peminjam :");
                pinjam2 = daftarPinjam.get(input.next());
                System.out.println("Nama   : " + pinjam2.getNamaPeminjam());
                System.out.println("Alamat : " + (pinjam2).getAlamatPeminjam());

                System.out.println("");
                System.out.println(" ====================== PILIH DATA ======================");
                System.out.println("Masukan ISBN Book : ");
                String isbn = input.next();
                book = daftarBuku.get(isbn);
                if (daftarBuku.get(isbn).isPinjam() == true) { //ispinjam????
                    System.out.println("Mohon maaf, buku sedang kosong");
                    isbn = input.next();
                } else {
                    System.out.println("Judul Book  : " + book.getTitle());
                    System.out.println("Pengarang   :" + book.getAuthor());
                    System.out.println("=========================================================");
                    System.out.println("");

                    System.out.println("Pinjam buku ini? y/t");
                    String pjm = input.next();
                    System.out.println("====================== Meminjam ===========================");

                    if (pjm.equals("y")) {
                        bukuDipinjam.put(isbn, book);

                        pinjam2.setDaftarBuku(bukuDipinjam);

                        System.out.println("Nama   : " + pinjam2.getNamaPeminjam());
                        System.out.println("Alamat : " + (pinjam2).getAlamatPeminjam());

                        Book book1 = bukuDipinjam.get(isbn);
                        System.out.println("Judul  : " + book1.getTitle());
                        System.out.println("Pengarang : " + book1.getAuthor());
                        System.out.println("=====================================================");

                    } else {
                        System.out.println("Tidak Jadi Pinjam");
                    }
                }

                System.out.println("Pinjam buku lain?");
                isi = input.next();
                if (isi.equals("t")) {
                    System.out.println("=================Proses selesai=====================");

                } else {
                    System.out.println("Data Saved");
                }

            }
        } else {
            System.out.println("THANK YOU");
        }
    }

    public void tampilPinjaman() {
        System.out.println("");
        System.out.println("====================Data Pinjaman=======================");
        for (Map.Entry<String, Book> entry : bukuDipinjam.entrySet()) {
            System.out.println(entry.getKey());
            Book book1 = entry.getValue();
            System.out.println("Nama   : " + pinjam2.getNamaPeminjam());
            System.out.println("Alamat : " + pinjam2.getAlamatPeminjam());
            System.out.println("judul  : " + book1.getTitle());
            System.out.println("Pengarang : " + book1.getAuthor());
            System.out.println("=====================================================");
        }
    }

    public static void main(String[] args) {

        MainPerpustakaan obj = new MainPerpustakaan();

        obj.isiDataBuku();
        obj.hapusDataBuku();
        obj.updateDataBuku();
        obj.tambahDataPeminjam();
        obj.pinjamBuku();
        obj.tampilPinjaman();
    }
}
