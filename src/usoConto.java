

public class usoConto {
    public static void main(String[] args) {
        contoBancario mioConto = new contoBancario(44);
        System.out.println("Il numero del tuo conto è: " + mioConto.getNumeroConto());

        mioConto.setAggiungiSaldo(5);

        mioConto.setTogliDalSaldo(10);

        mioConto.SaldoTotale();
    }
}
