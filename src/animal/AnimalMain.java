package animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		int atual = 0;
		int ponteiroFinal = 0;
		Animal animalAuxiliar = null;
		String jogar = "sim";
		Scanner sc = new Scanner(System.in);
		Animal baleia = new Animal("baleia","vive na água");
	    List<Animal> animais = new ArrayList<Animal>();
	    animais.add(baleia);
	    
	    while(jogar.intern() == "sim") {
	    	System.out.println("Pense em um animal");
		    sc.next();
		    atual = 0;
	    	for(Animal animal : animais) {
	    		String resposta = null;
	    		Animal novoAnimal = new Animal();
			    System.out.println("O animal que você pensou "+animal.getAcao()+" ?");
			    resposta = sc.next();
			    if(resposta.intern() == "sim") {
			      System.out.println("O animal que você pensou é "+animal.getNome()+" ?");
				  resposta = sc.next();
				  if(resposta.intern() == "sim") {
					 System.out.println("Acertei!");
					 System.out.println("Quer continuar jogando? ");
					 jogar = sc.next();
					 if(jogar.intern() == "sim") {
						   break;
					 }else if(jogar.intern() ==  "nao") {
						   break;
					 }
				  }else if(resposta.intern() == "nao") {
					  System.out.println("Qual animal você pensou? ");
					  novoAnimal.setNome(sc.next());
					  System.out.println("Um(a) "+novoAnimal.getNome()+"_______ mas um(a) "+animal.getNome()+" nao");
					  novoAnimal.setAcao(sc.next());
					  animalAuxiliar = novoAnimal;
					  ponteiroFinal = ponteiroFinal + 1;
					  System.out.println("Vamos continuar jogando? ");
				      jogar = sc.next();
				      if(jogar.intern() == "sim") {
						   break;
					   }else if(jogar.intern() == "nao") {
						   break;
					   }
				  }
			    }else if(resposta.intern() == "nao") {
			       if(atual == ponteiroFinal) {
			    	   System.out.println("Qual animal você pensou? ");
					   novoAnimal.setNome(sc.next());
					   System.out.println("Um(a) "+novoAnimal.getNome()+"_______ mas um(a) "+animal.getNome()+" nao");
					   novoAnimal.setAcao(sc.next());
					   animalAuxiliar = novoAnimal;
					   ponteiroFinal = ponteiroFinal + 1;
					   System.out.println("Vamos continuar jogando? ");
					   jogar = sc.next();
					   if(jogar.intern() == "sim") {
						   break;
					   }
			       }else {
			    	   atual = atual + 1;
			       }
			       
			    }
			    
	    	}
	    	animais.add(animalAuxiliar);
	    	
	    }
        System.out.println("Obrigado por jogar");
	}
    

}
