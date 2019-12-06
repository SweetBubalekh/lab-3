public class A2 {
    public int i;
    /*private*/public int j;
    //^ В данной строке ошибка связанная с модификаторами доступа

    void setI(int x) {
        this.i = x;
    }

    void setJ(int y) {
        this.j = y;
    }
}
