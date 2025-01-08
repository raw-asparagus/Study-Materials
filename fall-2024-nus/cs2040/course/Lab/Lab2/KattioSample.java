import java.io.*;
import java.util.*;

// Sample program: reads in a command and two integers, and outputs the result. There can be multiple commands
// For simplicity, only "add" and "subtract" are supported

/* Sample text (also available as sampletext.txt):
add 3 37
subtract 4 32
multiply 2 34
add 4 22

*/
// If entering interactively (ie. not using input redirection), use either Ctrl-D (most devices)
// or Ctrl-Z, followed by Enter (Windows command line) to indicate end of input

public class KattioSample {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        // special case: if the number of lines in input is unknown, use hasMoreTokens
        while (io.hasMoreTokens()) {
            // use getWord for a single word (separated by whitespaces)
            String op = io.getWord();
            // use getInt for integers
            int a = io.getInt();
            int b = io.getInt();
            
            // remember not to use == for strings
            if (op.equals("add")) {
                int ans = a + b;
                io.println(ans);
            }
            else if (op.equals("subtract")) {
                int ans = a - b;
                io.println(ans);
            }
            else {
                io.println("Unsupported command");
            }
        }
        // remember to flush or close at the end of program, or no output will be visible
        io.close();
    }
}

//Original Kattio code copied below
class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
        super(new BufferedOutputStream(System.out));
        r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
        super(new BufferedOutputStream(o));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
        return peekToken() != null;
    }

    public int getInt() {
        return Integer.parseInt(nextToken());
    }

    public double getDouble() {
        return Double.parseDouble(nextToken());
    }

    public long getLong() {
        return Long.parseLong(nextToken());
    }

    public String getWord() {
        return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null)
            try {
                while (st == null || !st.hasMoreTokens()) {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}
