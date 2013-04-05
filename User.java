package Exercicio04Abril;


public class User {
	
	private User[] vetor = new User[1000];
	
	private String nome;
	private String email;
	private int id = 0;
	private int y = 0;
	private int i = 1;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		
		this.id = i;
		i += 1;
	}
	
	public void setUsers(User u){
		vetor[y] = u;
		y += 1;
	
	}
	public void getUsers(){
	for(int i = 0 ; i < vetor.length; i++){
		if(vetor[i] != null){
	      System.out.println(vetor[i]);
			}
		}
	}
	
	public void getUser(){
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail : " + this.email);
		System.out.println("ID: " + this.id);
		
	}
	}	




	

	

