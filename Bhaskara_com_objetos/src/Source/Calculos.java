package Source;

public class Calculos {

	private double a;
	private double b;
	private double c;
	private double delta;
	private double x_1;
	private double x_2;

	public void setABC(java.util.Scanner scanner) {
		System.out.println("inserçao de dados: ");
		System.out.println("--------------------------------");
		System.out.println("digite o valor de a: ");
		this.a = scanner.nextDouble();
		System.out.println("digite o valor de b: ");
		this.b = scanner.nextDouble();
		System.out.println("digite o valor de c: ");
		this.c = scanner.nextDouble();
		System.out.println("--------------------------------");
	}

	private void Delta() {
		double delta = (Math.pow(this.b, 2)) - (4 * this.a * this.c);
		this.delta = delta;
	}

	private void x1_x2() {
		Delta();
		if (this.a == 0) {
			System.out.println("a não pode ser = 0");
			this.x_1 = Double.NaN;
			this.x_2 = Double.NaN;

		} else if (this.delta < 0) {
			System.out.println("O valor de delta não pode ser negativo");
			this.x_1 = Double.NaN;
			this.x_2 = Double.NaN;

		} else {
			double x1 = (-this.b + Math.sqrt(this.delta)) / (2 * this.a);
			double x2 = (-this.b - Math.sqrt(this.delta)) / (2 * this.a);

			this.x_1 = x1;
			this.x_2 = x2;
		}
	}

	public void resultado() {
		x1_x2();
		System.out.println("valor de x_1 = " + this.x_1);
		System.out.println("Valor de x_2 = " + this.x_2);
	}
}
