package TREN_v21_Compra1Bitllet_Threads_MiriamJimenez;

public class FilCompraBillet implements Runnable {

    @Override 
    public  void run(){
        CompanyiaFerroviaria.compraBitlletTrajecte();
    }

}
