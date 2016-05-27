/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;
import java.util.Calendar;
public class pelanggan {
    String IDpelanggan,NIK,nama,TTL;
    java.util.Date trdftr= new java.util.Date();
    java.text.SimpleDateFormat tampiltrdftr= new java.text.SimpleDateFormat("dd/MM/yyyy");
    /*
    untuk menentukan tanggal terdaftar
    */
    public void terdaftar(int a, int b, int c){
     trdftr.setDate(a);
     trdftr.setMonth(b);
     trdftr.setYear(c);
    }
    /*
    untuk menampilkan tanggal terdaftar
    */
    public String gettrdftr(){
                return String.format(trdftr.getDate()+"/"+trdftr.getMonth()+"/"+trdftr.getYear());
    }
}
