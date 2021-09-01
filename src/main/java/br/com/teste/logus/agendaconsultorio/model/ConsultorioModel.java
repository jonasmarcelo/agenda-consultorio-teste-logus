package br.com.teste.logus.agendaconsultorio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author jonas marcelo
 */
@Entity(name="consultorio")
public class ConsultorioModel {

    @Id
    private Integer codigo;

    @Column(nullable = false, length = 50)
    private Integer numero;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
