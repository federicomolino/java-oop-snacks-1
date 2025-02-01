public class studente {

    private String nome;

    private String cognome;

    private int eta;
    
    public studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;

        if (nome != null && cognome != null) {
            this.nome = nome;
            this.cognome = cognome;
        }else{
            System.out.println("Il nome e il cognome devono avere dei valori validi");
        }

        if (eta > 0) {
            this.eta = eta;
        }else{
            System.out.println("l'enta non può essere minore di 0");
        }
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public int getEta(){
        return eta;
    }
}
