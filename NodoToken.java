public class NodoToken {

    // Atributos privados
    private String valor;
    private int tipo;
    private NodoToken siguiente;

    // Constructor
    public NodoToken(String valor, int tipo) {
        this.valor = valor;
        this.tipo = tipo;
        this.siguiente = null;
    }

    // Getters
    public String getValor() {
        return valor;
    }

    public int getTipo() {
        return tipo;
    }

    public NodoToken getSiguiente() {
        return siguiente;
    }

    // Setters
    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setSiguiente(NodoToken siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "[Token: " + valor + "]";
    }
}