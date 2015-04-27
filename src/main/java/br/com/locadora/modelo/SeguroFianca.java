package br.com.locadora.modelo;

// Generated 27/08/2014 17:05:49 by Hibernate Tools 4.3.1

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
 * SeguroFianca generated by hbm2java
 */
@Audited
@Entity
@Table(name = "SEGURO_FIANCA", catalog = "renovarsistemas")
@AuditTable(value="SEGURO_FIANCA", schema="log", catalog="renovarsistemas")
public class SeguroFianca implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5131792583869443182L;
	private int segFiaId;
	private Locacao locacao;
	private String segFiaSeguradora;
	private String segFiaCorretar;
	private Date segFiaDataInicio;
	private Date segFiaDataFinal;
	private Double segFiaValorTotal;
	private Integer segFiaPlano;
	private Double segFiaValorParcela;
	private String segFiaPac;
	private String segFiaApolice;
	private Set<Locacao> locacaos = new HashSet<Locacao>(0);

	public SeguroFianca() {
	}

	public SeguroFianca(int segFiaId, Locacao locacao) {
		this.segFiaId = segFiaId;
		this.locacao = locacao;
	}

	public SeguroFianca(int segFiaId, Locacao locacao, String segFiaSeguradora,
			String segFiaCorretar, Date segFiaDataInicio, Date segFiaDataFinal,
			Double segFiaValorTotal, Integer segFiaPlano,
			Double segFiaValorParcela, String segFiaPac, String segFiaApolice,
			Set<Locacao> locacaos) {
		this.segFiaId = segFiaId;
		this.locacao = locacao;
		this.segFiaSeguradora = segFiaSeguradora;
		this.segFiaCorretar = segFiaCorretar;
		this.segFiaDataInicio = segFiaDataInicio;
		this.segFiaDataFinal = segFiaDataFinal;
		this.segFiaValorTotal = segFiaValorTotal;
		this.segFiaPlano = segFiaPlano;
		this.segFiaValorParcela = segFiaValorParcela;
		this.segFiaPac = segFiaPac;
		this.segFiaApolice = segFiaApolice;
		this.locacaos = locacaos;
	}

	@Id
	@GeneratedValue
	@Column(name = "SEG_FIA_ID", unique = true, nullable = false)
	public int getSegFiaId() {
		return this.segFiaId;
	}

	public void setSegFiaId(int segFiaId) {
		this.segFiaId = segFiaId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOC_ID", nullable = false)
	public Locacao getLocacao() {
		return this.locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	@Column(name = "SEG_FIA_SEGURADORA", length = 60)
	public String getSegFiaSeguradora() {
		return this.segFiaSeguradora;
	}

	public void setSegFiaSeguradora(String segFiaSeguradora) {
		this.segFiaSeguradora = segFiaSeguradora;
	}

	@Column(name = "SEG_FIA_CORRETAR", length = 60)
	public String getSegFiaCorretar() {
		return this.segFiaCorretar;
	}

	public void setSegFiaCorretar(String segFiaCorretar) {
		this.segFiaCorretar = segFiaCorretar;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SEG_FIA_DATA_INICIO", length = 23)
	public Date getSegFiaDataInicio() {
		return this.segFiaDataInicio;
	}

	public void setSegFiaDataInicio(Date segFiaDataInicio) {
		this.segFiaDataInicio = segFiaDataInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SEG_FIA_DATA_FINAL", length = 23)
	public Date getSegFiaDataFinal() {
		return this.segFiaDataFinal;
	}

	public void setSegFiaDataFinal(Date segFiaDataFinal) {
		this.segFiaDataFinal = segFiaDataFinal;
	}

	@Column(name = "SEG_FIA_VALOR_TOTAL", precision = 53, scale = 0)
	public Double getSegFiaValorTotal() {
		return this.segFiaValorTotal;
	}

	public void setSegFiaValorTotal(Double segFiaValorTotal) {
		this.segFiaValorTotal = segFiaValorTotal;
	}

	@Column(name = "SEG_FIA_PLANO")
	public Integer getSegFiaPlano() {
		return this.segFiaPlano;
	}

	public void setSegFiaPlano(Integer segFiaPlano) {
		this.segFiaPlano = segFiaPlano;
	}

	@Column(name = "SEG_FIA_VALOR_PARCELA", precision = 53, scale = 0)
	public Double getSegFiaValorParcela() {
		return this.segFiaValorParcela;
	}

	public void setSegFiaValorParcela(Double segFiaValorParcela) {
		this.segFiaValorParcela = segFiaValorParcela;
	}

	@Column(name = "SEG_FIA_PAC", length = 60)
	public String getSegFiaPac() {
		return this.segFiaPac;
	}

	public void setSegFiaPac(String segFiaPac) {
		this.segFiaPac = segFiaPac;
	}

	@Column(name = "SEG_FIA_APOLICE", length = 60)
	public String getSegFiaApolice() {
		return this.segFiaApolice;
	}

	public void setSegFiaApolice(String segFiaApolice) {
		this.segFiaApolice = segFiaApolice;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seguroFianca")
	@NotAudited
	public Set<Locacao> getLocacaos() {
		return this.locacaos;
	}

	public void setLocacaos(Set<Locacao> locacaos) {
		this.locacaos = locacaos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locacao == null) ? 0 : locacao.hashCode());
		result = prime * result
				+ ((locacaos == null) ? 0 : locacaos.hashCode());
		result = prime * result
				+ ((segFiaApolice == null) ? 0 : segFiaApolice.hashCode());
		result = prime * result
				+ ((segFiaCorretar == null) ? 0 : segFiaCorretar.hashCode());
		result = prime * result
				+ ((segFiaDataFinal == null) ? 0 : segFiaDataFinal.hashCode());
		result = prime
				* result
				+ ((segFiaDataInicio == null) ? 0 : segFiaDataInicio.hashCode());
		result = prime * result + segFiaId;
		result = prime * result
				+ ((segFiaPac == null) ? 0 : segFiaPac.hashCode());
		result = prime * result
				+ ((segFiaPlano == null) ? 0 : segFiaPlano.hashCode());
		result = prime
				* result
				+ ((segFiaSeguradora == null) ? 0 : segFiaSeguradora.hashCode());
		result = prime
				* result
				+ ((segFiaValorParcela == null) ? 0 : segFiaValorParcela
						.hashCode());
		result = prime
				* result
				+ ((segFiaValorTotal == null) ? 0 : segFiaValorTotal.hashCode());
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
		SeguroFianca other = (SeguroFianca) obj;
		if (locacao == null) {
			if (other.locacao != null)
				return false;
		} else if (!locacao.equals(other.locacao))
			return false;
		if (locacaos == null) {
			if (other.locacaos != null)
				return false;
		} else if (!locacaos.equals(other.locacaos))
			return false;
		if (segFiaApolice == null) {
			if (other.segFiaApolice != null)
				return false;
		} else if (!segFiaApolice.equals(other.segFiaApolice))
			return false;
		if (segFiaCorretar == null) {
			if (other.segFiaCorretar != null)
				return false;
		} else if (!segFiaCorretar.equals(other.segFiaCorretar))
			return false;
		if (segFiaDataFinal == null) {
			if (other.segFiaDataFinal != null)
				return false;
		} else if (!segFiaDataFinal.equals(other.segFiaDataFinal))
			return false;
		if (segFiaDataInicio == null) {
			if (other.segFiaDataInicio != null)
				return false;
		} else if (!segFiaDataInicio.equals(other.segFiaDataInicio))
			return false;
		if (segFiaId != other.segFiaId)
			return false;
		if (segFiaPac == null) {
			if (other.segFiaPac != null)
				return false;
		} else if (!segFiaPac.equals(other.segFiaPac))
			return false;
		if (segFiaPlano == null) {
			if (other.segFiaPlano != null)
				return false;
		} else if (!segFiaPlano.equals(other.segFiaPlano))
			return false;
		if (segFiaSeguradora == null) {
			if (other.segFiaSeguradora != null)
				return false;
		} else if (!segFiaSeguradora.equals(other.segFiaSeguradora))
			return false;
		if (segFiaValorParcela == null) {
			if (other.segFiaValorParcela != null)
				return false;
		} else if (!segFiaValorParcela.equals(other.segFiaValorParcela))
			return false;
		if (segFiaValorTotal == null) {
			if (other.segFiaValorTotal != null)
				return false;
		} else if (!segFiaValorTotal.equals(other.segFiaValorTotal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SeguroFianca [segFiaId=" + segFiaId + "]";
	}

}
