/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "login")
@NamedQueries({
    @NamedQuery(name = "Login_1.findAll", query = "SELECT l FROM Login_1 l"),
    @NamedQuery(name = "Login_1.findByUsername", query = "SELECT l FROM Login_1 l WHERE l.username = :username"),
    @NamedQuery(name = "Login_1.findByPassword", query = "SELECT l FROM Login_1 l WHERE l.password = :password")})
public class Login_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Id
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public Login_1() {
    }

    public Login_1(String password) {
        this.password = password;
    }

    public Login_1(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (password != null ? password.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login_1)) {
            return false;
        }
        Login_1 other = (Login_1) object;
        if ((this.password == null && other.password != null) || (this.password != null && !this.password.equals(other.password))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UAS.Login_1[ password=" + password + " ]";
    }
    
}
