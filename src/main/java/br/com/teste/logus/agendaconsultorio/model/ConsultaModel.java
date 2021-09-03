package br.com.teste.logus.agendaconsultorio.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author jonas marcelo
 */
@Entity(name = "consulta")
public class ConsultaModel {

    @Id
    private Integer codigo;

    @Column(nullable = false, length = 50)
    private String nomePaciente;

    @ManyToOne
    @JoinColumn(name="id_medico")
    private MedicoModel medico;

    @ManyToOne
    @JoinColumn(name="id_consultorio")
    private ConsultorioModel consultorio;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public MedicoModel getMedico() {
        return medico;
    }

    public void setMedico(MedicoModel medico) {
        this.medico = medico;
    }

    public ConsultorioModel getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(ConsultorioModel consultorio) {
        this.consultorio = consultorio;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
