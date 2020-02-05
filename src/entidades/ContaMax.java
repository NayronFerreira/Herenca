package entidades;

public class ContaMax extends Conta {
	
	private double limiteEmp;
	
	public ContaMax() {
		
	}

	public ContaMax(String nome, double saldo, Integer numero, double limiteEmp) {
		super(nome, saldo, numero);
		this.limiteEmp = limiteEmp;
	}

	
	public double getLimiteEmp() {
		return limiteEmp;
	}

	public void setLimiteEmp(double limiteEmp) {
		this.limiteEmp = limiteEmp;
	}
	
	
	public void emprestimo(double totalEmp) {
		if (totalEmp<=limiteEmp) {
			deposito(totalEmp);
			limiteEmp-=totalEmp;
		}else {System.out.println("Seu limite é inferior ao solicitado");}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Conta: "+super.getNumero() +"\n");
		sb.append("Nome: "+super.getNome() +"\n");
		sb.append("Saldo: "+super.getSaldo() +"\n");
		sb.append( "Limite de Empréstimo = " + limiteEmp );
		return sb.toString();
	
	}
	

}
