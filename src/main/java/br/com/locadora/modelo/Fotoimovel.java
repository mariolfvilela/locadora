package br.com.locadora.modelo;

// Generated 11/04/2014 14:12:50 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

/**
 * Fotoimovel generated by hbm2java
 */
@Audited
@Entity
@Table(name = "FOTOIMOVEL", catalog = "renovarsistemas")
@AuditTable(value="FOTOIMOVEL", schema="log", catalog="renovarsistemas")
@NamedQuery(name="mesmoNomeDoArquivo",query="select s from Fotoimovel s where s.fotNome = :fotoImovel and s.imovel.imoId = :idImovel")
public class Fotoimovel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6798481463063192872L;
	private int fotId;
	private Imovel imovel;
	private String fotNome;
	private String fotArquivo;
	private Boolean fotWeb;

	public Fotoimovel() {
	}

	public Fotoimovel(int fotId, Imovel imovel, String fotNome) {
		this.fotId = fotId;
		this.imovel = imovel;
		this.fotNome = fotNome;
	}

	public Fotoimovel(int fotId, Imovel imovel, String fotNome,
			String fotArquivo, Boolean fotWeb) {
		this.fotId = fotId;
		this.imovel = imovel;
		this.fotNome = fotNome;
		this.fotArquivo = fotArquivo;
		this.fotWeb = fotWeb;
	}

	@Id
	@GeneratedValue
	@Column(name = "FOT_ID", unique = true, nullable = false)
	public int getFotId() {
		return this.fotId;
	}

	public void setFotId(int fotId) {
		this.fotId = fotId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IMO_ID", nullable = false)
	public Imovel getImovel() {
		return this.imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	@Column(name = "FOT_NOME", nullable = false, length = 50)
	public String getFotNome() {
		return this.fotNome;
	}

	public void setFotNome(String fotNome) {
		this.fotNome = fotNome;
	}

	@Column(name = "FOT_ARQUIVO", length = 150)
	public String getFotArquivo() {
		return this.fotArquivo;
	}

	public void setFotArquivo(String fotArquivo) {
		this.fotArquivo = fotArquivo;
	}

	@Column(name = "FOT_WEB")
	public Boolean getFotWeb() {
		return this.fotWeb;
	}

	public void setFotWeb(Boolean fotWeb) {
		this.fotWeb = fotWeb;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fotArquivo == null) ? 0 : fotArquivo.hashCode());
		result = prime * result + fotId;
		result = prime * result + ((fotNome == null) ? 0 : fotNome.hashCode());
		result = prime * result + ((fotWeb == null) ? 0 : fotWeb.hashCode());
		result = prime * result + ((imovel == null) ? 0 : imovel.hashCode());
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
		Fotoimovel other = (Fotoimovel) obj;
		if (fotArquivo == null) {
			if (other.fotArquivo != null)
				return false;
		} else if (!fotArquivo.equals(other.fotArquivo))
			return false;
		if (fotId != other.fotId)
			return false;
		if (fotNome == null) {
			if (other.fotNome != null)
				return false;
		} else if (!fotNome.equals(other.fotNome))
			return false;
		if (fotWeb == null) {
			if (other.fotWeb != null)
				return false;
		} else if (!fotWeb.equals(other.fotWeb))
			return false;
		if (imovel == null) {
			if (other.imovel != null)
				return false;
		} else if (!imovel.equals(other.imovel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fotoimovel [fotId=" + fotId + "]";
	}

}
