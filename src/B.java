public class B extends A {
    public int k;

    public void showK() {
        System.out.println("k: " + this.k);
    }

    public void sum() {
        System.out.println("i + j + k: " + ( i + j + this.k));
    }
}
