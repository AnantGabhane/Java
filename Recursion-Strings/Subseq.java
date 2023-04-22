import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        System.out.println(Asubseq("", "abc"));
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    // save it in an array list
    static ArrayList<String> Asubseq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = Asubseq(p + ch, up.substring(1));
        ArrayList<String> right = Asubseq(p, up.substring(1));

        left.addAll(right);
        return left;

    }
}
