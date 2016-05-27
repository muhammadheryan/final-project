/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;
/*
untuk menampilkan kelas transakasi
*/
public class transaksi extends kamar {

    String kodeTransaksi;
    java.util.Date skrng = new java.util.Date();
    java.text.SimpleDateFormat tampil = new java.text.SimpleDateFormat("dd/MM/yyyy");
    java.util.Date tglcheckin = new java.util.Date();
    java.util.Date tglcheckout = new java.util.Date();
    java.text.SimpleDateFormat tampilcheckout = new java.text.SimpleDateFormat("dd/MM/yyyy");
/*
    untuk menentukan tanggal
    */
    public String gettgl() {
        return String.format(tampil.format(skrng));
    }
/*
    untuk menentukan kode transaksi
    */
    public void setkode(String a) {
        kodeTransaksi = a;
    }
/*
    untuk menentukan tanggal chek in
    */
    public void setcheckin(int a, int b, int c) {
        tglcheckin.setDate(a);
        tglcheckin.setMonth(b);
        tglcheckin.setYear(c);
    }
/*
    untuk menampilkan tanggal chek in
    */
    public String getcheckin() {
        return String.format(tglcheckin.getDate()+"/"+tglcheckin.getMonth()+"/"+tglcheckin.getYear());
    }
/*
    untuk menentukan tanggal chek out
    */
    public void setcheckout(int a) {
        tglcheckout.setDate(tglcheckin.getDate() + a);
    }
/*
    untuk menampilkan tanggal chekout
    */
    public String getcheckout() {
        return String.format(tampilcheckout.format(tglcheckout));
    }

    /*
    untuk menampilkan daftar menu
    */
    public void menu() {
        System.out.println("MENU : ");
        System.out.println("1.Daftar Kelas dan Harga kamar");
        System.out.println("2.Daftar Discount kelas kamar");
        System.out.println("3.Daftar kamar kosong");
        System.out.println("4.Transaksi pemesanan kamar");
        System.out.println("5.Cetak transaksi");
        System.out.println("6.Keluar ");
    }
}
