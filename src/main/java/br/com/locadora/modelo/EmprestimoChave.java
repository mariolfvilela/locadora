package br.com.locadora.modelo;

// Generated 11/04/2014 14:12:50 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

/**
 * EmprestimoChave generated by hbm2java
 */
@Audited
@Entity
@Table(name = "EMPRESTIMO_CHAVE", catalog = "renovarsistemas")
@AuditTable(value="EMPRESTIMO_CHAVE", schema="log", catalog="renovarsistemas")
public class EmprestimoChave implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7921556866026353938L;
	private int empId;
	private Imovel imovel;
	private Funcionario funcionario;
	private Pessoa pessoa;
	private Date empDataEmprestimo;
	private Date empDataDevolucao;
	private Boolean empDevolucao;
	private Date empDataLimiteDevolucao;
	private Date empDataCadastro;
	private String empObservacaoParecer;
	private Boolean empFuncionario;
	private Double empMultaValor;
	private Double empMultaPorcentagem;
	private Boolean empEnteresseImovel;
	private Boolean empEntreFilial;
	private Integer empEntreFilialId;
	private Integer empEnteFilialFuncionario;
	private Set<ChaveNoQuadro> chaveNoQuadros = new HashSet<ChaveNoQuadro>(0);

	public EmprestimoChave() {
	}

	public EmprestimoChave(int empId, Imovel imovel, Funcionario funcionario,
			Pessoa pessoa) {
		this.empId = empId;
		this.imovel = imovel;
		this.funcionario = funcionario;
		this.pessoa = pessoa;
	}

	public EmprestimoChave(int empId, Imovel imovel, Funcionario funcionario,
			Pessoa pessoa, Date empDataEmprestimo, Date empDataDevolucao,
			Boolean empDevolucao, Date empDataLimiteDevolucao,
			Date empDataCadastro, String empObservacaoParecer,
			Boolean empFuncionario,Integer empEnteFilialFuncionario ,Double empMultaValor,
			Double empMultaPorcentagem,Integer empEntreFilialId,Boolean empEntreFilial, Boolean empEnteresseImovel,
			Set<ChaveNoQuadro> chaveNoQuadros) {
		this.empId = empId;
		this.empEntreFilialId=empEntreFilialId;
		this.imovel = imovel;
		this.empEnteFilialFuncionario=empEnteFilialFuncionario;
		this.empEntreFilial=empEntreFilial;
		this.funcionario = funcionario;
		this.pessoa = pessoa;
		this.empDataEmprestimo = empDataEmprestimo;
		this.empDataDevolucao = empDataDevolucao;
		this.empDevolucao = empDevolucao;
		this.empDataLimiteDevolucao = empDataLimiteDevolucao;
		this.empDataCadastro = empDataCadastro;
		this.empObservacaoParecer = empObservacaoParecer;
		this.empFuncionario = empFuncionario;
		this.empMultaValor = empMultaValor;
		this.empMultaPorcentagem = empMultaPorcentagem;
		this.empEnteresseImovel = empEnteresseImovel;
		this.chaveNoQuadros = chaveNoQuadros;
	}

	@Id
	@GeneratedValue
	@Column(name = "EMP_ID", unique = true, nullable = false)
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IMO_ID", nullable = false)
	public Imovel getImovel() {
		return this.imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FUN_PES_ID", nullable = false)
	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PES_ID", nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EMP_DATA_EMPRESTIMO", length = 23)
	public Date getEmpDataEmprestimo() {
		return this.empDataEmprestimo;
	}

	public void setEmpDataEmprestimo(Date empDataEmprestimo) {
		this.empDataEmprestimo = empDataEmprestimo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EMP_DATA_DEVOLUCAO", length = 23)
	public Date getEmpDataDevolucao() {
		return this.empDataDevolucao;
	}

	public void setEmpDataDevolucao(Date empDataDevolucao) {
		this.empDataDevolucao = empDataDevolucao;
	}

	@Column(name = "EMP_DEVOLUCAO")
	public Boolean getEmpDevolucao() {
		return this.empDevolucao;
	}

	public void setEmpDevolucao(Boolean empDevolucao) {
		this.empDevolucao = empDevolucao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EMP_DATA_LIMITE_DEVOLUCAO", length = 23)
	public Date getEmpDataLimiteDevolucao() {
		return this.empDataLimiteDevolucao;
	}

	public void setEmpDataLimiteDevolucao(Date empDataLimiteDevolucao) {
		this.empDataLimiteDevolucao = empDataLimiteDevolucao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EMP_DATA_CADASTRO", length = 23)
	public Date getEmpDataCadastro() {
		return this.empDataCadastro;
	}

	public void setEmpDataCadastro(Date empDataCadastro) {
		this.empDataCadastro = empDataCadastro;
	}
	@Column(name = "EMP_ENTRE_FILIAL_ID")
	public Integer getEmpEntreFilialId() {
		return empEntreFilialId;
	}

	public void setEmpEntreFilialId(Integer empEntreFilialId) {
		this.empEntreFilialId = empEntreFilialId;
	}

	@Column(name = "EMP_OBSERVACAO_PARECER", length = 250)
	public String getEmpObservacaoParecer() {
		return this.empObservacaoParecer;
	}

	public void setEmpObservacaoParecer(String empObservacaoParecer) {
		this.empObservacaoParecer = empObservacaoParecer;
	}

	@Column(name = "EMP_FUNCIONARIO")
	public Boolean getEmpFuncionario() {
		return this.empFuncionario;
	}

	public void setEmpFuncionario(Boolean empFuncionario) {
		this.empFuncionario = empFuncionario;
	}

	@Column(name = "EMP_MULTA_VALOR", precision = 53, scale = 0)
	public Double getEmpMultaValor() {
		return this.empMultaValor;
	}

	public void setEmpMultaValor(Double empMultaValor) {
		this.empMultaValor = empMultaValor;
	}

	@Column(name = "EMP_MULTA_PORCENTAGEM", precision = 53, scale = 0)
	public Double getEmpMultaPorcentagem() {
		return this.empMultaPorcentagem;
	}

	public void setEmpMultaPorcentagem(Double empMultaPorcentagem) {
		this.empMultaPorcentagem = empMultaPorcentagem;
	}
	
	@Column(name = "EMP_ENTRE_FILIAL")
	public Boolean getEmpEntreFilial() {
		return this.empEntreFilial;
	}

	public void setEmpEntreFilial(Boolean empEntreFilial) {
		this.empEntreFilial = empEntreFilial;
	}

	@Column(name = "EMP_ENTERESSE_IMOVEL")
	public Boolean getEmpEnteresseImovel() {
		return this.empEnteresseImovel;
	}

	public void setEmpEnteresseImovel(Boolean empEnteresseImovel) {
		this.empEnteresseImovel = empEnteresseImovel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "emprestimoChave")
	@NotAudited
	public Set<ChaveNoQuadro> getChaveNoQuadros() {
		return this.chaveNoQuadros;
	}

	public void setChaveNoQuadros(Set<ChaveNoQuadro> chaveNoQuadros) {
		this.chaveNoQuadros = chaveNoQuadros;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name = "EMP_ENTRE_FILIAL_FUNCIONARIO")
	public Integer getEmpEnteFilialFuncionario() {
		return empEnteFilialFuncionario;
	}

	public void setEmpEnteFilialFuncionario(Integer empEnteFilialFuncionario) {
		this.empEnteFilialFuncionario = empEnteFilialFuncionario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((chaveNoQuadros == null) ? 0 : chaveNoQuadros.hashCode());
		result = prime * result
				+ ((empDataCadastro == null) ? 0 : empDataCadastro.hashCode());
		result = prime
				* result
				+ ((empDataDevolucao == null) ? 0 : empDataDevolucao.hashCode());
		result = prime
				* result
				+ ((empDataEmprestimo == null) ? 0 : empDataEmprestimo
						.hashCode());
		result = prime
				* result
				+ ((empDataLimiteDevolucao == null) ? 0
						: empDataLimiteDevolucao.hashCode());
		result = prime * result
				+ ((empDevolucao == null) ? 0 : empDevolucao.hashCode());
		result = prime
				* result
				+ ((empEnteresseImovel == null) ? 0 : empEnteresseImovel
						.hashCode());
		result = prime * result
				+ ((empFuncionario == null) ? 0 : empFuncionario.hashCode());
		result = prime * result + empId;
		result = prime
				* result
				+ ((empMultaPorcentagem == null) ? 0 : empMultaPorcentagem
						.hashCode());
		result = prime * result
				+ ((empMultaValor == null) ? 0 : empMultaValor.hashCode());
		result = prime
				* result
				+ ((empObservacaoParecer == null) ? 0 : empObservacaoParecer
						.hashCode());
		result = prime * result
				+ ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((imovel == null) ? 0 : imovel.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmprestimoChave other = (EmprestimoChave) obj;
		if (chaveNoQuadros == null) {
			if (other.chaveNoQuadros != null)
				return false;
		} else if (!chaveNoQuadros.equals(other.chaveNoQuadros))
			return false;
		if (empDataCadastro == null) {
			if (other.empDataCadastro != null)
				return false;
		} else if (!empDataCadastro.equals(other.empDataCadastro))
			return false;
		if (empDataDevolucao == null) {
			if (other.empDataDevolucao != null)
				return false;
		} else if (!empDataDevolucao.equals(other.empDataDevolucao))
			return false;
		if (empDataEmprestimo == null) {
			if (other.empDataEmprestimo != null)
				return false;
		} else if (!empDataEmprestimo.equals(other.empDataEmprestimo))
			return false;
		if (empDataLimiteDevolucao == null) {
			if (other.empDataLimiteDevolucao != null)
				return false;
		} else if (!empDataLimiteDevolucao.equals(other.empDataLimiteDevolucao))
			return false;
		if (empDevolucao == null) {
			if (other.empDevolucao != null)
				return false;
		} else if (!empDevolucao.equals(other.empDevolucao))
			return false;
		if (empEnteresseImovel == null) {
			if (other.empEnteresseImovel != null)
				return false;
		} else if (!empEnteresseImovel.equals(other.empEnteresseImovel))
			return false;
		if (empFuncionario == null) {
			if (other.empFuncionario != null)
				return false;
		} else if (!empFuncionario.equals(other.empFuncionario))
			return false;
		if (empId != other.empId)
			return false;
		if (empMultaPorcentagem == null) {
			if (other.empMultaPorcentagem != null)
				return false;
		} else if (!empMultaPorcentagem.equals(other.empMultaPorcentagem))
			return false;
		if (empMultaValor == null) {
			if (other.empMultaValor != null)
				return false;
		} else if (!empMultaValor.equals(other.empMultaValor))
			return false;
		if (empObservacaoParecer == null) {
			if (other.empObservacaoParecer != null)
				return false;
		} else if (!empObservacaoParecer.equals(other.empObservacaoParecer))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (imovel == null) {
			if (other.imovel != null)
				return false;
		} else if (!imovel.equals(other.imovel))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmprestimoChave [empId=" + empId + "]";
	}

}
