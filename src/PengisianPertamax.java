public class PengisianPertamax extends TransaksiSPBU
        implements OperasionalSPBU {

    public PengisianPertamax(String nomorTransaksi, String namaPelanggan) {
        super(nomorTransaksi, namaPelanggan, "Pertamax", HARGA_PERTAMAX);
    }

    public PengisianPertamax(String nomorTransaksi, String namaPelanggan,
            double jumlahLiter) {
        super(nomorTransaksi, namaPelanggan, "Pertamax",
                HARGA_PERTAMAX, jumlahLiter);
    }

    @Override
    public void prosesPengisian() {
        if (getJumlahLiter() > 0) {
            setTotalHarga(hitungTotal());
            setStatus("Berhasil");
            System.out.println("Pengisian Pertamax berhasil.");
        } else {
            setTotalHarga(0.0);
            setStatus("Gagal");
            System.out.println("Pengisian gagal: jumlah liter harus lebih dari 0.");
        }
    }
}
