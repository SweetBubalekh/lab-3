public class B2 extends A2 {
    public int total;

    void sum() {
        this.total = i + j;
        //          ^ переменная j не может быть использована
    }
}
