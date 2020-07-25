package com.example.springrest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue
	private long id;
	@Column(name="username")
	@NotNull
	private String username;
	@NotNull
	@Column(name="password")
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	  @ManyToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
	    @JoinTable(
	      name = "user_roles",
	      joinColumns =   @JoinColumn(name ="user_id" ),
		 inverseJoinColumns =    @JoinColumn(name = "role_id")
	           )
	    private Set<Roles> roles = new HashSet<>();
	public Set<Roles> getRoles() {
		return roles;
	}
	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}
	  
}
