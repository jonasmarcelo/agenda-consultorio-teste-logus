package br.com.teste.logus.agendaconsultorio.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author jonas marcelo
 */
@Entity(name = "consulta")
public class ConsultaModel {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
