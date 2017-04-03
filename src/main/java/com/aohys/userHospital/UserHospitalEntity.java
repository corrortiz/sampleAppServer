package com.aohys.userHospital;

import javax.persistence.*;


@Entity
@Table(name = "user_hospital", schema = "sampleDB", catalog = "")
public class UserHospitalEntity {
    private String name;
    private String homeClinic;
    private String phone;
    private String mail;
    private int idUser;
    private String idCard;

    @Basic
    @Column(name = "name", nullable = false, length = 80)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "home_clinic", nullable = false, length = 300)
    public String getHomeClinic() {
        return homeClinic;
    }

    public void setHomeClinic(String homeClinic) {
        this.homeClinic = homeClinic;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 10)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "mail", nullable = true, length = 40)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Id
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "id_card", nullable = false, length = 20)
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHospitalEntity that = (UserHospitalEntity) o;

        if (idUser != that.idUser) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (homeClinic != null ? !homeClinic.equals(that.homeClinic) : that.homeClinic != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
        if (idCard != null ? !idCard.equals(that.idCard) : that.idCard != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (homeClinic != null ? homeClinic.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + idUser;
        result = 31 * result + (idCard != null ? idCard.hashCode() : 0);
        return result;
    }
}
