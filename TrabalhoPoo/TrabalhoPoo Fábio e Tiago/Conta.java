package TrabalhoPoo;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Conta {

	private String dono;
	private double saldo;
      
        
   Scanner s = new Scanner(System.in);
        

	
	DecimalFormat df = new DecimalFormat("#0.00");

	boolean saca(double valor) {
		if (this.getSaldo() < valor) {
			System.out.println("====================================");
			System.out.println("Saque acima do valor permitido.");
			System.out.println(" O saldo atual disponível: " + "R$ " + df.format (saldo));
			System.out.println("====================================");
			return false;
		}
		else {
			this.saldo = this.getSaldo() - valor;
			System.out.println("\n========================================");
			System.out.println("      Seu saldo atual é: " + "R$ " + df.format (this.saldo));
			System.out.println("========================================");
			return true;
		}
		
	}
		boolean Deposito(double valor) {
			if (valor>0) {
				this.saldo = this.getSaldo() + valor;
				System.out.println("\n====================================");
				System.out.println(" Depósito realizado com sucesso!");
				System.out.println(" Seu saldo de Depósito é: " + "R$ " + df.format (this.saldo));
				System.out.println("====================================");
				return true;
			}
			else {
				System.out.println("========================================");
				System.out.println("    Depósito não realizado!");
				System.out.println("   Seu saldo continua: " + "R$ " + df.format (this.saldo));
				System.out.println("========================================");
				return false;
			}
	}
                
                

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
		
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void Ted(){
        if (this.saldo < 1){
        	System.out.println("\n-----------------------------------");
            System.out.println("Opração negada saldo Insuficiente");
            System.out.println("-----------------------------------");
        } else {
        	System.out.println("\n--------------------------");
            System.out.println("TED realizado com sucesso!");
            
        }
    }
        
        public void imprimir() {
		System.out.println("\nCliente Conta: " + getDono());
		System.out.println("\nSaldo total disponível: " + df.format (getSaldo()));
		
	}
         
        void Pessoal() {
		        if (this.getSaldo() >= 100){
		            System.out.println("O seu seguro foi contratado, parabéns!"); 
		        } else {
		            System.out.println("\nInfelizmente o seu seguro pessoal não foi autorizado:"); 
		        }
			}
				  
        
        public void solicitar_emprestimo(){ 
            if (this.saldo < 500){ 
            	System.out.println("\n--------------------------------------");
                System.out.println("Infelizmente seu emprestimo foi negado"); 
            } else { 
            	System.out.println("\n--------------------------");
                System.out.println("\nFoi autorizado um valor de crédito de até: R$ " + df.format (saldo+300) + 
" *disponível para saque.*"); 
            } 
        } 
        
}