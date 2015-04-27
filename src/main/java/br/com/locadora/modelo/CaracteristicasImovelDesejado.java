package br.com.locadora.modelo;

// Generated 11/04/2014 14:12:50 by Hibernate Tools 4.0.0

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
 * CaracteristicasImovelDesejado generated by hbm2java
 */
@Audited
@Entity
@Table(name = "CARACTERISTICAS_IMOVEL_DESEJADO", catalog = "renovarsistemas")
@AuditTable(value="CARACTERISTICAS_IMOVEL_DESEJADO", schema="log", catalog="renovarsistemas")
public class CaracteristicasImovelDesejado implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -300546489913994896L;
	private CaracteristicasImovelDesejadoId id;
	private ImovelDesejado imovelDesejado;
	private Caracteristicas caracteristicas;
	private Integer carImoDesQtd;

	public CaracteristicasImovelDesejado() {
	}

	public CaracteristicasImovelDesejado(CaracteristicasImovelDesejadoId id,
			ImovelDesejado imovelDesejado, Caracteristicas caracteristicas) {
		this.id = id;
		this.imovelDesejado = imovelDesejado;
		this.caracteristicas = caracteristicas;
	}

	public CaracteristicasImovelDesejado(CaracteristicasImovelDesejadoId id,
			ImovelDesejado imovelDesejado, Caracteristicas caracteristicas,
			Integer carImoDesQtd) {
		this.id = id;
		this.imovelDesejado = imovelDesejado;
		this.caracteristicas = caracteristicas;
		this.carImoDesQtd = carImoDesQtd;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "carId", column = @Column(name = "CAR_ID", nullable = false)),
			@AttributeOverride(name = "imoDesId", column = @Column(name = "IMO_DES_ID", nullable = false)) })
	public CaracteristicasImovelDesejadoId getId() {
		return this.id;
	}

	public void setId(CaracteristicasImovelDesejadoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IMO_DES_ID", nullable = false, insertable = false, updatable = false)
	public ImovelDesejado getImovelDesejado() {
		return this.imovelDesejado;
	}

	public void setImovelDesejado(ImovelDesejado imovelDesejado) {
		this.imovelDesejado = imovelDesejado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAR_ID", nullable = false, insertable = false, updatable = false)
	public Caracteristicas getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(Caracteristicas caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Column(name = "CAR_IMO_DES_QTD")
	public Integer getCarImoDesQtd() {
		return this.carImoDesQtd;
	}

	public void setCarImoDesQtd(Integer carImoDesQtd) {
		this.carImoDesQtd = carImoDesQtd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((carImoDesQtd == null) ? 0 : carImoDesQtd.hashCode());
		result = prime * result
				+ ((caracteristicas == null) ? 0 : caracteristicas.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((imovelDesejado == null) ? 0 : imovelDesejado.hashCode());
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
		CaracteristicasImovelDesejado other = (CaracteristicasImovelDesejado) obj;
		if (carImoDesQtd == null) {
			if (other.carImoDesQtd != null)
				return false;
		} else if (!carImoDesQtd.equals(other.carImoDesQtd))
			return false;
		if (caracteristicas == null) {
			if (other.caracteristicas != null)
				return false;
		} else if (!caracteristicas.equals(other.caracteristicas))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imovelDesejado == null) {
			if (other.imovelDesejado != null)
				return false;
		} else if (!imovelDesejado.equals(other.imovelDesejado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CaracteristicasImovelDesejado [id=" + id + "]";
	}

}
