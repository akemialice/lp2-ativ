import java.util.*;
/*
Akemi Alice - SP304484X
Hysabelly Nunes - SP3044742 
*/

//Iniciamos declarando a classe aluno, e em seguida os 9 atributos com o modificador de acesso PRIVATE, eles poderao ser acessados apenas pela classe Aluno.
public class Aluno {
private String nome;
private String numeroMatricula;
private String instrutor;
private String turno;
private String curso;
private String semestre;
private String instituicao;
  //inicializando uma lista
	private List<String> materias; 
  // HashSet implementa a interface Set, permitindo as operações básicas como adicionar, remover, conter e dimensionar
	private Set<Aluno> alunos = new HashSet<>();


  Aluno(String nome, String numeroMatricula, String instrutor, String curso, String semestre, String turno, String instituicao) {
      //Utilizamos uma exceção para caso o nome seja nulo
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
    //referencias
	    this.nome = nome;
	    this.turno = turno;
    	    this.curso = curso;
            this.semestre = semestre;
            this.instituicao = instituicao;
	    this.numeroMatricula = numeroMatricula;
	    this.instrutor = instrutor;
    //Utilizamos o ArrayList que faz parte dos collections, a diferença entre um array embutido e um ArrayListem Java, é que o tamanho de um array não pode ser modificado (se você quiser adicionar ou remover elementos de/para um array, você tem que criar um novo). Enquanto os elementos podem ser adicionados e removidos de um ArrayListsempre que você quiser.
	    this.materias = new ArrayList<String>();
	    }

    // nome  
  	public String getNome() {
		return nome;
	}
	
	  public void addMaterias(String materia) {
		    materias.add(materia);
		  }

    //método adicionado matérias - MET addMaterias
	  public void addMaterias(List<String> todasMaterias) {
			  materias.addAll(todasMaterias); 
		  } 
  
    // método para remover matérias 
	  public void removerMaterias() {
			  materias.clear();
		  }

	  public List<String> getMaterias() {
		    return materias;
		  }

    // método para retornar a quantidade de matérias
	  public int getTamMat() {
		    return materias.size();
		  }

    // retornar nome
	  public String toString() {
		   return this.nome;
		  }
   
    // método para retornar o número da matrícula
	  public String getNumeroMatricula() {
		    return this.numeroMatricula;
		  }

    // método para retornar o instrutor da matéria
	  public String getInstrutor() {
		    return this.instrutor;
		  }

    // método para retornar o turno do aluno
	  public String getTurno() {
		    return this.turno;
		  }

    // método para retornar o instituição do aluno
	  public String getInstituicao() {
		    return this.instituicao;
		  }

    // método para retornar o curso do aluno
	  public String getCurso() {
		    return this.curso;
		  }
  
    // método para retornar o semestre do aluno
	  public String getSemestre() {
		    return this.semestre;
		  }

    // método para retornar se o aluno está matriculado -> o método contains() pesquisa a sequência de caracteres na string fornecida.
		public boolean estaMatriculado(Aluno aluno) {
			return this.alunos.contains(aluno);
		  }

    // buscando matéria por index, então é so colocar como parametro o index para buscar em materias.
  		public String buscar(int index) {
			return materias.get(index);
      }
		}
      
