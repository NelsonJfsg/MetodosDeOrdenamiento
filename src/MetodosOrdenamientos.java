public class MetodosOrdenamientos {
    
    //Metodo BubbleSort.
    public void BubbleSort(int [] lista, int aux){
        
        for(int i = lista.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(lista[j] > lista[j+1]){
                    aux = lista[j+1];
                    lista[j+1] = lista[j];
                    lista[j] = aux;
                }
            }
        }
        
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
    }
    
    //Metodo SelectionSort.
    public void SelectionSort(int [] lista, int aux){
        for(int i = 0; i < lista.length-1; i++){
            
            int min = i;
            for(int j = i+1; j < lista.length; j++){
                if(lista[j] < lista[min]){
                    min = j;
                    
                }
                aux = lista[min];
                lista[min] = lista[i];
                lista[i] = aux;
            }
        }
        
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
    }
    
    //Metodo InsertionSort.
    public void InsertionSort(int[] lista, int aux){
        
        int i = 0;
        
        while(i < lista.length-1){
            
            aux = lista[i];
            
            for(int j = i; j > 0 && lista[j-1] > aux; --j){
                lista[j] = lista[j-1];
                lista[j] = aux;
            }
            
            ++i;
        }
        
        for( i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
        
    }

    //Metodo QuickShort.
    public void QuickSort(int[] lista, int aux, int left, int right){
            
       //Variables
       int cont=lista[left]; 
       int i=left;         
       int j=right;         
            
       while(i < j){                          
          while(lista[i] <= cont && i < j){ i++;} 
          while(lista[j] > cont) {j--;}           
          if (i < j) {                                              
              aux= lista[i];                      
              lista[i]=lista[j];
              lista[j]=aux;
          }
        }

        lista[left]=lista[j];      
        lista[j]=cont;      

        if(left < j-1){
           QuickSort(lista,left,j-1,aux);          
        }
             
        if(j+1 < right){
           QuickSort(lista,j+1,right,aux);          
        }
             
        for(i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
    }
       
}


