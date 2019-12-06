public class Main {

    public static void main(String[] args) {
    	Main main = new Main();
    	main.Example1();
    	main.Example2();
    	main.Example3();
    	main.Example4();
    }

    private void Example1() {
		A a = new A();
		B b = new B();
		a.i = 10;
		a.j = 20;
		System.out.println("одержимое объекта superOb: ");
		a.showij();
		System.out.println();

		b.i = 7;
		b.j = 8;
		b.k = 9;
		System.out.println("Содержимое объекта subOb: ");
		b.showij();
		b.showK();

		System.out.println();
		System.out.println("Сумма i, j и k в объекте subOb: ");
		b.sum();
		System.out.println("___________________________________________");
	}

	private void Example2() {
    	B2 b = new B2();

    	b.setI(10);
    	b.setJ(12);

    	b.sum();
    	System.out.println("Сумма равна: " + b.total);
		System.out.println("___________________________________________");
	}

	private void Example3() {
    	BoxWeight b1 = new BoxWeight(10, 20, 15, 34.3);
    	BoxWeight b2 = new BoxWeight(2, 3, 4, 0.076);
    	double vol;
    	vol = b1.volume();
    	System.out.println("Объем первой коробки равен: " + vol);
    	System.out.println("Вес первой коробки равен: " + b1.weight);
    	System.out.println();

    	vol = b2.volume();
    	System.out.println("Объем второй коробки равен: " + vol);
    	System.out.println("Вес второй коробки равен: " + b2.weight);
		System.out.println("___________________________________________");
	}

	private void Example4() {
    	BoxWeight b = new BoxWeight(3, 5, 7, 8.37);
    	Box empty = new Box();
    	double vol;

    	vol = b.volume();
    	System.out.println("Объем коробки №1 равен: " + vol);
    	System.out.println("Вес коробки №1 равен: " + b.weight);
    	System.out.println();

    	empty = b;
    	vol = empty.volume();
    	System.out.println("Объем коробки без параметров равен: " + vol);
		System.out.println("___________________________________________");
	}
}
