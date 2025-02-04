public class studente {

    private String nome;
    private String cognome;
    private int eta;
    private int numeroStudentiTotali;
    private String[] registroStudenti;
    private int count;

    // Costruttore
    public studente(String nome, String cognome, int eta, int numeroStudentiTotali) {
        if (nome != null && cognome != null) {
            this.nome = nome;
            this.cognome = cognome;
        } else {
            System.out.println("Errore: Il nome e il cognome devono avere valori validi.");
        }

        if (eta > 0) {
            this.eta = eta;
        } else {
            System.out.println("Errore: L'età non può essere minore di 0.");
        }

        // Imposta il numero di studenti e inizializza l'array
        this.setNumeroStudenti(numeroStudentiTotali);
        this.registroStudenti = new String[this.numeroStudentiTotali]; 
        this.count = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public void stampaStudente() {
        System.out.println(nome + " " + cognome + ", " + eta + " anni");
    }

     // Metodo per impostare il numero di studenti totali
     public void setNumeroStudenti(int numeroStudentiTotali) {
        if (numeroStudentiTotali > 27) {
            System.out.println("Errore: La classe non può avere più di 27 studenti. Impostato a 27.");
            this.numeroStudentiTotali = 27;
        } else {
            this.numeroStudentiTotali = numeroStudentiTotali;
        }
    }

    // Metodo per aggiungere uno studente alla classe
    public void setAggiungiStudente(String nomeStudenteDaAggiungere) {
        if (count < registroStudenti.length) {
            registroStudenti[count] = nomeStudenteDaAggiungere;
            count++;
        } else {
            System.out.println("Errore: La classe è già piena.");
        }
    }

    // Metodo per stampare l'elenco degli studenti aggiunti
    public void stampaRegistroClasse() {
        if (count != numeroStudentiTotali) {
            int studentiMancanti = numeroStudentiTotali - count;
            System.out.println("All'interno della classe deve essere inserito ancora: "+ studentiMancanti + " studenti");
        }else{
            for (int i = 0; i < count; i++) {
                System.out.println("Lo stundete aggiunto è: " + registroStudenti[i]);
            }
        }
    }
}
