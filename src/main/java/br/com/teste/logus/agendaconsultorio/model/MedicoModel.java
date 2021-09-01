package br.com.teste.logus.agendaconsultorio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author jonas marcelo
 */
@Entity(name="medico")
public class MedicoModel {

    @Id
    private Integer codigo;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 20)
    private String crm;

    @Column(nullable = false, length = 2)
    private Integer idade;

    @Column(nullable = false, length = 50)
    private String especialidade;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
