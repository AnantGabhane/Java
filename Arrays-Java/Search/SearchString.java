public class SearchString {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'a';
        System.out.println(isSearch2(name, target));
    }

    static boolean isSearch2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()) {
            if(ch ==target){
                return true;
            }
        }

        return false;
    }

    //
    static boolean isSearch(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if(target == str.charAt(index)){
                return true;
            }
        }

        return false;
    }   
}
//op : true
