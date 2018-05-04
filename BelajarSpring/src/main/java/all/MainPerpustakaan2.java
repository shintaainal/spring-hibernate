package all;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainPerpustakaan2 {
    boolean isHapus = true;
    Scanner input = new Scanner(System.in);
    Perpustakaan perpus = new Perpustakaan();


    Map<String, Book> daftarBuku = new LinkedHashMap<String, Book>();

   // System.out.println("WELCOME, tambah data?");
    String isTambah = input.next();

    //Tambah data
        if (isTambah.equals("y")) {
        while (isTambah.equals("y")) {
            System.out.println(" ***********************************************************");
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

        for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
            System.out.println(entry.getKey());
            Book buku = entry.getValue();
            System.out.println(" Judul  Book : " + buku.getTitle() + "  penarang " + buku.getAuthor());
        }
    } else {
        System.out.println("THANK YOU");
    }

    //HAPUS

    String Hapus;

        System.out.println(" ***********************************************************");
        System.out.println("Hapus buku? ");

    Book book = new Book();

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
        System.out.println("Data tidak ditemukan!");
    }
        System.out.println("____________________________________________________________________ ");

    //UPDATE

        System.out.println("Update Data? ");
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
        System.out.println("____________________________________________________________________ ");
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

        System.out.println("____________________________________________________________________ ");
        System.out.println("Data Baru ");
        for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
            System.out.println(entry.getKey());
            Book buku = entry.getValue();
            System.out.println(" Judul  Book : " + buku.getTitle() + "  pengarang " + buku.getAuthor());

        }
