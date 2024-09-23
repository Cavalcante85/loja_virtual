package com.lojavirtual.loja_virtual.models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
@SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq", allocationSize = 1, initialValue = 1)
public class UsuarioModel implements UserDetails {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    private long id;
    private String login;
    private String senha;
    @Temporal(TemporalType.DATE)
    private Date dataAtual;

    @ManyToOne(targetEntity = PessoaModel.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "pessoa_fk"))
    private  PessoaModel pessoa;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "usuario_acesso"
                ,uniqueConstraints = @UniqueConstraint(columnNames = {"usuario_id", "acesso_id"}
                ,name = "unique_acesso_user")
                ,joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id", table = "usuario", unique = false, foreignKey = @ForeignKey(name = "usuario_fk",value = ConstraintMode.CONSTRAINT))
                ,inverseJoinColumns = @JoinColumn(name = "acesso_id", unique = false,referencedColumnName = "id", table = "acesso", foreignKey = @ForeignKey(name = "acesso_fk",value = ConstraintMode.CONSTRAINT))
    )
    private List<AcessoModel>acessos;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.acessos;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }


}
