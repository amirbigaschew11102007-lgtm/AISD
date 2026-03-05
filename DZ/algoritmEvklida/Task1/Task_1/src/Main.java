import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String e = s.nextLine();
        String e = "2 5 - 79 + 4 *";
        Stack<String> t = new Stack<>();
        int c = 0;

        t.push("");
        for (int i = 0; i < e.length(); i++) {
            if (e.charAt(i) == ' ') {
                t.push("");
                c++;
            } else {
                String l = t.pop();
                t.push(l + e.charAt(i));
            }
        }

        for (int k = 0; k <= c / 2; k++) {
            int a = n(t.pop());
            int b = n(t.pop());
            char o = t.pop().charAt(0);
            int r = f(a, b, o);
            t.push("" + r);
        }

        System.out.println(t.pop());
    }

    static int n(String x) {
        int v = 0;
        int l = x.length();
        boolean z = false;
        for (int i = 0; i < l; i++) {
            char c = x.charAt(i);
            if (c == '-') {
                z = true;
                continue;
            }
            int d = c - '0';
            int p = 1;
            for (int j = 0; j < l - i - 1; j++) {
                p *= 10;
            }
            v += d * p;
        }
        return z ? -v : v;
    }

    static int f(int x, int y, char o) {
        switch (o) {
            case '+': return x + y;
            case '-': return x - y;
            case '*': return x * y;
            default: return 0;
        }
    }
}
