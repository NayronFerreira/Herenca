package entidades;

public class Conta {

	private String nome;
	private double saldo;
	private Integer numero;

	public Conta() {

	}

	public Conta(String nome, double saldo, Integer numero) {
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saque(double totalsaque) {
		saldo = saldo - totalsaque;
	}
	
	public void deposito(double totaldeposito) {
		saldo=saldo+totaldeposito;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Conta: "+numero +"\n");
		sb.append("Nome: "+nome +"\n");
		sb.append("Saldo: "+saldo +"\n");
		return sb.toString();
	}
}
