package pattern.structural.adapter;

public class AdapterPatternDemo {

    int a, b, c, d, e;

    public static void main(String[] args) {
        try {
            System.out.println(new AdapterPatternDemo(1, 2, 3).toString());
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace()[0].getClassName() + ": " + ex.getStackTrace()[0].getMethodName());
        }
    }

    public AdapterPatternDemo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public AdapterPatternDemo(int a, int b, int c, int d, int e) {
        this(a, b, c);
        this.d = d;
        this.e = e;
    }

    @Override
    public String toString() {
        return "AdapterPatternDemo [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + "]";
    }
}
