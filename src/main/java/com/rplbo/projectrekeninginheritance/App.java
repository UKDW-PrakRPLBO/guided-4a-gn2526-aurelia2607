package com.rplbo.projectrekeninginheritance;

public class App 
{
    public static void main( String[] args )
    {
        RekeningBisnis rb = new RekeningBisnis(new Nasabah("a","1","jl 1"),100000);
        rb.penyetoran(100000);
        rb.penarikan(25000);
        System.out.println(rb.getSaldo());

        RekeningKeluarga rk = new RekeningKeluarga(new Nasabah("b", "2", "jl 2"),100000);
        rk.penyetoran(100000);
        rk.penarikan(25000);
        System.out.println(rb.getSaldo());

        RekeningSyariah rs = new RekeningSyariah(new Nasabah("c", "3", "jl 3"),100000);
        rs.penyetoran(100000);
        rs.penarikan(25000);
        rs.sumbangan(30000);
        System.out.println(rb.getSaldo());

        RekeningUtama ru = new RekeningUtama(new Nasabah("D", "4", "jl 4"),100000);
        ru.penyetoran(100000);
        ru.penarikan(25000);
        System.out.println(rb.getSaldo());

        RekeningTambahan rt = new RekeningTambahan(new Nasabah("E", "5", "jl 5"),50000);
        rt.penyetoran(150000);
        rt.penarikan(600000);
        System.out.println(rb.getSaldo());
    }
}
