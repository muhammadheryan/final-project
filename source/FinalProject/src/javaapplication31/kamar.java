/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;
public class kamar extends pelanggan{
    String IDkamar,kelas;
    int hargakamar;
    int k=0;
    int jumlh;
    static int dataTersimpan = 0;
    int hari;
    String simpanpelanggan[]=new String [1000];
    String simpan[] = new String[100];
    int kamarR=50,kamarP=20,kamarS=20,kamarV=10;
    double harga;
    static int a = 0;
    public void kelas() {
        String kelas[][] = {{"KELAS", "      JUMLAH KAMAR", "   HARGA PERMALAM (Rp)", "daftar ID kamar"},
        {"Reguler", "        50", "            100.000", "             R1-R50"},
        {"Premium", "        20", "            200.000", "             P1-P20"},
        {"Suite", "          20", "            350.000", "             S1-S20"},
        {"VIP", "            10", "            750.000", "             V1-V10"},};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(kelas[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void disc() {
        String disc[][] = {{"AKUMULASI LAMA SEWA (hari)", "    DISCOUNT"},
        {"          0-9", "                    0%"},
        {"         10-30", "                   10%"},
        {"         31-60", "                   15%"},
        {"         61-dst", "                  25%"},};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(disc[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void checkkamar(String id){
            for (int i = 1; i <= 100; i++) {
                if (id.equalsIgnoreCase(simpan[i])) {
                    System.out.println("KETERANGAN : Maaf,Kamar sudah di pesan, Silahkan pilih kamar yang lain");
                    k=1;
                    break;
                }else {
                    System.out.println("KETERANGAN : Kamar tersedia");
                    simpan[a + 1] = id;
                    a++;
                    k=0;
                    break;
                }
            }
    }public void kosong(){
            System.out.println("Daftar kamar kosong : ");
            System.out.println("Reguler : "+kamarR+" kamar");
            System.out.println("Premium : "+kamarP+" kamar");
            System.out.println("Suite   : "+kamarS+" kamar");
            System.out.println("VIP     : "+kamarV+" kamar");
    }public void input(String a, int b) {
        int j = dataTersimpan;
        for (int i = (dataTersimpan + 1); i <= (j + b); i++) {
            simpanpelanggan[i] = a;
            dataTersimpan++;
        }
    }public void checkjmlh(String a) {
        for (int i = 1; i <= dataTersimpan; i++) {
            if (a == simpanpelanggan[i]) {
                jumlh++;
            }
        }
    }
    public void harga(String a,int b,String c){
            hari=b;
            kelas=a;
            if ("reguler".equals(a)) {
                hargakamar=100000;
            }else if ("premium".equals(a)) {
                hargakamar=200000;
            }else if ("suite".equals(a)) {
                hargakamar=350000;
            }else if ("VIP".equals(a)) {
                hargakamar=750000;
            }
            input(c, b);
            checkjmlh(c);
            if ((jumlh >= 0)&&(jumlh<=9)) {
                harga = (double)hari * hargakamar;
            } else if ((jumlh > 9)&&(jumlh<=30)) {
                harga = (double)hari * hargakamar * 90 / 100;
            } else if ((jumlh > 30)&&(jumlh<=60)) {
                harga = (double)hari * hargakamar * 85 / 100;
            } else if (jumlh > 60) {
                harga = (double)hari * hargakamar * 75 / 100;
            }if ("reguler".equals(a)) {
                kamarR--;
            }else if ("premium".equals(a)) {
                kamarP--;
            }else if ("suite".equals(a)) {
                kamarS--;
            }else if ("VIP".equals(a)) {
                kamarV--;
            }
    }
}
