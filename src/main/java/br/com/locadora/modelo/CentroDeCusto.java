package br.com.locadora.modelo;

// Generated 10/07/2014 16:00:50 by Hibernate Tools 4.0.0

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
 * CentroDeCusto generated by hbm2java
 */
@Entity
@Audited
@Table(name = "CENTRO_DE_CUSTO", catalog = "renovarsistemas")
@AuditTable(value="CENTRO_DE_CUSTO", schema="log", catalog="renovarsistemas")
public class CentroDeCusto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2546865277535737369L;
	private int cenCusId;
	private String cenCusNome;
	private Set<GrupoDeContas> grupoDeContases = new HashSet<GrupoDeContas>(0);

	public CentroDeCusto() {
	}

	public CentroDeCusto(int cenCusId) {
		this.cenCusId = cenCusId;
	}

	public CentroDeCusto(int cenCusId, String cenCusNome,
			Set<GrupoDeContas> grupoDeContases) {
		this.cenCusId = cenCusId;
		this.cenCusNome = cenCusNome;
		this.grupoDeContases = grupoDeContases;
	}

	@Id
	@GeneratedValue
	@Column(name = "CEN_CUS_ID", unique = true, nullable = false)
	public int getCenCusId() {
		return this.cenCusId;
	}

	public void setCenCusId(int cenCusId) {
		this.cenCusId = cenCusId;
	}

	@Column(name = "CEN_CUS_NOME", length = 60)
	public String getCenCusNome() {
		return this.cenCusNome;
	}

	public void setCenCusNome(String cenCusNome) {
		this.cenCusNome = cenCusNome;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "centroDeCusto")
	@NotAudited
	public Set<GrupoDeContas> getGrupoDeContases() {
		return this.grupoDeContases;
	}

	public void setGrupoDeContases(Set<GrupoDeContas> grupoDeContases) {
		this.grupoDeContases = grupoDeContases;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cenCusId;
		result = prime * result
				+ ((cenCusNome == null) ? 0 : cenCusNome.hashCode());
		result = prime * result
				+ ((grupoDeContases == null) ? 0 : grupoDeContases.hashCode());
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
		CentroDeCusto other = (CentroDeCusto) obj;
		if (cenCusId != other.cenCusId)
			return false;
		if (cenCusNome == null) {
			if (other.cenCusNome != null)
				return false;
		} else if (!cenCusNome.equals(other.cenCusNome))
			return false;
		if (grupoDeContases == null) {
			if (other.grupoDeContases != null)
				return false;
		} else if (!grupoDeContases.equals(other.grupoDeContases))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CentroDeCusto [cenCusId=" + cenCusId + "]";
	}

}
