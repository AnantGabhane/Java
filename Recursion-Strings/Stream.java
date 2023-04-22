public class Stream {
    public static void main(String[] args) {
        System.out.println(skipAppnotApple("baccappldah"));
    }

    // p : processed up: unprocessed
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    // p : processed up: unprocessed
    static String skipit(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipit(up.substring(1));
        } else {
            return ch + skipit(up.substring(1));
        }
    }

    // p : processed up: unprocessed
    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    // skip App not apple
    // p : processed up: unprocessed
    static String skipAppnotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppnotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppnotApple(up.substring(1));
        }
    }
}