public abstract class TransaksiSPBU {
    public static final String NAMA_SPBU = "SPBU Sederhana";
    public static final double HARGA_PERTALITE = 10000.0;
    public static final double HARGA_PERTAMAX = 12900.0;

    private final String nomorTransaksi;
    private String namaPelanggan;
    private String jenisBBM;
    private double hargaPerLiter;
    private double jumlahLiter;
    private double totalHarga;
    private String status;

    public TransaksiSPBU(String nomorTransaksi, String namaPelanggan,
            String jenisBBM, double hargaPerLiter) {
        this(nomorTransaksi, namaPelanggan, jenisBBM, hargaPerLiter, 0.0);
    }

    public TransaksiSPBU(String nomorTransaksi, String namaPelanggan,
            String jenisBBM, double hargaPerLiter, double jumlahLiter) {
        this.nomorTransaksi = nomorTransaksi;
        this.namaPelanggan = namaPelanggan;
        this.jenisBBM = jenisBBM;
        this.hargaPerLiter = hargaPerLiter;
        this.jumlahLiter = jumlahLiter;
        this.totalHarga = 0.0;
        this.status = "Belum diproses";
    }

    public abstract void prosesPengisian();

    public double hitungTotal() {
        return this.jumlahLiter * this.hargaPerLiter;
    }

    public void tampilkanDetail() {
        System.out.println("Nomor transaksi : " + this.nomorTransaksi);
        System.out.println("Nama pelanggan  : " + this.namaPelanggan);
        System.out.println("Jenis BBM       : " + this.jenisBBM);
        System.out.println("Jumlah          : " + this.jumlahLiter + " liter");
        System.out.println("Harga per liter : Rp" + this.hargaPerLiter);
    }

    public void bayar(double jumlahUang) {
        if (this.status.equals("Berhasil")) {
            if (jumlahUang >= this.totalHarga) {
                this.status = "Lunas";
                System.out.println("Pembayaran berhasil. Kembalian: Rp"
                        + (jumlahUang - this.totalHarga));
            } else {
                System.out.println("Uang pembayaran masih kurang.");
            }
        } else {
            System.out.println("Pengisian belum berhasil, pembayaran tidak dapat dilakukan.");
        }
    }

    public void cetakStruk() {
        System.out.println("\n--- STRUK " + NAMA_SPBU + " ---");
        tampilkanDetail();
        System.out.println("Total           : Rp" + this.totalHarga);
        System.out.println("Status          : " + this.status);
        System.out.println("----------------------------");
    }

    public String getNomorTransaksi() {
        return this.nomorTransaksi;
    }

    public String getNamaPelanggan() {
        return this.namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getJenisBBM() {
        return this.jenisBBM;
    }

    public void setJenisBBM(String jenisBBM) {
        this.jenisBBM = jenisBBM;
    }

    public double getHargaPerLiter() {
        return this.hargaPerLiter;
    }

    public void setHargaPerLiter(double hargaPerLiter) {
        this.hargaPerLiter = hargaPerLiter;
    }

    public double getJumlahLiter() {
        return this.jumlahLiter;
    }

    public void setJumlahLiter(double jumlahLiter) {
        this.jumlahLiter = jumlahLiter;
    }

    public double getTotalHarga() {
        return this.totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
