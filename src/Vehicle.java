
public class Vehicle {
	String czyJedzie() {
		return "Pojazd jedzie";
	}

	String jakJedzie(String tekst) {
		return tekst;
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Nie przykazano ¿adnych parametrów");
		} else {
			System.out.println("Przykazano " + args.length + "parametrów");
		}
	}

}
