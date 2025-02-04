
public class nomeStudente {
    public static void main(String[] args) {
        studente mario = new studente("mario", "rossi", 3, 2);

        mario.stampaStudente();

        mario.setAggiungiStudente("Luca");
        mario.setAggiungiStudente("Mario");

        mario.stampaRegistroClasse();
    }
}
