package Exercicio04Abril;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;


public class User {
	
	private String[] name = new String[1000];
	private String[] email= new String[1000];
	private int[] id = new int[1000];
	private int i = 1;
	
//nome	
	public String getName() {
		return name[i];
	}
	
	public void setName(String nome) {
		this.name[i] = nome;
	}
//email	
	public String getEmail() {
		return email[i];
	}
	
	public void setEmail(String email) {
		this.email[i] = email;
	}
//id	
	public int getId() {
		return id[i];
	}
	
	public void setId() {
		
		this.id[i] = i;
		i += 1;
	}
	
	void mostrar(){
		int j = 1; 
		while(j < i){
		JOptionPane.showMessageDialog(null, "Id: "+id[j]+"\nNome: "+name[j]+"\nEmail: "+email[j]);
		j++;
		}
	}
	
	
//Protegido pela lei dos direitos autorais e pela lei de Deus, pq sao Deus sabe como isso funciona 	
	
// 4 e 5 = Manipulacao de arquivos
	
	void escrever(User user){
		File dir = new File("C:\\Git");
		File arq = new File(dir,"User.txt");
		int j = 1;
		
		try{
			arq.createNewFile();
			FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            
            while(j < i){
            	printWriter.println(id[j]+"," +name[j]+ "," +email[j]+";");
            	j++;
            }
           
            
            printWriter.flush();
            printWriter.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	//fim escrever()
	}
	
	
	void ler() {
        File dir = new File("C:\\Git");
        File arq = new File(dir, "User.txt");
 
        try {
            FileReader fileReader = new FileReader(arq);
 
            BufferedReader bufferedReader = new BufferedReader(fileReader);
 
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                System.out.println(linha);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    //fim ler()
	}
	int x = 0;
	public void delUser(){
		String ide = JOptionPane.showInputDialog("Informe o Id a ser deletado: ");
		int teste = Integer.parseInt(ide);
		
		while(x < id.length){
		if(teste == this.id[x]){
			this.id[x] = 0 ;
			this.name[x] = null;
			this.email[x] = null;
			}
		x += 1;
		}
	
	}
	
//fim
}	




	

	

