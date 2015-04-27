package br.com.locadora.modelo;

// Generated 03/07/2014 08:40:10 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

/**
 * FaixaImpostoDeRenda generated by hbm2java
 */
@Audited
@Entity
@Table(name = "FAIXA_IMPOSTO_DE_RENDA", catalog = "renovarsistemas")
@AuditTable(value="FAIXA_IMPOSTO_DE_RENDA", schema="log", catalog="renovarsistemas")
public class FaixaImpostoDeRenda implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2293937445628966611L;
	private int faiImpRenId;
	private ImpostoDeRenda impostoDeRenda;
	private String faiImpRenFaixa;
	private Double faiImpRenLimiteInferior;
	private Double faiImpRenLimiteSuperior;
	private Double faiImpRenAliquota;
	private Double faiImpRenDeducao;

	public FaixaImpostoDeRenda() {
	}

	public FaixaImpostoDeRenda(int faiImpRenId, ImpostoDeRenda impostoDeRenda) {
		this.faiImpRenId = faiImpRenId;
		this.impostoDeRenda = impostoDeRenda;
	}

	public FaixaImpostoDeRenda(int faiImpRenId, ImpostoDeRenda impostoDeRenda,
			String faiImpRenFaixa, Double faiImpRenLimiteInferior,
			Double faiImpRenLimiteSuperior, Double faiImpRenAliquota,
			Double faiImpRenDeducao) {
		this.faiImpRenId = faiImpRenId;
		this.impostoDeRenda = impostoDeRenda;
		this.faiImpRenFaixa = faiImpRenFaixa;
		this.faiImpRenLimiteInferior = faiImpRenLimiteInferior;
		this.faiImpRenLimiteSuperior = faiImpRenLimiteSuperior;
		this.faiImpRenAliquota = faiImpRenAliquota;
		this.faiImpRenDeducao = faiImpRenDeducao;
	}

	@Id
	@GeneratedValue
	@Column(name = "FAI_IMP_REN_ID", unique = true, nullable = false)
	public int getFaiImpRenId() {
		return this.faiImpRenId;
	}

	public void setFaiImpRenId(int faiImpRenId) {
		this.faiImpRenId = faiImpRenId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IMP_REN_ID", nullable = false)
	public ImpostoDeRenda getImpostoDeRenda() {
		return this.impostoDeRenda;
	}

	public void setImpostoDeRenda(ImpostoDeRenda impostoDeRenda) {
		this.impostoDeRenda = impostoDeRenda;
	}

	@Column(name = "FAI_IMP_REN_FAIXA", length = 30)
	public String getFaiImpRenFaixa() {
		return this.faiImpRenFaixa;
	}

	public void setFaiImpRenFaixa(String faiImpRenFaixa) {
		this.faiImpRenFaixa = faiImpRenFaixa;
	}

	@Column(name = "FAI_IMP_REN_LIMITE_INFERIOR", precision = 53, scale = 0)
	public Double getFaiImpRenLimiteInferior() {
		return this.faiImpRenLimiteInferior;
	}

	public void setFaiImpRenLimiteInferior(Double faiImpRenLimiteInferior) {
		this.faiImpRenLimiteInferior = faiImpRenLimiteInferior;
	}

	@Column(name = "FAI_IMP_REN_LIMITE_SUPERIOR", precision = 53, scale = 0)
	public Double getFaiImpRenLimiteSuperior() {
		return this.faiImpRenLimiteSuperior;
	}

	public void setFaiImpRenLimiteSuperior(Double faiImpRenLimiteSuperior) {
		this.faiImpRenLimiteSuperior = faiImpRenLimiteSuperior;
	}

	@Column(name = "FAI_IMP_REN_ALIQUOTA", precision = 53, scale = 0)
	public Double getFaiImpRenAliquota() {
		return this.faiImpRenAliquota;
	}

	public void setFaiImpRenAliquota(Double faiImpRenAliquota) {
		this.faiImpRenAliquota = faiImpRenAliquota;
	}

	@Column(name = "FAI_IMP_REN_DEDUCAO", precision = 53, scale = 0)
	public Double getFaiImpRenDeducao() {
		return this.faiImpRenDeducao;
	}

	public void setFaiImpRenDeducao(Double faiImpRenDeducao) {
		this.faiImpRenDeducao = faiImpRenDeducao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((faiImpRenAliquota == null) ? 0 : faiImpRenAliquota
						.hashCode());
		result = prime
				* result
				+ ((faiImpRenDeducao == null) ? 0 : faiImpRenDeducao.hashCode());
		result = prime * result
				+ ((faiImpRenFaixa == null) ? 0 : faiImpRenFaixa.hashCode());
		result = prime * result + faiImpRenId;
		result = prime
				* result
				+ ((faiImpRenLimiteInferior == null) ? 0
						: faiImpRenLimiteInferior.hashCode());
		result = prime
				* result
				+ ((faiImpRenLimiteSuperior == null) ? 0
						: faiImpRenLimiteSuperior.hashCode());
		result = prime * result
				+ ((impostoDeRenda == null) ? 0 : impostoDeRenda.hashCode());
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
		FaixaImpostoDeRenda other = (FaixaImpostoDeRenda) obj;
		if (faiImpRenAliquota == null) {
			if (other.faiImpRenAliquota != null)
				return false;
		} else if (!faiImpRenAliquota.equals(other.faiImpRenAliquota))
			return false;
		if (faiImpRenDeducao == null) {
			if (other.faiImpRenDeducao != null)
				return false;
		} else if (!faiImpRenDeducao.equals(other.faiImpRenDeducao))
			return false;
		if (faiImpRenFaixa == null) {
			if (other.faiImpRenFaixa != null)
				return false;
		} else if (!faiImpRenFaixa.equals(other.faiImpRenFaixa))
			return false;
		if (faiImpRenId != other.faiImpRenId)
			return false;
		if (faiImpRenLimiteInferior == null) {
			if (other.faiImpRenLimiteInferior != null)
				return false;
		} else if (!faiImpRenLimiteInferior
				.equals(other.faiImpRenLimiteInferior))
			return false;
		if (faiImpRenLimiteSuperior == null) {
			if (other.faiImpRenLimiteSuperior != null)
				return false;
		} else if (!faiImpRenLimiteSuperior
				.equals(other.faiImpRenLimiteSuperior))
			return false;
		if (impostoDeRenda == null) {
			if (other.impostoDeRenda != null)
				return false;
		} else if (!impostoDeRenda.equals(other.impostoDeRenda))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FaixaImpostoDeRenda [faiImpRenId=" + faiImpRenId + "]";
	}

}
