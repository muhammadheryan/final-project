/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;
import java.util.Scanner;
public class Projecthotel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==========WELCOME TO THE DAREN'S HOTEL==========");
        int pil = 0;
        transaksi Transaksi = new transaksi();
        pelanggan Pelanggan = new pelanggan();
        kamar Kamar = new kamar();
        // syntax untuk memasukan pilihan jenis kamar
        do {
            System.out.println("");
            Transaksi.menu();
            System.out.println("");
            System.out.print("Masukkan pilihan anda : ");
            pil = in.nextInt();
            System.out.println("");
            if (pil == 1) {
                Kamar.kelas();
            } else if (pil == 2) {
                Kamar.disc();
            } else if (pil == 3) {
                Kamar.kosong();
            } else if (pil == 4) {
                System.out.println("Silahkan masukkan data anda di bawah");
                System.out.print("Memesan kamar untuk berapa hari ?  ");
                int f = in.nextInt();
                Kamar.hari=f;
                String p;
                System.out.print("Kelas Kamar (reguler,premium,suite,VIP): ");
                p = in.next();
                do {
                System.out.print("ID kamar : ");
                String q = in.next();
                Kamar.IDkamar=q;
                Kamar.checkkamar(q);
                }while(Kamar.k == 1);System.out.print("Kode transaksi                     : ");
                String a = in.next();
                Transaksi.setkode(a);
                System.out.print("Masukkan nama                      : ");
                String b = in.next();
                Pelanggan.nama = b;
                System.out.print("Masukkan ID                        : ");
                String c = in.next();
                Kamar.harga(p, f, c);
                Pelanggan.IDpelanggan=c;
                System.out.print("Masukkan NIK                       : ");
                String d = in.next();
                Pelanggan.NIK=d;
                System.out.print("Masukkan T/TL (hari/tglBulanTahun) : ");
                String e = in.next();
                Pelanggan.TTL=e;
                System.out.println("Tanggal terdaftar ");
                System.out.print("Tanggal : ");
                int g = in.nextInt();
                System.out.print("Bulan   : ");
                int h = in.nextInt();
                System.out.print("Tahun   : ");
                int i = in.nextInt();
                Pelanggan.terdaftar(g, h, i);
                System.out.println("Tanggal CheckIn ");
                System.out.print("Tanggal : ");
                int j = in.nextInt();
                System.out.print("Bulan   : ");
                int k = in.nextInt();
                System.out.print("Tahun   : ");
                int l = in.nextInt();
                Transaksi.setcheckin(j, k, l);
                Transaksi.setcheckout(f);
            } else if (pil == 5) {
            System.out.println("Data transaksi     " );
            System.out.println("Kode transaksi       : "+Transaksi.kodeTransaksi);
            System.out.println("Tanggal transaksi    : "+Transaksi.gettgl());
            System.out.println("Nama Pelanggan       : "+Pelanggan.nama);
            System.out.println("ID pelanggan         : "+Pelanggan.IDpelanggan);
            System.out.println("NIK                  : "+Pelanggan.NIK);
            System.out.println("T/TL                 : "+Pelanggan.TTL);
            System.out.println("Tanggal terdaftar    : "+Pelanggan.gettrdftr());
            System.out.println("Memesan kamar untuk  : "+Kamar.hari+" hari");
            System.out.println("Tanggal checkIn      : "+Transaksi.getcheckin());
            System.out.println("Tanggal checkOut     : "+Transaksi.getcheckout());
            System.out.println("Kelas kamar          : "+Kamar.kelas);
            System.out.println("Harga satu hari      : Rp."+Kamar.hargakamar+",-");
            System.out.println("ID kamar             : "+Kamar.IDkamar);
            System.out.println("Total bayar          : Rp."+Kamar.harga+",-");
            System.out.println("Anda sudah terdaftar : "+Kamar.jumlh+" kali");
         }
        } while (pil < 6);
        System.out.println("Terimakasih telah menjadi Pelanggan DAREN's HOTEL");
        System.out.println("");
    }

}
