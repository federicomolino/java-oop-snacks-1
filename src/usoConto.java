

public class usoConto {
    public static void main(String[] args) {
        contoBancario mioConto = new contoBancario(-1);
        System.out.println("Il numero del tuo conto è: " + mioConto.getNumeroConto());

        mioConto.setAggiungiSaldo(2000);

        mioConto.setTogliDalSaldo(80);

        mioConto.SaldoTotale();

        mioConto.setAggiungiSaldo(2000);
        mioConto.SaldoTotale();

        mioConto.setTogliDalSaldo(4000);

        mioConto.SaldoTotale();
    }
}
