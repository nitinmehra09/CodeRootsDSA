public class LabeledStatement {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 10; i++) {
        innerLoop:
            for (int j = 0; j < 10; j++) {
                if (i*j > 50) break outerLoop;
                System.out.println(i + " X " +j  + "=" + i*j);
        }
    }
    }
}
