package To;

public class CursoTO {

	private int codigo;
	private String nome;
	private String dt_ini;
	private String dt_termino;
	private String horario;
	private int num_vagas;
	private double valor;
	private int num_lab;
	private String reg_software;
	private String des_material;
	private String nome_livro;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDt_Ini() {
		return dt_ini;
	}
	public void setDt_Ini(String dt_ini) {
		this.dt_ini = dt_ini;
	}
	public String getDt_Termino() {
		return dt_termino;
	}
	public void setDt_Termino(String dt_termino) {
		this.dt_termino = dt_termino;
	}	
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getNum_Vagas(){
		return num_vagas;
	}
	public void setNum_Vagas(int num_vagas) {
		this.num_vagas = num_vagas;
	}
	public double getValor(){
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getNum_lab(){
		return num_lab;
	}
	public void setNum_lab(int num_lab) {
		this.num_lab = num_lab;
	}
	public String getReg_software(){
		return reg_software;
	}
	public void setReg_software(String reg_software) {
		this.reg_software = reg_software;
	}
	public String getDes_material(){
		return des_material;
	}
	public void setDes_material(String des_material) {
		this.des_material = des_material;
	}
	public String getNome_livro(){
		return nome_livro;
	}
	public void setNome_livro(String nome_livro) {
		this.nome_livro = nome_livro;
	}
	
}
