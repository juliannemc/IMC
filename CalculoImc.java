
public class IMC { 
private String nome; 
private int idade; 
private double altura; 
private double peso; 
private String sexo; 


public IMC(String nome, int idade, double altura, double peso, String sexo) { 
super(); 
this.nome = nome; 
this.idade = idade; 
this.altura = altura; 
this.peso = peso; 
this.sexo = sexo; 
} 


public String calculoIMC (){ 

double calculo; 

calculo = peso / (altura * altura); 


return ("Seu IMC é " + calculo); 
} 

}	
 

--------------------------------------------- 

