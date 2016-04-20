package Model;

import Dao.AlunoDAO;
import To.AlunoTO;

public class Aluno {
	private int matricula;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String rg;
	private String cpf;
	private String login;
	private String senha;

	public Aluno(int matricula, String nome, String endereco, String telefone, String email, String rg, String cpf,
			String login, String senha) {

		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;

	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void criar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setMatricula(matricula);
		to.setNome(nome);
		to.setEndereco(endereco);
		to.setTelefone(telefone);
		to.setEmail(email);
		to.setRg(rg);
		to.setCpf(cpf);
		to.setLogin(login);
		to.setSenha(senha);
		dao.incluir(to);

	}

	public void atualizar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setMatricula(matricula);
		to.setNome(nome);
		to.setEndereco(endereco);
		to.setTelefone(telefone);
		to.setEmail(email);
		to.setRg(rg);
		to.setCpf(cpf);
		to.setLogin(login);
		to.setSenha(senha);
		dao.atualizar(to);
	}

	public void excluir() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setMatricula(matricula);
		dao.excluir(to);
	}

	public void carregar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = dao.carregar(matricula);
		nome = to.getNome();
		endereco = to.getEndereco();
		telefone = to.getTelefone();
		email = to.getEmail();
		rg = to.getRg();
		cpf = to.getCpf();
		login = to.getLogin();
	}
}
