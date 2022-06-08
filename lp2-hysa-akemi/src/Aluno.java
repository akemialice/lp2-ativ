import java.util.*;

public class Aluno {
	private String nome;
	private String numeroMatricula;
	private List<String> materias; 
	
	  Aluno(String nome, String numeroMatricula) {
		  if (nome == null) {
				throw new NullPointerException("Nome não pode ser nulo");
			}
	    this.nome = nome;
	    this.numeroMatricula = numeroMatricula;
	    this.materias = new ArrayList<String>();
	  }
	  
	  public void adicionarMaterias(String materia) {
		    materias.add(materia);
		  }

	  public void addMaterias(List<String> materiasNovas) {
			  materias.addAll(materiasNovas); 
		  }

	  public void removerTodosElementos() {
			  materias.clear();
		  }

	  public List<String> getMaterias() {
		    return materias;
		  }
	  public String toString() {
		   return this.nome;
		  }
		  
	  public String getNumeroMatricula() {
		    return this.numeroMatricula;
		  }

	  public int getTamanho() {
		    return materias.size();
		  }
		}

