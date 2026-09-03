import java.util.ArrayList;

public class Informacoes{

ArrayList<info> alunos = new ArrayList<>();
  class info {

    private String nome;
    private String rgm;
    private String campus;

    public info (String nome, String rgm,String campus){
    this.nome = nome;
    this.rgm = rgm;
    this.campus = campus;

    

}
    @Override
    public String toString(){
        return ("Nome :"+ nome + "/ RGM :" + rgm + "/ Campus"+ campus);
}

}



public void cadastrarAluno(String nome, String rgm, String campus) {

    info aluno = new info(nome,rgm,campus);

    alunos.add(aluno);
}

public void listarAlunos(){

    for(info aluno : alunos){
        System.out.println(aluno);
    }
}



public static void main(String[] args) {
    
    Informacoes informacoes = new Informacoes();

    informacoes.cadastrarAluno("Leonardo","1233455","Paulista");
    informacoes.cadastrarAluno("Vitoria","77889850","São Bernardo");
    informacoes.cadastrarAluno("Jao","79692989","Santo Amaro");

    informacoes.listarAlunos();



}

}