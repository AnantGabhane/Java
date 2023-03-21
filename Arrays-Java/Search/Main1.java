
public class Main1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        boolean ans = linearSearch3(nums, target);
        System.out.println(ans);
    }
    //retrun true or false if element == target
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        //run a for loop
        for(int index=0;index <arr.length;index++){
            //check at every index if element = target : search
            int element = arr[index];
            if(element == target){
                return true;
            }
        }   
        //IF target is not found then this return statement will be executed
       return false;
    }


    //returing target element
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run a for loop
        for(int element : arr){
            //check at every index if element = target : search
            if(element == target){
                return element;
            }
        }   
        //IF target is not found then this return statement will be executed
       return  Integer.MAX_VALUE;
    }


    //return the index of the target element
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run a for loop
        for(int index=0;index <arr.length;index++){
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