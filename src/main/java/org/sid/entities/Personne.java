package org.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersonne;

	private String nom;

	private String prenom;

	private String email;

	private String sex;

	private String adresse;

	private Integer age;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "role_personne", joinColumns = @JoinColumn(name = "idPersonne"), inverseJoinColumns = @JoinColumn(name = "idRole"))
	private List<Role> roles;

	@OneToMany(fetch=FetchType.LAZY)
	private List<Experience> experiences;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "technologie_personne", joinColumns = @JoinColumn(name = "idPersonne"), inverseJoinColumns = @JoinColumn(name = "idTechnologie"))
	private List<Technologie> technologies;

}
