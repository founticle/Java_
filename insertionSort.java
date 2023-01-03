/* 
--Time Complexity : Worse case: O(n2)
                 : Best case: O(n)
    
--Space Complexity : O(1), since constant amount of additional memory is used apart from input array.
*/                    

class InsetionSort {
    public static void print_Array(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[] = {9,7,5,3,2,12,4};

        
        // insertion sort
        for(int i=1; i<array.length; i++){
            int present = array[i];
            int j = i-1;
            while(j >= 0 && present < array[j]){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = present;
        }

        
        print_Array(array);
    }
}
