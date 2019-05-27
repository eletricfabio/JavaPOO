package TrabalhoPoo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExecutaConta {


                
        public static void mostrarCliente (Cadastro obj) {
			System.out.println("\nDados do Cliente: " + obj.getCpf() + obj.getNome());
        }
	
		
		public static void main(String[] args) {
				
				
		Scanner s = new Scanner(System.in);
		Scanner input = new Scanner( System.in );
		
		Cadastro cad_PF = new Cadastro(null, null, null, 0, 0, 0);
		cad_PF.setCpf("011781205692");
		cad_PF.setNome("Fábio Vieira dos Santos");
		cad_PF.setInt(35);
		
		System.out.println("\nDigite sua conta: ");
		String conta = s.nextLine();
		
		System.out.println("\nEntre com um valor de deposito: " + "R$");
		double deposito = s.nextDouble();
		
		Conta minhaConta = new Conta();
		minhaConta.setDono(conta);
		minhaConta.Deposito(deposito);
		
         
		System.out.println("\nDigite um valor de saque: " + "R$");
                double sacar = s.nextDouble();
                         
                System.out.println("\nDigite o valor do empréstimo");
		double solicitar_emprestimo = s.nextDouble();
                
                System.out.println("\nDigite o valor do TED");
		double Ted = s.nextDouble();
                
                System.out.println("\nDigite data para realizar o TED");
		String Data = input.nextLine();
                
                System.out.println("\nDigite o CPF da conta destino");
		String CPF = input.nextLine();
                
                System.out.println("\nDigite O banco de Origem");
		String Banco_Ori = input.nextLine();
                
                System.out.println("\nDigite O banco de Destino");
		String Banco_Dest = input.nextLine();
                
                System.out.println("\nDigite a Agência para o TED");
		String Agencia = input.nextLine();
                
                System.out.println("\nDigite a conta para o TED");
		String Conta = input.nextLine();
                         
		
		minhaConta.saca(sacar);
		
		cad_PF.imprimir();
         
         		cad_PF.getCpf();
         		cad_PF.getNome();
         		cad_PF.getIdade();
		
		
		minhaConta.imprimir();
		
		
		 		minhaConta.Ted();
                minhaConta.solicitar_emprestimo(); 
                minhaConta.Pessoal();
    
	}
		
}
