package Exercicio04Abril;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class User {
	
	private String[] name = new String[1000];
	private String[] email = new String[1000];
	private int[] id = new int[1000];
	
	private int nam = 0;
	private int emai = 0;
	private int ide = 0;
	private int j = -1;
	private int r = 1;
	private int x = 0;

//nome	
	public String getName() {
		return name[nam];
	}
	
	public void setName(String nome) {
		this.name[nam] = nome;
		nam+=1;
	}
//email	
	public String getEmail() {
		return email[emai];
	}
	
	public void setEmail(String email) {
		this.email[emai] = email;
		emai+=1;
	}
//id	
	public int getId() {
		return id[ide];
	}
	
	public void setId() {
		this.id[ide] = r;
		ide += 1;
		r += 1;

	}
	public void getUsers(){
		while (x < this.name.length){
			if(this.name[x] == null){}
			else{
		System.out.println(this.name[x]);
		System.out.println(this.email[x]);
		System.out.println(this.id[x]);
		x += 1;
			}
		}
	}
	
//Users	
	/*public void setUser(User u){
		vetor[y] = u;
		y += 1;
	
	}*/
	
	//public void setUsers(String nome){
		//for(int j = 0; j < vetor.length; i++){
			//name[j]=this.nome;
//		}
	//}
		
	/*public void getUsers(){
		return Users;
	}*/
	
//Manipulacao de arquivos
	
	void criar(){
		java.io.File diretorio = new java.io.File("C:\\Git");
		
		boolean statusDir = diretorio.mkdir();
		System.out.println(statusDir);
		
		String arq = "arquivo.txt";
		
		java.io.File arquivo = new java.io.File(diretorio,arq);
		
		try {
			boolean statusArq = arquivo.createNewFile();
			System.out.println(statusArq);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	//fim cria()
	}
	
	
	void escrever(User user){
		File dir = new File("C:\\Git");
		File arq = new File(dir,"User.txt");
		
		try{
			arq.createNewFile();
			FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            
            while(j < nam){
            	printWriter.println(this.name[nam]);
            	printWriter.println(this.email[emai]);   
                printWriter.println(this.id[ide]);
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
	
//fim
}	




	

	

