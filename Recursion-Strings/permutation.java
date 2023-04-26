import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        // Permutations("", "abc");

        // ArrayList<String> ans = PermutationsList("", "abc");
        // System.out.println(ans);
        System.out.println(PermutationsCount("", "abcd"));
    }

    static void Permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            Permutations(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> PermutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(PermutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int PermutationsCount(String p, String up) {
        if (up.isEmpty()) {
            // System.out.println(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + PermutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }

}
