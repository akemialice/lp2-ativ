import java.util.*;

public class Main {
  public static void main(String args[]) {
    //public - o método main é um método público da classe. Significa que ele pode ser chamado por qualquer outra classe que acesse a classe Teste.
    //static - o método main é um método estático. Isso siginifica que ele é um método da classe e não dos objetos.
    //void - é um método que não retorna nenhum valor. Se fosse um método que retorna por exemplo um inteiro, teria um int no lugar do void.
    //String[] args - o método main recebe como parâmetro um vetor de Strings.

    //Começamos criando um objeto Aluno chamado aluno1, passando como parametro tudo que foi declarado na classe ((String nome, String numeroMatricula, String instrutor, String curso, String semestre, String turno, String instituicao).
    Aluno aluno1 = new Aluno("Akemi Alice", "12345", "Profº Márcio","Medicina Veterinária", "1º semestre", "Manhã", "Universidade Federal de São Paulo");
    //Utilizando o método addMaterias declarado na classe Aluno
    aluno1.addMaterias("Anatomia dos seres vivos"); 
    aluno1.addMaterias("Estudo dos seres vivos");

    //Criamos outro objeto Aluno com o nome aluno2 e também utilizamos o método add matérias, passando 3 matérias.
    
    Aluno aluno2 = new Aluno("Hysabelly Nunes", "67890","Profª Júlia","Nutrição", "2º semestre", "Noite", "Universidade Federal de São Paulo");
    aluno2.addMaterias("Planejamento Alimentar"); 
    aluno2.addMaterias("Técnica Dietética");
    aluno2.addMaterias("Educação Nutricional");
    
    //Aqui utilizamos a interface Map, objeto que mapeia valores para chaves. Utilizamos o TreeMap - classe que implementa a interface Map - Cria um mapa de árvore vazio que será classificado em ordem usando as chaves e permite chaves duplicatas.
    Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
    //Este método é usado para associar o valor especificado à chave especificada neste mapa.
    mapa.put("Akemi Alice", aluno1);
    mapa.put("Hysabelly Nunes", aluno2);
    //Por fim, imprimir na tela o mapa.
    System.out.println(mapa);

    System.out.println("\n");
    System.out.println("========== Ficha Cadastral ==========");
    System.out.println("> Universidade Federal de São Paulo <");
    System.out.println("\n");

    //Aqui utilizamos o Collection, que serve para representar e tratar grupos de dados como uma única unidade, que pode ser chamada coleção, ou collection. Ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.
    //estamos declarando uma variável chamada alunos que somente irá armazenar Aluno nesse espaço.
    Collection<Aluno> alunos = mapa.values(); 
    //Isso é um foreach, ele percorrerá todos os elementos de uma Collection, no caso a collection alunos. E em seguinte é impresso todos os elementos utilizando o get. 
    for(Aluno aluno : alunos) {
      System.out.println("Nome do aluno(a): " + aluno);
      System.out.println("Número da matricula: " + aluno.getNumeroMatricula());
      System.out.println("Instrutor da matéria: " + aluno.getInstrutor());
      System.out.println("Cursando: " + aluno.getCurso());
       System.out.println("Semestre atual: " + aluno.getSemestre());
      System.out.println("Turno: " + aluno.getTurno());
      System.out.println("Matérias inscritas:" + aluno.getMaterias());
      System.out.println("Instituição de ensino: " + aluno.getInstituicao());
      System.out.println("Quantidade de matérias inscrito(a): " + aluno.getTamMat());
      //Aqui estamos fazendo uma busca por index - matéria posição 0
       System.out.println("1º matéria inscrita: " + aluno.buscar(0));
      System.out.println("\n");
    }

     
    //Removendo aluno: Akemi Alice
    //Iterator: percorre as listas
    //O hasNext retorna true enquanto existe proximo elemento na lista, ou seja, é usado para verificar se há algum elemento restante na lista.
    while(alunos.iterator().hasNext()) {
      //o método contains() pesquisa a sequência de caracteres na string fornecida. Ele retorna um valor booleano, então se for true pedimos para remover na lista o aluno1
      if(alunos.contains(aluno1))
        alunos.remove(aluno1);
      break;
    }
  
    System.out.println("===== Alunos(a) removidos: =====");
    System.out.println("\n");
    //toString() Retorna uma representação string do objeto. Em geral, o toString retorna uma string que "textualmente representa" esse objeto.
    System.out.printf(aluno1.toString());

    //Exibindo lista atualizada de alunos
    System.out.println("\n");
    System.out.println("===== Lista atualizada de alunos(a) =====");
    System.out.println("\n");
    System.out.println(mapa);
    System.out.println("\n");

    System.out.println("===== Busca por alunos(a): =====");
    System.out.println("\n");

    //Aqui utilizamos o método estaMatriculado para confirmar se realmente o aluno1 foi excluido da lista.
    System.out.println("O aluno " + aluno1.getNome() + " está matriculado?");
   	System.out.println(aluno1.estaMatriculado(aluno1));
  }
}
