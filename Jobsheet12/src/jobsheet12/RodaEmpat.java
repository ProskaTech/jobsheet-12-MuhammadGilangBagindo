package jobsheet12;

/**
 * Created by 21343030_Muhammad Gilang Bagindo
 * @author HP
 */

class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 8;//1 kali
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga mobil menjadi Rp."+hargaDasar);
    }
}
