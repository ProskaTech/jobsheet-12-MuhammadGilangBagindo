package jobsheet12;

/**
 * Created by 21343030_Muhammad Gilang Bagindo
 * @author HP
 */

class AktivitasPagiAnak implements AktivitasPagi{
    @Override
    public void lari(){
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }
    
    @Override
    public void berenang(){
        System.out.println("Aktivitas pertama pagi ini adalah berenang");
    }
}

class AktivitasUtama{
    public static void main (String[]args){
        AktivitasPagiAnak a1 = new AktivitasPagiAnak();
        
        //panggil method anak umur 1 tahun
        a1.lari();
        a1.berenang();
    }
}