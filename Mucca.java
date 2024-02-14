public class Mucca {
    private String nome;

    // Costruttore
    public Mucca(String nome) {
        this.nome = nome;
    }

    // Metodo per far mangiare la mucca
    public void mangia() {
        System.out.println(nome + " sta mangiando erba.");
    }

    // Metodo per far muggire la mucca
    public void muggisce() {
        System.out.println(nome + " sta muggendo: Moooo!");
    }
}