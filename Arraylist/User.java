import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


import javax.swing.JOptionPane;


public class User {	
	private String[]  nome = new String[1000];
	private String[] email= new String[1000];
	private int[] id = new int[1000];
	private int i = 1;

public User (String nome, String email){
	this.nome[i] = nome;
	this.email[i] = email;
	}
//nome
public String getNome() {   
	return nome[i];   
}  
public void setNome(String nome) {   
	this.nome[i] = nome;   
}
//email 
public String getEmail() {   
   return nome[i];   
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

}