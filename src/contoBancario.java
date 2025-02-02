public class contoBancario {
    
    private int numeroConto;

    private double saldo;

    public contoBancario(int numeroConto){
        if (numeroConto == 0 || numeroConto <=0) {
            System.out.println("il numero del conto non può essere minore o uguale a 0");
        }
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public int getNumeroConto(){
        return numeroConto;
    }

    public double getSaldo(){
        return saldo;
    }

    //aggiungo al saldo quanto richiesto
    public double setAggiungiSaldo(double saldoAggiunto){
        this.saldo += saldoAggiunto;
        System.out.println("Hai aggiunto al tuo conto: " + saldoAggiunto);
        return this.saldo;
    }

    //Tolgo dal saldo quanto quanto indicato, verificando che non si vada sotto 0
    public double setTogliDalSaldo(double saldoTolto){

        if (this.saldo - saldoTolto < 0) {
            System.out.println("Non puoi prelevare più di quanto hai nel saldo");
        } else {
            System.out.println("Al tuo Saldo iniziale hai tolto: " +saldoTolto);
            this.saldo -= saldoTolto;
        }

        return this.saldo;
    }

    //Stampo il saldo totale presente
    public void SaldoTotale(){
        System.out.println("Il saldo totale è: " + saldo);
    }
}
