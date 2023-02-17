package arbolesbinarios;

public class Arbol {

    Nodo root;

    public Arbol() {
        this.root = null;
    }

    public void insetarNodo(int dato) {
        if (this.root == null) {
            this.root = new Nodo(dato);
        } else {
            this.root.insertarNodo(dato);
        }
    }

    public void imprimirArbolPreOrder() {
        this.recorrerArbolPreOrder(this.root);
    }

    public void recorrerArbolPreOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.print(nodo.getValor() + ",");
            recorrerArbolPreOrder(nodo.getNodoIzquierdo());
            recorrerArbolPreOrder(nodo.getNodoDerecho());
        }
    }

    public void imprimirArbolInOrder() {
        this.recorrerArbolInOrder(this.root);
    }

    public void recorrerArbolInOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            recorrerArbolInOrder(nodo.getNodoIzquierdo());
            System.out.print(nodo.getValor() + ",");
            recorrerArbolInOrder(nodo.getNodoDerecho());
        }
    }

    public void imprimirArbolPostOrder() {
        this.recorrerArbolPostOrder(this.root);
    }

    public void recorrerArbolPostOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            recorrerArbolPostOrder(nodo.getNodoIzquierdo());
            recorrerArbolPostOrder(nodo.getNodoDerecho());
            System.out.print(nodo.getValor() + ",");
        }
    }
}
