public class PilaTokens {

    // Atributos
    private NodoToken tope;

    // Constructor
    public PilaTokens() {
        this.tope = null;
    }


    public boolean estaVacia() {
        return tope == null;
    }


    public void push(String valor, int tipo) {
        NodoToken nuevoNodo = new NodoToken(valor, tipo);
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
    }


    public NodoToken pop() {
        if (estaVacia()) {
            System.out.println("Error: La pila está vacía. No se puede hacer pop.");
            return null;
        }
        NodoToken nodoExtraido = tope;
        tope = tope.getSiguiente();
        nodoExtraido.setSiguiente(null); // Seguridad: Desconectar el nodo extraído
        return nodoExtraido;
    }


    public NodoToken peek() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        return tope;
    }


    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        NodoToken actual = tope;
        System.out.println("--- ESTADO ACTUAL DE LA PILA (Tope a Fondo) ---");
        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
        }
        System.out.println("-----------------------------------------------");
    }
}
