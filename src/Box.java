public class Box {
    public double width;
    public double height;
    public double depth;

    Box (Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box(double len) {
        this.width = this.height = this.depth = len;
    }

    public double volume() {
        return this.width * this.height * this.depth;
    }
}
