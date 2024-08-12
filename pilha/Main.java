package pilha;

public class Main {

	public static void main(String[] args) {

		StaticStack<Long> numeros = new StaticStack<Long>(5);

		numeros.push(1L);
		numeros.push(2L);
		numeros.push(3L);
		System.out.println(numeros.getData()[0]);
		System.out.println(numeros.getData()[1]);
		System.out.println(numeros.getData()[2]);

		System.out.println(numeros.pop());
		System.out.println(numeros.getData()[2]);
		numeros.clear();
		System.out.println(numeros.getData()[0]);
		System.out.println(numeros.getTop());
	}

}
