package CIET;

public class Withparameter {
	void god(String name) {
		System.out.println("name :" + name);
	}
	public static void main(String[] args) {
		Withparameter w = new Withparameter();
		w.god("lavanya");
		w.god("Dakshanya");
		w.god("Susmitha");
		w.god("sree");
		System.out.println();
	}

}
