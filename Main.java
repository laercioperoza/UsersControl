
import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args){
int resp = 1;
User user1 = new User();
	while(resp != 9999) {
		String resposta = JOptionPane.showInputDialog("Escolha uma opcao: \n1 - Add \n2 - List \n3 - RM \n4 - Export \n5 - Import");
		resp = Integer.parseInt(resposta);
	if(resp > 6){
		JOptionPane.showMessageDialog(null, "Opcao invalida, escolha outra !");
		}
		switch(resp){
			case 1:
			
				String nome = JOptionPane.showInputDialog("Informe seu nome: ");
				user1.setName(nome);
			
				String email = JOptionPane.showInputDialog("Informe seu e-mail: ");
				user1.setEmail(email);
			
				user1.setId();
				//user1.setUsers(user1);
				
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !!!");
			
				
				break;
		
			case 2:
				
				break;
				
			case 3:
				break;
				
			case 4:
				user1.criar();
				user1.escrever(user1);
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
