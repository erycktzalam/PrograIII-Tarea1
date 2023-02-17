
package arbolesbinarios;

/**
 *
 * @author Erick Tzalam
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arbol arbol = new Arbol();
        
        arbol.insetarNodo(6);
        arbol.insetarNodo(4);
        arbol.insetarNodo(1);
        arbol.insetarNodo(5);
        arbol.insetarNodo(8);
        arbol.insetarNodo(9);
        
        System.out.println("Recorrido INORDER");
        arbol.imprimirArbolInOrder();
        System.out.println("");
        
        System.out.println("Recorrido PREORDER");
        arbol.imprimirArbolPreOrder();
        System.out.println("");
        
        System.out.println("Recorrido POSTORDER");
        arbol.imprimirArbolPostOrder();
    }
    
}
