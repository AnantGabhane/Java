public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 18;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start , int end){
        if(arr.length == 0){
            return -1;
        }
        //run a for loop
        for(int index=start;index <= end;index++){
            //check at every index if element = target : search
            int element = arr[index];
            if(element == target){
                return index;
            }
        }   
        //IF target is not found then this return statement will be executed
       return -1;
    }
}