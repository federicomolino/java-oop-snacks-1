public class contoBancario {
    
    private int numeroConto;

    private double saldo;

    public contoBancario(int numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public int getNumeroConto(){
        return numeroConto;
    }

    public double getSaldo(){
        return saldo;
    }

    
    public double setAggiungiSaldo(double saldoAggiunto){
        this.saldo += saldoAggiunto;
        System.out.println("Hai aggiunto al tuo conto: " + saldoAggiunto);
        return this.saldo;
    }

    public double setTogliDalSaldo(double saldoTolto){

        if (this.saldo - saldoTolto < 0) {
            System.out.println("Non puoi prelevare più di quanto hai nel saldo");
        } else {
            this.saldo -= saldoTolto;
        }

        return this.saldo;
    }

    public void SaldoTotale(){
        System.out.println("Il saldo totale è: " + saldo);
    }
}
