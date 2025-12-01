class acs{
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
public class main1 {
    public static void main(String[] args) {
        acs a = new acs();
        // int x = a.x = 20;
        a.setX(20);
        int x = a.getX();
        System.out.println(x);
    }
}
