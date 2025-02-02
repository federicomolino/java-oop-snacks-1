public class registroStudenti {

    private String [] nomeStudente;
    private int count;

    public registroStudenti(){
        this.nomeStudente = new String [10];
        this.count=0;
    }

    public boolean addStudente (String nuovoStundente){
        if (count < nomeStudente.length) {
            //Inserisco lo studente nella prima posizione libera
            nomeStudente[count] = nuovoStundente;
            count ++;
            return true;
        }else{
            System.out.println("La classe ha raggiunto il limite massimo");
            return false;
        }
        
    }

    public void stampaStudenti(){
        for (int i = 0; i < count; i++) {
            System.out.println("Nome Studente: " + nomeStudente[i]);
        }
    }
}
