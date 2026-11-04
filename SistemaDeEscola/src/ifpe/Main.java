package ifpe;

public class Main {
	public static void main(String[] args) {
		Escola escolaCentral = new Escola("Escola Central");
		Professor professor1 = new Professor(44, "Bruno Gomes", "Matemática");
		Professor professor2 = new Professor(33, "Joel Lima", "Fisica");
		Professor professor3 = new Professor(66, "Lucio Cesar", "Biologia");
		Professor professor4 = new Professor(88, "Gurgel Farias", "História");
		Professor professor5= new Professor(94, "Fael Santos", "Português");
		Disciplina matematica = new Disciplina("1MA456LO", "Matemática", professor1);
		Disciplina fisica = new Disciplina("2MA458VV3", "Fisica", professor2);
		Disciplina biologia = new Disciplina("3MA4MAVC10", "Biologia", professor3);
		Disciplina historia = new Disciplina("4MA231JUJJ", "Historia", professor4);
		Disciplina portugues = new Disciplina("5MA93021M", "Português", professor5);
		Aluno aluno1 = new Aluno("José Fernando", "EC-GB4521");
		Aluno aluno2 = new Aluno("Maria Clara", "EC-HDSAAA");
		Aluno aluno3 = new Aluno("Carol Maia", "EC-0932JFA");
		Aluno aluno4 = new Aluno("Bruna Lima", "EC-JJNDAS");
		Aluno aluno5 = new Aluno("Gabriela Silva", "EC-JDSAUD");
		Matricula matricula1 = new Matricula(1, aluno1, matematica);
		Matricula matricula2 = new Matricula(2, aluno2, fisica);
		Matricula matricula3 = new Matricula(3, aluno3, biologia);
		Matricula matricula4 = new Matricula(4, aluno4, historia);
		Matricula matricula5 = new Matricula(5, aluno5, portugues);

		escolaCentral.adicionarProfessor(professor1);
		escolaCentral.adicionarProfessor(professor2);
		escolaCentral.adicionarProfessor(professor3);
		escolaCentral.adicionarProfessor(professor4);
		escolaCentral.adicionarProfessor(professor5);
		
		escolaCentral.adicionarAluno(aluno1);
		escolaCentral.adicionarAluno(aluno2);
		escolaCentral.adicionarAluno(aluno3);
		escolaCentral.adicionarAluno(aluno4);
		escolaCentral.adicionarAluno(aluno5);

		escolaCentral.adicionarDisciplina(matematica);
		escolaCentral.adicionarDisciplina(fisica);
		escolaCentral.adicionarDisciplina(biologia);
		escolaCentral.adicionarDisciplina(historia);
		escolaCentral.adicionarDisciplina(portugues);
		
		escolaCentral.adicionarMatricula(matricula1);
		escolaCentral.adicionarMatricula(matricula2);
		escolaCentral.adicionarMatricula(matricula3);
		escolaCentral.adicionarMatricula(matricula4);
		escolaCentral.adicionarMatricula(matricula5);
		
		aluno1.adicionarMatricula(matricula1);
		aluno2.adicionarMatricula(matricula2);
		aluno3.adicionarMatricula(matricula3);
		aluno4.adicionarMatricula(matricula4);
		aluno5.adicionarMatricula(matricula5);
		
		escolaCentral.exibirDados();
	}
}
