public class UsoStudente {
    public static void main(String[] args) throws Exception {

        studente studenteInput = new studente(null, "rossi", -1);

        System.out.println("Il nome inserito è: " + studenteInput.getNome() + ", Il cognome inserito è: " + studenteInput.getCognome() + 
        ", l'eta inserita è: " + studenteInput.getEta());
    }
}
