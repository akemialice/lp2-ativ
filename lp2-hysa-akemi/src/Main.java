import java.util.*;

public class Main {
  public static void main(String args[]) {

    Aluno aluno1 = new Aluno("Akemi Alice", "3333");
    aluno1.adicionarMaterias("FIS"); 
    aluno1.adicionarMaterias("MAT");
    
    Aluno aluno2 = new Aluno("Hysabelly Nunes", "1234");
    aluno2.adicionarMaterias("LP2"); 
    aluno2.adicionarMaterias("LP3");
    aluno2.adicionarMaterias("TPO");

    
    System.out.println("============== Utilizando Map ============");
    Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
    mapa.put("Akemi Alice", aluno1);
    mapa.put("Hysabelly Nunes", aluno2);
    System.out.println("Ordem alfabética:");
    System.out.println(mapa);

    
    System.out.println("========== Utilizando Collection ==========");
    System.out.println("Alunos:");
    Collection<Aluno> alunos = mapa.values(); 
    for (Aluno aluno : alunos) {
      System.out.println(aluno);
      System.out.println(aluno.getNumeroMatricula());
    }
    
    
    while(alunos.iterator().hasNext()) {
      if(alunos.contains(aluno1))
        alunos.remove(aluno1);
      break;
    }
    System.out.printf("Aluno(a) removido: "+ aluno1.toString());
   
    
    System.out.println("\n ========== Iterator ========== ");
    System.out.print("Matérias do(a) aluno(a) 1 -> " +aluno1.toString() +": "); 
    Iterator iterator01 = aluno1.getMaterias().iterator();
    mostrarMaterias(iterator01, aluno1);
    
    System.out.print("Matérias do(a) aluno(a) 2 -> " +aluno2.toString() +": "); 
    Iterator iterator02 = aluno2.getMaterias().iterator();
    mostrarMaterias(iterator02, aluno2);

  }
  
 public static void mostrarMaterias(Iterator itr, Aluno aluno){
	    for(var i = aluno.getTamanho(); i > 0; i--) {
	      var elemento = itr.next();
	      if(itr.hasNext()){
	        if(i == 2)
	          System.out.print(elemento + " e ");
	        else
	          System.out.print(elemento + ", ");
	      } else {
	     System.out.print(elemento + ".\n");
	      }
	    	}	
 				}
					}
