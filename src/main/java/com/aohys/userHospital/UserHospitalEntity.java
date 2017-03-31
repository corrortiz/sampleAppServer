package com.aohys.userHospital;

import org.hibernate.id.CompositeNestedGeneratedValueGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user_hospital", schema = "sampleapp", catalog = "")
public class UserHospitalEntity {
    private int iduserHospital;
    private String nombre;
    private String ceula;
    private String telefono;
    private String mail;

    @Id
    @Column(name = "iduser_hospital", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIduserHospital() {
        return iduserHospital;
    }

    public void setIduserHospital(int iduserHospital) {
        this.iduserHospital = iduserHospital;
    }

    @Basic
    @Column(name = "nombre", nullable = true, length = 80)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "ceula", nullable = true, length = 20)
    public String getCeula() {
        return ceula;
    }

    public void setCeula(String ceula) {
        this.ceula = ceula;
    }

    @Basic
    @Column(name = "telefono", nullable = true, length = 10)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "mail", nullable = true, length = 40)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHospitalEntity that = (UserHospitalEntity) o;

        if (iduserHospital != that.iduserHospital) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (ceula != null ? !ceula.equals(that.ceula) : that.ceula != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iduserHospital;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (ceula != null ? ceula.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }


}
