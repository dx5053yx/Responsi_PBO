public class Main {
    public static void main(String[] args) {
        OperasionalSPBU pertalite = new PengisianPertalite("TRX-001", "Aqil", 10.0);
        pertalite.tampilkanDetail();
        pertalite.prosesPengisian();
        pertalite.bayar(120000.0);
        pertalite.cetakStruk();

        InfoPromo promoPertalite = (InfoPromo) pertalite;
        promoPertalite.tampilkanPromo();

        System.out.println("\nTransaksi kedua\n");
        PengisianPertamax objekPertamax = new PengisianPertamax("TRX-002", "Dina");
        objekPertamax.setJumlahLiter(5.0);

        OperasionalSPBU pertamax = objekPertamax;
        pertamax.tampilkanDetail();
        pertamax.prosesPengisian();
        pertamax.bayar(70000.0);
        pertamax.cetakStruk();
    }
}
