/* 
--Time Complexity : Worse case: O(n2)
                 : Best case: O(n2)
    
--Space Complexity : O(1), since additional data structure isn't used apart from inpurt array.
*/                    

class SelectionSort{
    public static void print_Array(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[] = {9,7,5,3,2,12,4};

        //   selection sort
        for(int i=0; i<array.length-1; i++){
            int least = i;
            for(int j=i+1; j<array.length; j++){
                if(array[least] > array[j]){
                    least = j;
                }

            }
            int temp_var = array[least];
            array[least] = array[i];
            array[i] = temp_var;

        }
        print_Array(array);
    }
}
