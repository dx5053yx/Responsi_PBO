public class PengisianPertalite extends TransaksiSPBU
        implements OperasionalSPBU, InfoPromo {

    public PengisianPertalite(String nomorTransaksi, String namaPelanggan) {
        super(nomorTransaksi, namaPelanggan, "Pertalite", HARGA_PERTALITE);
    }

    public PengisianPertalite(String nomorTransaksi, String namaPelanggan,
            double jumlahLiter) {
        super(nomorTransaksi, namaPelanggan, "Pertalite",
                HARGA_PERTALITE, jumlahLiter);
    }

    @Override
    public void prosesPengisian() {
        if (getJumlahLiter() > 0) {
            setTotalHarga(hitungTotal());
            setStatus("Berhasil");
            System.out.println("Pengisian Pertalite berhasil.");
        } else {
            setTotalHarga(0.0);
            setStatus("Gagal");
            System.out.println("Pengisian gagal: jumlah liter harus lebih dari 0.");
        }
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Layanan         : Pengisian Pertalite");
    }

    @Override
    public void tampilkanPromo() {
        System.out.println("Promo Pertalite: tidak ada biaya tambahan.");
    }
}
