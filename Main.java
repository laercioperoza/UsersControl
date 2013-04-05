import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args){
		int resp =  1;
		User user1 = new User();

		
		while(resp != 9999) {
			String resposta = JOptionPane.showInputDialog("Escolha uma opcao: \n1 - Add \n2 - List \n3 - RM \n4 - Export \n5 - Import");
				resp = Integer.parseInt(resposta);
			if(resp  > 5){
				JOptionPane.showMessageDialog(null, "Opcao invalida, escolha outra !");
			}
		switch(resp){
			case 1:

				String nome = JOptionPane.showInputDialog("Informe seu nome: ");
				user1.setNome(nome);		

				String email = JOptionPane.showInputDialog("Informe seu e-mail: ");
				user1.setEmail(email);
				
				user1.setId();
				user1.getUser();
				user1.setUsers(user1);
			
		    case 2:
		    	user1.getUsers();
				
				//user1.setUsers(user1);
				//user1.setId();
				//System.out.println("Cadastro realizado com sucesso !!!");
				//user1.getUser();	
			
		    case 3:
		    	;
		    
		    case 4:
		    	;
		    
		    case 5:
		    	;
				
		}
		if (JOptionPane.showConfirmDialog(null,"Deseja Sair do Controle de Usuarios?", "Sair?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {  
		    break;  
		    //sair  
		}		
		}
	}
}

