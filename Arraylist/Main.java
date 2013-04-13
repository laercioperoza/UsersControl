import java.util.*;

import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args){

int resp = 1;
	while(resp != 9999) {
		String resposta = JOptionPane.showInputDialog("Escolha uma opcao: \n1 - Add \n2 - List \n3 - RM \n4 - Export \n5 - Import");
		resp = Integer.parseInt(resposta);
	if(resp > 6){
		JOptionPane.showMessageDialog(null, "Opcao invalida, escolha outra !");
		}
		switch(resp){
			case 1:
				 List<User> user = new ArrayList<User>();    
				      String nome = JOptionPane.showInputDialog("Digite o nome");   
				      String email = JOptionPane.showInputDialog("Digite a email");  
				      User u = new User(nome, email);  
				      user.add(u);  
				      System.out.println("Nome: " + u.getNome()); 
				      u.setId();
				break;
		
			case 2:
				break;
				
			case 3:
				//user.delUser();
				
				break;
				
			case 4:
			//	user.escrever();
				break;
				
			case 5:
				break;
			}
		if (JOptionPane.showConfirmDialog(null,"Deseja Sair do Controle de Usuarios?", "Sair?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			break;
			}
		}
	}
}
