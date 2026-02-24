package com.rplbo.projectrekeninginheritance;

public class RekeningKeluarga extends Rekening{


    public RekeningKeluarga(Nasabah nasabah) {
        super(nasabah);

    }

    public RekeningKeluarga(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);

    }

    @Override
    public void penarikan(int jumlah) {
        super.penarikan(jumlah);
    }

    @Override
    public void penyetoran(int jumlah) {
        int total = jumlah + bunga(jumlah);
        super.penyetoran(total);
    }
    private int bunga(int jumlah){
        return (int)(jumlah * 0.5/100);

    }
}
