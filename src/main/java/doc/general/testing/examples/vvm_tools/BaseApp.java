package doc.general.testing.examples.vvm_tools;

public class BaseApp {
    private  int a;
    private  int b;


    public BaseApp(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }
}
