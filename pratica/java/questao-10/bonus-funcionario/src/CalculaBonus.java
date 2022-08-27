
public class CalculaBonus {
	private double salario;
	private  String nome;
	
	
	public void bonus() {
		double valorBonus = 0;
		
		if(this.salario <= 1000) {
			valorBonus = (this.salario * 0.2);
			System.out.println("bonús: " + valorBonus);
		}
		
		else if (this.salario > 1000 && this.salario <= 2000) {
			valorBonus = (this.salario * 0.1);
			System.out.println("bonús :" + valorBonus);
			 
		}
		
		else if (this.salario >= 2000) {
			valorBonus = (this.salario *(-0.1));
			System.out.println("desconto: " + valorBonus);
		}
		
		System.out.println("Salário liquido: "+( this.salario + valorBonus) );
		System.out.println(" ");
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
