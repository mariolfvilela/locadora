package br.com.locadora.modelo;

// Generated 04/09/2014 15:47:45 by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

/**
 * TipoDeParametro generated by hbm2java
 */
@Audited
@Entity
@Table(name = "TIPO_DE_PARAMETRO", catalog = "renovarsistemas")
@AuditTable(value="TIPO_DE_PARAMETRO", schema="log", catalog="renovarsistemas")
public class TipoDeParametro implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1378950863575287614L;
	private TipoDeParametroId id;
	private GrupoDeContas grupoDeContas;
	private Parametro parametro;
	private ParametroReferencia parametroReferencia;

	public TipoDeParametro() {
	}

	public TipoDeParametro(TipoDeParametroId id, Parametro parametro,
			ParametroReferencia parametroReferencia) {
		this.id = id;
		this.parametro = parametro;
		this.parametroReferencia = parametroReferencia;
	}

	public TipoDeParametro(TipoDeParametroId id, GrupoDeContas grupoDeContas,
			Parametro parametro, ParametroReferencia parametroReferencia) {
		this.id = id;
		this.grupoDeContas = grupoDeContas;
		this.parametro = parametro;
		this.parametroReferencia = parametroReferencia;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "parRefId", column = @Column(name = "PAR_REF_ID", nullable = false)),
			@AttributeOverride(name = "parId", column = @Column(name = "PAR_ID", nullable = false)) })
	public TipoDeParametroId getId() {
		return this.id;
	}

	public void setId(TipoDeParametroId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GRU_CON_ID")
	public GrupoDeContas getGrupoDeContas() {
		return this.grupoDeContas;
	}

	public void setGrupoDeContas(GrupoDeContas grupoDeContas) {
		this.grupoDeContas = grupoDeContas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAR_ID", nullable = false, insertable = false, updatable = false)
	public Parametro getParametro() {
		return this.parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAR_REF_ID", nullable = false, insertable = false, updatable = false)
	public ParametroReferencia getParametroReferencia() {
		return this.parametroReferencia;
	}

	public void setParametroReferencia(ParametroReferencia parametroReferencia) {
		this.parametroReferencia = parametroReferencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((grupoDeContas == null) ? 0 : grupoDeContas.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((parametro == null) ? 0 : parametro.hashCode());
		result = prime
				* result
				+ ((parametroReferencia == null) ? 0 : parametroReferencia
						.hashCode());
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
		TipoDeParametro other = (TipoDeParametro) obj;
		if (grupoDeContas == null) {
			if (other.grupoDeContas != null)
				return false;
		} else if (!grupoDeContas.equals(other.grupoDeContas))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (parametro == null) {
			if (other.parametro != null)
				return false;
		} else if (!parametro.equals(other.parametro))
			return false;
		if (parametroReferencia == null) {
			if (other.parametroReferencia != null)
				return false;
		} else if (!parametroReferencia.equals(other.parametroReferencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoDeParametro [id=" + id + "]";
	}

}
