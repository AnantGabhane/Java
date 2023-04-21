package Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 4, 5 };
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexLast(arr, 4, arr.length - 1));
        // findAllIndexes(arr, 4, 0);
        // System.out.println(list);
        ArrayList ans = findAllIndexes(arr, 4, 0, new ArrayList<>());

        System.out.println(ans);
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    // return the index value
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    // find index from last
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    // find all indexes in array and save it in arraylist
    // static = new ArrayList<>();

    static ArrayList findAllIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexes(arr, target, index + 1, list);
    }

    static ArrayList findAllIndexes2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexes2(arr, target, index + 1);
    }
}
