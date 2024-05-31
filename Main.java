public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            String out = "";
            if (i % 2 == 0) {
                out += "Baz";
            }
            if (i % 5 == 0) {
                out += "inga!";
            }
            if (out.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(out);
            }
        }
    }
}
