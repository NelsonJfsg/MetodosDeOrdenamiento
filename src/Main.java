
public class Main {
    
    public static void main(String[] args) {
        
        //Declaracion de variables.
        int aux = 0;
        int izq = 0;
        int der = 0;
        
        //Declaracion de la lista.
        int[] lista = {3, 6, 3, 1, 2, 4};
        
        //Objeto para llamar los metodos de ordenamiento.
        MetodosOrdenamientos mO = new MetodosOrdenamientos();
        
        System.out.println("BubbleSort");
        mO.BubbleSort(lista, aux);
        System.out.println("");
        
        System.out.println("SelectionSort");
        mO.SelectionSort(lista, aux);
        System.out.println("");
        
        System.out.println("InsertionSort");
        mO.InsertionSort(lista, aux);
        System.out.println("");
        
        System.out.println("QuickSort");
        mO.QuickSort(lista, aux, izq, der);
    }
}
