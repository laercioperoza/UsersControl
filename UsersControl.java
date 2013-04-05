package Exercicio04Abril;

import java.util.Scanner;

public class UsersControl {
	public static void main(String[] args){
		Scanner rd = new Scanner(System.in);
		String teclado;
		int resp =  1;
		User user1 = new User();

		
		while(resp != 9999) {
		System.out.println("  Escolha uma opcao:  ");
		System.out.println("      1 - Add 	    ");
		System.out.println("      2 - List      ");
		System.out.println("      3 - RM        ");
		System.out.println("      4 - Export    ");
		System.out.println("      5 - Import    ");
		
		resp = rd.nextInt();
		if(resp  > 5){
			System.out.println("Opção invalida, escolha outra !");
		}
		switch(resp){
			case 1:

				System.out.println("Informe seu nome: ");
				//teclado = rd.nextLine();
				teclado = "laercio";
				user1.setNome(teclado);		

				System.out.println("Informe seu e-mail: ");
				teclado = rd.nextLine();
				user1.setEmail(teclado);
				
				user1.setId();
				user1.getUser();
				user1.setUsers(user1);
			
		    case 2:
		    	user1.getUsers();
				
				
		}
		
		
			
		

		

		
		//user1.setUsers(user1);
		//user1.setId();
		//System.out.println("Cadastro realizado com sucesso !!!");
		//user1.getUser();
		
	}
	}
}

