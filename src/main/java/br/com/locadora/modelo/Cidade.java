package br.com.locadora.modelo;

// Generated 11/04/2014 14:12:50 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

/**
 * Cidade generated by hbm2java
 */
@Entity
@Audited
@Table(name = "CIDADE", catalog = "renovarsistemas")
@AuditTable(value="CIDADE", schema="log", catalog="renovarsistemas")
public class Cidade implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2167216938414180436L;
	private int cidId;
	private String cidNome;
	private String cidUf;
	private String cidCodigoIbge;
	private Set<EnderecoImovelDesejado> enderecoImovelDesejados = new HashSet<EnderecoImovelDesejado>(
			0);
	private Set<Endereco> enderecos = new HashSet<Endereco>(0);

	public Cidade() {
	}

	public Cidade(int cidId, String cidNome) {
		this.cidId = cidId;
		this.cidNome = cidNome;
	}

	public Cidade(int cidId, String cidNome, String cidUf,
			String cidCodigoIbge,
			Set<EnderecoImovelDesejado> enderecoImovelDesejados,
			Set<Endereco> enderecos) {
		this.cidId = cidId;
		this.cidNome = cidNome;
		this.cidUf = cidUf;
		this.cidCodigoIbge = cidCodigoIbge;
		this.enderecoImovelDesejados = enderecoImovelDesejados;
		this.enderecos = enderecos;
	}

	@Id
	@GeneratedValue
	@Column(name = "CID_ID", unique = true, nullable = false)
	public int getCidId() {
		return this.cidId;
	}

	public void setCidId(int cidId) {
		this.cidId = cidId;
	}

	@Column(name = "CID_NOME",unique=true, nullable = false, length = 80)
	public String getCidNome() {
		return this.cidNome;
	}

	public void setCidNome(String cidNome) {
		this.cidNome = cidNome;
	}

	@Column(name = "CID_UF", length = 2)
	public String getCidUf() {
		return this.cidUf;
	}

	public void setCidUf(String cidUf) {
		this.cidUf = cidUf;
	}

	@Column(name = "CID_CODIGO_IBGE", length = 7)
	public String getCidCodigoIbge() {
		return this.cidCodigoIbge;
	}

	public void setCidCodigoIbge(String cidCodigoIbge) {
		this.cidCodigoIbge = cidCodigoIbge;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cidade")
	@NotAudited
	public Set<EnderecoImovelDesejado> getEnderecoImovelDesejados() {
		return this.enderecoImovelDesejados;
	}

	public void setEnderecoImovelDesejados(
			Set<EnderecoImovelDesejado> enderecoImovelDesejados) {
		this.enderecoImovelDesejados = enderecoImovelDesejados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cidade")
	@NotAudited
	public Set<Endereco> getEnderecos() {
		return this.enderecos;
	}

	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cidCodigoIbge == null) ? 0 : cidCodigoIbge.hashCode());
		result = prime * result + cidId;
		result = prime * result + ((cidNome == null) ? 0 : cidNome.hashCode());
		result = prime * result + ((cidUf == null) ? 0 : cidUf.hashCode());
		result = prime
				* result
				+ ((enderecoImovelDesejados == null) ? 0
						: enderecoImovelDesejados.hashCode());
		result = prime * result
				+ ((enderecos == null) ? 0 : enderecos.hashCode());
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
		Cidade other = (Cidade) obj;
		if (cidCodigoIbge == null) {
			if (other.cidCodigoIbge != null)
				return false;
		} else if (!cidCodigoIbge.equals(other.cidCodigoIbge))
			return false;
		if (cidId != other.cidId)
			return false;
		if (cidNome == null) {
			if (other.cidNome != null)
				return false;
		} else if (!cidNome.equals(other.cidNome))
			return false;
		if (cidUf == null) {
			if (other.cidUf != null)
				return false;
		} else if (!cidUf.equals(other.cidUf))
			return false;
		if (enderecoImovelDesejados == null) {
			if (other.enderecoImovelDesejados != null)
				return false;
		} else if (!enderecoImovelDesejados
				.equals(other.enderecoImovelDesejados))
			return false;
		if (enderecos == null) {
			if (other.enderecos != null)
				return false;
		} else if (!enderecos.equals(other.enderecos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cidade [cidId=" + cidId + "]";
	}

}