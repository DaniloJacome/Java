package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;

	// CONSTRUCTORES
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "(A)";
	}

	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public void imprimir() {
		System.out.println("************");
		System.out.println("CUENTA");
		System.out.println("************");
		System.out.println("numero de cuenta: " + id);
		System.out.println("tipo: " + tipo);
		System.out.println("saldo: USD " + saldo);
	}

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta("00342", "A", 456);
		Cuenta miCuenta2 = new Cuenta("41348", "A", 568);
		miCuenta.imprimir();
		miCuenta2.imprimirConEstilo();
	}
	
	 public void imprimirConEstilo() {
	        System.out.println("***********************");
	        System.out.println("CUENTA BANCARIA CON MI ESTILO");
	        System.out.println("Número de Cuenta: " + id);
	        System.out.println("Tipo de Cuenta: " + tipo);
	        System.out.println("Saldo Disponible: USD " + saldo);
	        System.out.println("***********************");
	    }     

	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
