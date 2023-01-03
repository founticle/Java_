/* 
--Time Complexity : Worse case: O(n2)
                 : Best case: O(n)
    
--Space Complexity : O(1), since constant amount of additional memory is used apart from inpurt array.
*/                    

class BubbleSort {
    public static void print_Array(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[] = {9,7,5,3,2,12,4};

        
      // bubble sort
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp_var = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp_var;
                }
            }
        }

        print_Array(array);
    }
}
