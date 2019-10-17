/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "curriculum_vitae")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CurriculumVitae.findAll", query = "SELECT c FROM CurriculumVitae c")
    , @NamedQuery(name = "CurriculumVitae.findByNroCv", query = "SELECT c FROM CurriculumVitae c WHERE c.nroCv = :nroCv")
    , @NamedQuery(name = "CurriculumVitae.findByNombre", query = "SELECT c FROM CurriculumVitae c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CurriculumVitae.findByApellido", query = "SELECT c FROM CurriculumVitae c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "CurriculumVitae.findByEdad", query = "SELECT c FROM CurriculumVitae c WHERE c.edad = :edad")
    , @NamedQuery(name = "CurriculumVitae.findBySexo", query = "SELECT c FROM CurriculumVitae c WHERE c.sexo = :sexo")
    , @NamedQuery(name = "CurriculumVitae.findByEmail", query = "SELECT c FROM CurriculumVitae c WHERE c.email = :email")
    , @NamedQuery(name = "CurriculumVitae.findByNroContacto", query = "SELECT c FROM CurriculumVitae c WHERE c.nroContacto = :nroContacto")
    , @NamedQuery(name = "CurriculumVitae.findByNombreRefLab", query = "SELECT c FROM CurriculumVitae c WHERE c.nombreRefLab = :nombreRefLab")
    , @NamedQuery(name = "CurriculumVitae.findByNroRefLab", query = "SELECT c FROM CurriculumVitae c WHERE c.nroRefLab = :nroRefLab")
    , @NamedQuery(name = "CurriculumVitae.findByEstudios", query = "SELECT c FROM CurriculumVitae c WHERE c.estudios = :estudios")
    , @NamedQuery(name = "CurriculumVitae.findByExperiencia", query = "SELECT c FROM CurriculumVitae c WHERE c.experiencia = :experiencia")})
public class CurriculumVitae implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nro_cv")
    private Integer nroCv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 30)
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "sexo")
    private Character sexo;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Column(name = "nro_contacto")
    private Integer nroContacto;
    @Size(max = 50)
    @Column(name = "nombre_ref_lab")
    private String nombreRefLab;
    @Column(name = "nro_ref_lab")
    private Integer nroRefLab;
    @Size(max = 255)
    @Column(name = "estudios")
    private String estudios;
    @Size(max = 255)
    @Column(name = "experiencia")
    private String experiencia;

    public CurriculumVitae() {
    }

    public CurriculumVitae(Integer nroCv) {
        this.nroCv = nroCv;
    }

    public CurriculumVitae(Integer nroCv, String nombre) {
        this.nroCv = nroCv;
        this.nombre = nombre;
    }
    
    

    public Integer getNroCv() {
        return nroCv;
    }

    public void setNroCv(Integer nroCv) {
        this.nroCv = nroCv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNroContacto() {
        return nroContacto;
    }

    public void setNroContacto(Integer nroContacto) {
        this.nroContacto = nroContacto;
    }

    public String getNombreRefLab() {
        return nombreRefLab;
    }

    public void setNombreRefLab(String nombreRefLab) {
        this.nombreRefLab = nombreRefLab;
    }

    public Integer getNroRefLab() {
        return nroRefLab;
    }

    public void setNroRefLab(Integer nroRefLab) {
        this.nroRefLab = nroRefLab;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroCv != null ? nroCv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurriculumVitae)) {
            return false;
        }
        CurriculumVitae other = (CurriculumVitae) object;
        if ((this.nroCv == null && other.nroCv != null) || (this.nroCv != null && !this.nroCv.equals(other.nroCv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.CurriculumVitae[ nroCv=" + nroCv + " ]";
    }
    
}
