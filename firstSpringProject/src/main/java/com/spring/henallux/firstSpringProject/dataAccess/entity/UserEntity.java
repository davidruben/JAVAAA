package com.spring.henallux.firstSpringProject.dataAccess.entity;

import org.hibernate.validator.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.springframework.util.StringUtils.isEmpty;


@Entity
@Table(name="client")
public class UserEntity implements UserDetails {

    @Id
    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Authorities")
    private String authorities;

    @Column(name = "Non_expired")
    private Boolean accountNonExpired;

    @Column(name = "Non_locked")
    private Boolean accountNonLocked;

    @Column(name = "Credentials_non_expired")
    private Boolean credentialsNonExpired;

    @Column(name = "Enabled")
    private Boolean enabled;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Prenom")
    private String prenom;

    @Email
    @Column(name = "Email")
    private String email;

    @Size(min = 10 ,max = 15)
    @Column(name = "Téléphone")
    private String telephone;


    @Size(min = 1 ,max = 75)
    @Column(name = "Adresse")
    private String adresse;

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        if(!isEmpty(authorities)) {
            String[] authoritiesAsArray = authorities.split(",");

            for(String authority : authoritiesAsArray) {
                if(!isEmpty(authority)) {
                    grantedAuthorities.add(new SimpleGrantedAuthority(authority));
                }
            }
        }

        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}